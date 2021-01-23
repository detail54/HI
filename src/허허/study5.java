package «„«„;

import java.io.FileWriter;
import java.io.IOException;

public class study5 {
	public static void main(String[] args) {

		try {
			FileWriter fr = new FileWriter("gugu.txt");
			
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					fr.write(j+"x"+i+"= "+i*j+" ");
				}
				fr.write("\r\n");
			}
			
			
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
