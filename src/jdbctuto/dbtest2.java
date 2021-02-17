package jdbctuto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbtest2 {

	public static void main(String[] args) throws SQLException {

		//아래 3가지는 데이터 불러올 때 무조건 작성해야함.
		
		Connection conn = null;	//DB와 연결하는 인터페이스
		PreparedStatement pstm = null;	//sql문 객체.. sql 구문을 실행되게 하는 인터페이스.
		ResultSet r = null;		//sql에 대한 반환. 결과 값 모아놓는.. ResutSet 있어야 결과값 불러올수 있음
		
		try {
			String que = "SELECT * FROM emp";
			
			conn = dbtest1.get();
			pstm = conn.prepareStatement(que);
			r = pstm.executeQuery();
					//executeQuery = 실질적인 sql 문 실행 함수.
			
			while(r.next()) {			//1은 데이터베이스 1열 불러온다는 의미. db는 0이 아닌 1부터 시작.
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
