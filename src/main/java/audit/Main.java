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
		
		// ������fnewjobstatus=1�ļ�¼����fflowid���з��飬��ͳ��ÿ��ļ�¼����
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
		System.out.println("�ж���fnewjobstatus=1��¼��Tblproject�ܹ��У�"+taskIds.size()+"��");
		logStr.append("�ж���fnewjobstatus=1��¼��Tblproject�ܹ��У�"+taskIds.size()+"��\r\n");
		logStr.append("=====================================================================================\r\n");
		
		for (String taskId : taskIds) {
			String sql2 = " select p.FID "+
				" from TblProject p "+
				" left join tblJobBase j on p.FNewJobId = j.Fsn "+
				" where FFlowId = ? and FNewJobStatus = 1 "+
				" order by ForderDate desc ";
			List<String> ps = memory.query(sql2, new ColumnListHandler<String>(String.class), new Object[]{taskId});
			System.out.println("��ǰ���ڴ���fflowid="+taskId+" ����������,����"+ps.size()+" ����ǰ�����¼��������"+(ps.size()-1)+" ����Ҫ���޸ġ�");
			logStr.append("��ǰ���ڴ���fflowid="+taskId+" ����������,����"+ps.size()+" ����ǰ�����¼��������"+(ps.size()-1)+" ����Ҫ���޸ġ�\r\n");
			int count2 = 0;
			for (int i = 0; i < ps.size(); i++) {
				if(i==0){
					System.out.println("��ȷ�ļ�¼��fid="+ps.get(i));
					logStr.append("��ȷ�ļ�¼��fid="+ps.get(i)+"\r\n");
				}else{
					String updateSql = " update tblproject set fnewjobstatus = 0 where fid = ? ";
					int j = memory.update(updateSql, new String[]{ps.get(i)});
					System.out.println("�ɹ�����"+j+"������fid="+ps.get(i));
					logStr.append("�ɹ�����"+j+"������fid="+ps.get(i)+"\r\n");
					count2++;
				}
			}
			System.out.println("�ɹ�������ɣ�"+count2+"��");
			logStr.append("�ɹ�������ɣ�"+count2+"����\r\n");
			logStr.append("===============================================================================================\r\n");
		}
		
		// ����־��¼д�뵽��ǰ�������ڵ�Ŀ¼��
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhssmm");
		File logFile = new File(format.format(new Date())+".log");
		
		// ����ת�������������µ��ļ�
		try {
			OutputStream outputStream = new FileOutputStream(logFile);
			OutputStreamWriter outWrite = new OutputStreamWriter(outputStream,"GBK");
			outWrite.write(logStr.toString());
			outWrite.close();
			System.out.println("д����־�ļ��ɹ���");
		} catch (FileNotFoundException e) {
			System.out.println("��־�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("�����ַ�����ΪGBKʧ��");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�ļ�д��ʧ�ܣ�");
			e.printStackTrace();
		}
	}
}