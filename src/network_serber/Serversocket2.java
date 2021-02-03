package network_serber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serversocket2 {

	public static void main(String[] args) {

		BufferedWriter out = null;
		BufferedReader in = null;

		ServerSocket ser = null;
		Socket so = null;

		Scanner sc = new Scanner(System.in);
		try {
			ser = new ServerSocket(9999);
		} catch (Exception e) {}
		System.out.println("연결 기다리고있다.");

		try {
			so = ser.accept();
			
		} catch (Exception e) {}
		System.out.println("기다린다..");
		
		try {
			out = new BufferedWriter((new OutputStreamWriter(so.getOutputStream())));
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
			while(true) {
				String msg = in.readLine();
				if(msg.equals("stop")) {
					System.out.println("종료");
					break;
				}else {
					System.out.println("보내기");
					String outmsg = sc.nextLine();
					out.write(outmsg+"\n");
					out.flush();
					//버퍼 안에 저장되어있는 내용을 클라이언트에게 전송하고 버퍼를 비운다.
				}
			}
			
		} catch (Exception e) {}
		finally {
			try {
				sc.close();
				so.close();
				ser.close();
				
			} catch (Exception e) {}
		}
		
	}

}
