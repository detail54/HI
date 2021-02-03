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
		System.out.println("���� ��ٸ����ִ�.");

		try {
			so = ser.accept();
			
		} catch (Exception e) {}
		System.out.println("��ٸ���..");
		
		try {
			out = new BufferedWriter((new OutputStreamWriter(so.getOutputStream())));
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
			while(true) {
				String msg = in.readLine();
				if(msg.equals("stop")) {
					System.out.println("����");
					break;
				}else {
					System.out.println("������");
					String outmsg = sc.nextLine();
					out.write(outmsg+"\n");
					out.flush();
					//���� �ȿ� ����Ǿ��ִ� ������ Ŭ���̾�Ʈ���� �����ϰ� ���۸� ����.
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
