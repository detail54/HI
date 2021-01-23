package 허허;

import java.util.Scanner;

public class MathpowCalculator {

	public static String calculatorquestion(String init) {

		return init;

	}

	public static void calculator() {

		Scanner sc = new Scanner(System.in);

		int init = sc.nextInt();

		System.out.print("몇 배수로 계산할까? ");
		int sol = sc.nextInt();
		
		System.out.print("몇번 계산할까? ");
		int repeatInit = sc.nextInt();

		for (int i = 1; i < repeatInit + 1; i++) {
			int pow1 = (int) Math.pow(sol, i);
			int result1 = (init * pow1);
			int result2 = 0;

			for (int j = 0; j < i; j++) {
				int pow = (int) Math.pow(sol, j);
				result2 = (init * pow);
			}
			System.out.println(result2 + "+" + result1 + "= " + (result2 + result1));
		}
	}

	public static void main(String[] args) {
		System.out.print(calculatorquestion("계산시킬 수를 입력하세요=>"));
		calculator();
	}
}
