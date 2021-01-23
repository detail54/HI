package 허허;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int list[] = new int[12];

		for (int i = 0; i < list.length; i++) {
			System.out.print(i+1 + "월 일수 입력 : ");
			list[i] = sc.nextInt();
		}
		while (true) {
			System.out.printf("일수 조회할 월 입력: ");
			int input = sc.nextInt();
			int output = list[input - 1];
			System.out.println(input + "월은 " + output + "일 입니다.");
		}
	}

}
