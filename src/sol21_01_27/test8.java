package sol21_01_27;

import java.util.StringTokenizer;

public class test8 {

	public static void main(String[] args) {

		String p = "1+2+3";
		StringTokenizer s = new StringTokenizer(p, "+");
		
		while(s.hasMoreElements()) {
			System.out.println(s.nextToken());
		}
		
	}

}
