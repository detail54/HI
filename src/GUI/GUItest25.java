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

//2. ���ڿ� ��1+2+3+4+5���� ��+���� �����ؼ� ���� 15�� ����ض�
//
//(StringTokenizer,parseInt, trim() �� ���)