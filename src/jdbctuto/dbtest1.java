package jdbctuto;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbtest1 {

	public static Connection con;	//jdbc�� �����ϴ� ��. �Ʒ��� Ȱ��.

	public static Connection get() {
		
		Connection conn = null;
		
				try {
					//JDBC ����̹��� �ε��ϴ� �ڵ�
					String id = "sys as sysdba";
					String pw = "jdh159468*";
					String url = "jdbc:oracle:thin:@localhost:1521/xe";
					
					
					//����̹� �����ϴ� �ڵ�
					Class.forName("oracle.jdbc.driver.OracleDriver");
							//forName() = ���ڿ��� �� Ŭ���� �̸��̳� �������̽� �̸��� ��ü�� ���ϰ���
					//����̹����� ������ �ڵ����� ��ü �����Ǹ鼭 DriverManager�� ��ϵȴ�.					
					
					conn = DriverManager.getConnection(url,id,pw);
					//DriverManager = Connection ��ü�� �����ϴ� ��.
					
					System.out.println("�����ͺ��̽��� ����ƴ�");
					
				} catch (Exception e) {
					System.out.println("�ε� ����");
				}
		return conn;
	}
	
}
