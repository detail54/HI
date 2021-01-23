package quiz;

import java.util.Scanner;

public class 대소문자_변경출력 {

	public static void main(String[] args) {

		/*
		 * [문제] 입력된 문자가 대문자이면 소문자로 출력하고 소문자이명 대문자로 변환하여 출력하시오 그외의 문자이면 "입력데이타오류"라고 표시하시오
		 */

		int change;
		String Output = "";
		String Input = "";

		Scanner s = new Scanner(System.in);

		System.out.print("문자 입력: ");
		Input = s.next();

		for (int i = 0; i < Input.length(); i++) {
			change = (int) (Input.charAt(i));
			if (change >= 65 || change <= 95) {
				Output += (char) (change + 32);
			} else if (change >= 97 || change <= 122) {
				Output += (char) (change - 32);
			} else {
				Output += (char) change;
			}
		}

		System.out.println(Output);
	}

}
