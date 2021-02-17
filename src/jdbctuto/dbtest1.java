package jdbctuto;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbtest1 {

	public static Connection con;	//jdbc와 연결하는 거. 아래는 활용.

	public static Connection get() {
		
		Connection conn = null;
		
				try {
					//JDBC 드라이버를 로딩하는 코드
					String id = "sys as sysdba";
					String pw = "jdh159468*";
					String url = "jdbc:oracle:thin:@localhost:1521/xe";
					
					
					//드라이버 구현하는 코드
					Class.forName("oracle.jdbc.driver.OracleDriver");
							//forName() = 문자열로 준 클래스 이름이나 인터페이스 이름을 객체로 리턴가능
					//드라이버들이 읽히면 자동으로 객체 생성되면서 DriverManager에 등록된다.					
					
					conn = DriverManager.getConnection(url,id,pw);
					//DriverManager = Connection 객체를 연결하는 것.
					
					System.out.println("데이터베이스에 연결됐다");
					
				} catch (Exception e) {
					System.out.println("로딩 실패");
				}
		return conn;
	}
	
}
