package ����;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class study4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("�Է�����: ");
			String inputIn = sc.next();
			
			FileReader fr = new FileReader(inputIn);
			BufferedReader br = new BufferedReader(fr);
			
			System.out.print("�������: ");
			String outputIn = sc.next();
			
			FileWriter fw = new FileWriter(outputIn);
			
			String read;
			
			while((read = br.readLine())!=null) {
				fw.write(read+"\r\n");
			}
			
			fr.close();
			br.close();
			fw.close();
			sc.close();
			System.out.println("����Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
