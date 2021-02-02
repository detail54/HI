package network_client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket1 {

	public static void main(String[] args) {
		
		Socket s = null;	//클라이언트에서는 소켓만 필요. 서버소켓 필요없음.
		
		try {
			s = new Socket();
			System.out.println("연결요청");
			
			//서버에서 수락을 하면 연결.
			s.connect(new InetSocketAddress("localhost",5001));
			System.out.println("연결성공");
			
			byte[] b = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			msg = "Hi server";
			b = msg.getBytes("UTF-8");
			os.write(b);
			//문자열을 바이트로 변경해서 전송하겠다.
			System.out.println("데이터 보내기 성공");
			
			InputStream in = s.getInputStream();
			b = new byte[100];
			int r = in.read();
			// 메세지 바이트 배열 읽는다.
										//인코딩. 바이트 배열을 문자열로 바꾼다.	
			msg = new String(b, 0, r, "UTF-8");
			
			in.close();
			os.close();
			s.close();
			
		}catch(Exception e) {
			
		}
		
	}

}
