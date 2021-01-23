package quiz;

import java.util.Scanner;

public class 입력오류 {

	public static void main(String[] args) {

		/*
		 * [문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!" 출력
		 * 
		 */

		Scanner s = new Scanner(System.in);

		System.out.print("1~100 입력: ");
		int Input = s.nextInt();

		if (Input < 0 || Input > 100) {
			System.out.println("입력오류!!");
		} else {
			System.out.println(Input);
		}

	}

}
