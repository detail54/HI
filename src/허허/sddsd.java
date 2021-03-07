package «„«„;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sddsd {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String que = "SELECT * FROM test";

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(url, "NEWNEW", "jdh159468*");

			pstmt = con.prepareStatement(que);
			ResultSet r = pstmt.executeQuery();
			ResultSetMetaData rsmd = r.getMetaData();
			
			while(r.next()) {
				System.out.println(r.getInt(rsmd.getColumnName(1)));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
