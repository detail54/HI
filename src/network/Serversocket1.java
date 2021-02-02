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
			ser = new ServerSocket(); // 서버 소켓 생성
			ser.bind(new InetSocketAddress("localhost", 5001));
			// 2. 서버소켓과 서버소켓이 연결될 경우 ip주소와 포트번호

			while (true) {
				System.out.println("연결 되기를 기다림");
				Socket so = ser.accept();
				// 3. 연결 요청을 수락하면서 소켓 생성한다.

				InetSocketAddress is = (InetSocketAddress) so.getRemoteSocketAddress();
				// 4. 연결된 클라이언트 쪽의 IP와 포트정보가 궁금함.

				byte[] b = null;
				String msg = null;

				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read();
				// 메세지 바이트 배열 읽는다.
											//인코딩. 바이트 배열을 문자열로 바꾼다.	
				msg = new String(b, 0, r, "UTF-8");
				System.out.println("데이터 받기 성공");

				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTR-8");
				//문자열을 바이트로 변경해서 전송하겠다. 소켓은 문자열을 읽지 못함. 그래서 바이트 이용.
				
				os.write(b);
				System.out.println("데이터 보내기 성공");
				
				os.close();
				in.close();
				so.close();
				ser.close();
				
			}
		} catch (Exception e) {	}

	}

}
