package sol21_02_04;

import java.util.ArrayList;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {

		ArrayList<String> ary = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("문자열 입력해라");
			String n = sc.next();
			ary.add(n);
		}

		for (int i = 0; i < ary.size(); i++) {
			System.out.println(ary.get(i));
		}
		
		int max = 0;
		for (int i = 0; i < ary.size(); i++) {
			if(ary.get(max).length() < ary.get(i).length()) {
				max = i;
			}
		}
		
		System.out.println(ary.get(max));

	}

}
