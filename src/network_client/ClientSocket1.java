package network_client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket1 {

	public static void main(String[] args) {
		
		Socket s = null;	//Ŭ���̾�Ʈ������ ���ϸ� �ʿ�. �������� �ʿ����.
		
		try {
			s = new Socket();
			System.out.println("�����û");
			
			//�������� ������ �ϸ� ����.
			s.connect(new InetSocketAddress("localhost",5001));
			System.out.println("���Ἲ��");
			
			byte[] b = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			msg = "Hi server";
			b = msg.getBytes("UTF-8");
			os.write(b);
			//���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�.
			System.out.println("������ ������ ����");
			
			InputStream in = s.getInputStream();
			b = new byte[100];
			int r = in.read();
			// �޼��� ����Ʈ �迭 �д´�.
										//���ڵ�. ����Ʈ �迭�� ���ڿ��� �ٲ۴�.	
			msg = new String(b, 0, r, "UTF-8");
			
			in.close();
			os.close();
			s.close();
			
		}catch(Exception e) {
			
		}
		
	}

}
