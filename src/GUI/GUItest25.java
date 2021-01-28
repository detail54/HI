package GUI;

import java.util.StringTokenizer;

public class GUItest25 {

	public static void main(String[] args) {
//		String a = "1+2+3+4+5";
//
//		StringTokenizer s = new StringTokenizer(a, "+");
//
//		int sum = 0;
//		while (s.hasMoreTokens()) {
//			sum += Integer.parseInt(s.nextToken());
//		}
//		System.out.println(sum);
		
		String a = "1+2+3+4+5";

		StringTokenizer s = new StringTokenizer(a, "+");

		int sum = 0;
		while (s.hasMoreTokens()) {
			String e = s.nextToken();
			String b = e.trim();
			sum += Integer.parseInt(b);
		}
		System.out.println(sum);
	}

}

//2. 문자열 “1+2+3+4+5”를 “+”로 구분해서 총합 15를 출력해라
//
//(StringTokenizer,parseInt, trim() 다 사용)