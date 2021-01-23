package 허허;

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
			System.out.println("문자 입력");
			for (;;) {
				String in = sc.next();
				if(in.equals("그만")) {
					break;
				}
				fw.write(in);			//스캐너 입력값 파일에 출력
				fw.write("\r\n");		//입력 후 엔턴 누르면 줄바꿔서 출력
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
