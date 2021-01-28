package sol21_01_28;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("입력: ");
			int a = sc.nextInt();
			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.print("짝");
				if (a / 10 == 3 || a / 10 == 6 || a / 10 == 9) {
					System.out.print("짝");
				}
				System.out.println();
			} else if(a / 10 == 3 || a / 10 == 6 || a / 10 == 9){
				System.out.print("짝");
				System.out.println();
			} else {
				System.out.print("땡");
				System.out.println();
			}
		}
	}
}
//3. 1~100안의 정수를입력받아 3,6,9 중 하나가 있는 경우 “짝”, 두 개 있는 경우 “짝짝”,
//하나도 없으면 “땡”을출력해라. 
//(정수값이 39라고 할 때, n/10=3, n%10=9 이 나온다.   (/, % 연산자 활용))
//실행 결과) 입력:39                
//짝짝