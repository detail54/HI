package jdbctuto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbtest2 {

	public static void main(String[] args) throws SQLException {

		//�Ʒ� 3������ ������ �ҷ��� �� ������ �ۼ��ؾ���.
		
		Connection conn = null;	//DB�� �����ϴ� �������̽�
		PreparedStatement pstm = null;	//sql�� ��ü.. sql ������ ����ǰ� �ϴ� �������̽�.
		ResultSet r = null;		//sql�� ���� ��ȯ. ��� �� ��Ƴ���.. ResutSet �־�� ����� �ҷ��ü� ����
		
		try {
			String que = "SELECT * FROM emp";
			
			conn = dbtest1.get();
			pstm = conn.prepareStatement(que);
			r = pstm.executeQuery();
					//executeQuery = �������� sql �� ���� �Լ�.
			
			while(r.next()) {			//1�� �����ͺ��̽� 1�� �ҷ��´ٴ� �ǹ�. db�� 0�� �ƴ� 1���� ����.
				String empno = r.getString(1);
	            String ename = r.getString(2);
	            String job = r.getString(3);
	            int mgr = r.getInt(4);
	            java.sql.Date hiredate = r.getDate(5);
	            int sal = r.getInt(6);
	            int comm = r.getInt(7);
	            int deptno = r.getInt(8);

	            System.out.println(empno + " " + ename + " " + job);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		r.close();
		pstm.close();
		conn.close();
		
		
	}

}
