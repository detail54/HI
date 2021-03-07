package jdbctuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbtest1_1 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String que = "insert into emp(empno,ename,job)" + "values(?,?,?)";
														// ? = 바인드변수.. 주기적으로 변경해서 입력할 값.
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "sys as sysdba", "jdh159468*");
			pstmt = con.prepareStatement(que);

			pstmt.setInt(1, 1234);		//(값 넣을 순서, 값)
			pstmt.setString(2, "JACK");
			pstmt.setString(3, "ANALYST");

			int n = pstmt.executeUpdate();	//pstmt.executeUpdate(); 필수로 작성해야함. 불러올땐 executeQuery

			System.out.println(n>0?"성공":"실패");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
