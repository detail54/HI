package jdbctuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbtest1_1 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String que = "insert into emp(empno,ename,job)" + "values(?,?,?)";
														// ? = ���ε庯��.. �ֱ������� �����ؼ� �Է��� ��.
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "sys as sysdba", "jdh159468*");
			pstmt = con.prepareStatement(que);

			pstmt.setInt(1, 1234);		//(�� ���� ����, ��)
			pstmt.setString(2, "JACK");
			pstmt.setString(3, "ANALYST");

			int n = pstmt.executeUpdate();	//pstmt.executeUpdate(); �ʼ��� �ۼ��ؾ���. �ҷ��ö� executeQuery

			System.out.println(n>0?"����":"����");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
