package ����;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class study2 {
	public static void main(String[] args) {

		try {
			FileOutputStream fo = new FileOutputStream("aa.txt");
			
			int r;
			System.out.println("���� �Է�");
			while((r = System.in.read())!= 33) {
				fo.write(r);
			}
			fo.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
