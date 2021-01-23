package «„«„;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class study3 {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("src/soldesk/study2.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("aa.txt");
			
			String in = null;
			
			while((in = br.readLine())!=null) {
				fw.write(in+"\r\n");
			}
			fr.close();
			br.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
