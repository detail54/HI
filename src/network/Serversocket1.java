package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Serversocket1 {

	public static void main(String[] args) {

		ServerSocket ser = null;

		try {
			ser = new ServerSocket(); // ���� ���� ����
			ser.bind(new InetSocketAddress("localhost", 5001));
			// 2. �������ϰ� ���������� ����� ��� ip�ּҿ� ��Ʈ��ȣ

			while (true) {
				System.out.println("���� �Ǳ⸦ ��ٸ�");
				Socket so = ser.accept();
				// 3. ���� ��û�� �����ϸ鼭 ���� �����Ѵ�.

				InetSocketAddress is = (InetSocketAddress) so.getRemoteSocketAddress();
				// 4. ����� Ŭ���̾�Ʈ ���� IP�� ��Ʈ������ �ñ���.

				byte[] b = null;
				String msg = null;

				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read();
				// �޼��� ����Ʈ �迭 �д´�.
											//���ڵ�. ����Ʈ �迭�� ���ڿ��� �ٲ۴�.	
				msg = new String(b, 0, r, "UTF-8");
				System.out.println("������ �ޱ� ����");

				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTR-8");
				//���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�. ������ ���ڿ��� ���� ����. �׷��� ����Ʈ �̿�.
				
				os.write(b);
				System.out.println("������ ������ ����");
				
				os.close();
				in.close();
				so.close();
				ser.close();
				
			}
		} catch (Exception e) {	}

	}

}
