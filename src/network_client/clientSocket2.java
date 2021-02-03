package network_client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class clientSocket2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BufferedWriter out = null;
		Socket so = null;

		try {
			so = new Socket("localhost", 9999);
			System.out.println("접속됨");
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			String msg;

			while (true) {
				System.out.print("입력");
				msg = s.nextLine();
				out.write(msg + "\n");
				out.flush();

				if (msg.equalsIgnoreCase("stop")) {
					System.out.println("종료");
					break;
				}
			}
			so.close();
			s.close();
		} catch (Exception e) {
		}

	}

}