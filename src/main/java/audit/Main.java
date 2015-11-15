package audit;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ffcs.memory.BeanListHandler;
import cn.ffcs.memory.ColumnListHandler;
import cn.ffcs.memory.Memory;

public class Main {
	
	public static void main(String[] args) {
		try {
			updateNewJobStatus();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateNewJobStatus() throws SQLException {
		DBPool dbPool = new DBPool();
		Memory memory = new Memory(dbPool.getDataSource());
		
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
}