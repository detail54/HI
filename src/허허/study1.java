package ����;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class study1 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		
		
		try {
			FileWriter fw = new FileWriter("aa.txt");
			System.out.println("���� �Է�");
			for (;;) {
				String in = sc.next();
				if(in.equals("�׸�")) {
					break;
				}
				fw.write(in);			//��ĳ�� �Է°� ���Ͽ� ���
				fw.write("\r\n");		//�Է� �� ���� ������ �ٹٲ㼭 ���
			}
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("aa.txt");
			BufferedReader br = new BufferedReader(fr);

			String s = null;
			int i = 1;

			while ((s = br.readLine()) != null) {
				System.out.println(i + ". " + s);
			}
			sc.close();
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
