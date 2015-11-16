package audit;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ffcs.memory.BeanListHandler;
import cn.ffcs.memory.ColumnHandler;
import cn.ffcs.memory.ColumnListHandler;
import cn.ffcs.memory.Memory;
import cn.ffcs.memory.ResultSetHandler;

public class Main {
	public static DBPool dbPool = new DBPool();
	public static Memory memory = new Memory(dbPool.getDataSource());
	public static void main(String[] args) {
		try {
			updateNewJobStatus();
			clearBuildUnitUser();
			clearManagerDepUser();
			clearEntrustUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateNewJobStatus() throws SQLException {
		StringBuilder logStr = new StringBuilder("");
		
		// 对所有fnewjobstatus=1的记录根据fflowid进行分组，并统计每组的记录条数
		String sql = "with f as " 
					+ "( " 
					+ " select FFlowId,COUNT(fflowid) as count "
					+ " from TblProject project "
					+ " where 1=1 and isNull(project.fisDelete,0)=0 "
					+ " and isnull(project.fnewJobStatus,0)=1 "
					+ " and ( project.fifdd is null or project.fifdd=0 ) "
					+ " and isnull(project.fisHistoryProject,0) = 0 " 
					+ " group by FFlowId "
					+ " ) " 
					+ " select FFlowId from f where f.count > 1 ";
		
		List<String> taskIds = memory.query(sql, new ColumnListHandler<String>(String.class), new Object[]{});
		System.out.println("有多条fnewjobstatus=1记录的Tblproject总共有："+taskIds.size()+"个");
		logStr.append("有多条fnewjobstatus=1记录的Tblproject总共有："+taskIds.size()+"个\r\n");
		logStr.append("=====================================================================================\r\n");
		
		for (String taskId : taskIds) {
			String sql2 = " select p.FID "+
				" from TblProject p "+
				" left join tblJobBase j on p.FNewJobId = j.Fsn "+
				" where FFlowId = ? and FNewJobStatus = 1 "+
				" order by ForderDate desc ";
			List<String> ps = memory.query(sql2, new ColumnListHandler<String>(String.class), new Object[]{taskId});
			System.out.println("当前正在处理fflowid="+taskId+" 的评审任务,其有"+ps.size()+" 条当前步骤记录，其中有"+(ps.size()-1)+" 条需要被修改。");
			logStr.append("当前正在处理fflowid="+taskId+" 的评审任务,其有"+ps.size()+" 条当前步骤记录，其中有"+(ps.size()-1)+" 条需要被修改。\r\n");
			int count2 = 0;
			for (int i = 0; i < ps.size(); i++) {
				if(i==0){
					System.out.println("正确的记录的fid="+ps.get(i));
					logStr.append("正确的记录的fid="+ps.get(i)+"\r\n");
				}else{
					String updateSql = " update tblproject set fnewjobstatus = 0 where fid = ? ";
					int j = memory.update(updateSql, new String[]{ps.get(i)});
					System.out.println("成功处理"+j+"条，其fid="+ps.get(i));
					logStr.append("成功处理"+j+"条，其fid="+ps.get(i)+"\r\n");
					count2++;
				}
			}
			System.out.println("成功处理完成："+count2+"个");
			logStr.append("成功处理完成："+count2+"个。\r\n");
			logStr.append("===============================================================================================\r\n");
		}
		
		// 将日志记录写入到当前程序所在的目录下
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhssmm");
		File logFile = new File(format.format(new Date())+".log");
		
		// 根据转码后的内容生成新的文件
		try {
			OutputStream outputStream = new FileOutputStream(logFile);
			OutputStreamWriter outWrite = new OutputStreamWriter(outputStream,"GBK");
			outWrite.write(logStr.toString());
			outWrite.close();
			System.out.println("写入日志文件成功！");
		} catch (FileNotFoundException e) {
			System.out.println("日志文件创建失败！");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("设置字符编码为GBK失败");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件写入失败！");
			e.printStackTrace();
		}
	}
	
	public static void clearBuildUnitUser() throws SQLException{
		// 建设单位人员id,建设单位id,登陆用户id 
		String sql1 = " select fsn,funitFsn,femployeeSn from TblBuildUnitUser ";
		List<String[]> a = memory.query(sql1, new IdsHandler(), new Object[]{});
		for (String[] s : a) {
			String sql2 = " select fsn from TblBuildUnit where fsn = ? ";
			String funitFsn = memory.query(sql2, new ColumnHandler<String>(String.class), new Object[]{s[1]});
			if(funitFsn == null){ // 如果建设单位为null
				memory.update(" delete from TblBuildUnitUser where fsn = ? ", new Object[]{s[0]});
				memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
			}else{
				String sql3 = " select femployeesn from TblEmployeeInfo where femployeesn = ? ";
				String femployeeSn = memory.query(sql3, new ColumnHandler<String>(String.class), new Object[]{s[2]});
				if(femployeeSn == null){
					memory.update(" delete from TblBuildUnitUser where fsn = ? ", new Object[]{s[0]});
					memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
				}
			}
		}
		System.out.println("建设单位人员清理完成！");
	}
	
	public static void clearManagerDepUser(){
		String sql1 = " select fsn,fmanagerFsn as funitFsn,femployeeSn from TblManagerDepUser ";
		List<String[]> a = memory.query(sql1, new IdsHandler(), new Object[]{});
		for (String[] s : a) {
			String sql2 = " select fsn from TblManagerDep where fsn = ? ";
			String funitFsn = memory.query(sql2, new ColumnHandler<String>(String.class), new Object[]{s[1]});
			if(funitFsn == null){ // 如果建设单位为null
				memory.update(" delete from TblManagerDepUser where fsn = ? ", new Object[]{s[0]});
				memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
			}else{
				String sql3 = " select femployeesn from TblEmployeeInfo where femployeesn = ? ";
				String femployeeSn = memory.query(sql3, new ColumnHandler<String>(String.class), new Object[]{s[2]});
				if(femployeeSn == null){
					memory.update(" delete from TblManagerDepUser where fsn = ? ", new Object[]{s[0]});
					memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
				}
			}
		}
		System.out.println("主管单位人员清理完成！");
	}
	
	public static void clearEntrustUser(){
		String sql1 = " select fsn,fentrustFsn as funitFsn,femployeeSn from TblEntrustUnitUser ";
		List<String[]> a = memory.query(sql1, new IdsHandler(), new Object[]{});
		for (String[] s : a) {
			String sql2 = " select fsn from TblEntrustUnit where fsn = ? ";
			String funitFsn = memory.query(sql2, new ColumnHandler<String>(String.class), new Object[]{s[1]});
			if(funitFsn == null){ // 如果建设单位为null
				memory.update(" delete from TblEntrustUnitUser where fsn = ? ", new Object[]{s[0]});
				memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
			}else{
				String sql3 = " select femployeesn from TblEmployeeInfo where femployeesn = ? ";
				String femployeeSn = memory.query(sql3, new ColumnHandler<String>(String.class), new Object[]{s[2]});
				if(femployeeSn == null){
					memory.update(" delete from TblEntrustUnitUser where fsn = ? ", new Object[]{s[0]});
					memory.update(" delete from tblemployeeinfo where femployeesn = ? ", new Object[]{s[2]});
				}
			}
		}
		System.out.println("业务处室人员清理完成！");
	}
}

class IdsHandler implements ResultSetHandler<List<String[]>>{
	@Override
	public List<String[]> handle(ResultSet rs) {
		List<String[]> list = new ArrayList<String[]>();
		try {
			while(rs.next()){
				String fsn = rs.getString("fsn") == null?"":rs.getString("fsn");
				String funitFsn = rs.getString("funitFsn") == null?"":rs.getString("funitFsn");
				String femployeeSn = rs.getLong("femployeeSn")==0 ?"":rs.getString("femployeeSn")+"";
				String[] ids = new String[]{fsn,funitFsn,femployeeSn};
				list.add(ids);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

