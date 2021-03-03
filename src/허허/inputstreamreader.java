package «„«„;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstreamreader {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		FileWriter fw = new FileWriter("tt.txt");
		
		String out = "";
		while ((out = br.readLine()) != null) {
			if (out.equals("exit")) {
				break;
			}
			fw.write(out + "\n");
		}
		fw.close();
		br.close();
		
		FileReader fr = new FileReader("tt.txt");
		BufferedReader bbr = new BufferedReader(fr);
		
		while(true) {
			out = bbr.readLine();
			if(out == null) {
				break;
			}
			System.out.println(out);
		}
		fr.close();
		bbr.close();
	}
}
