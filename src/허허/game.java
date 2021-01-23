package 허허;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = (int) (Math.random() * 100);
		//System.out.println(q);
		System.out.println("0~99사이의 난수가 발생했습니다. 기회는 10번! 맞춰보세요!");

		for (int i = 0; i < 10; i++) {
			System.out.print("뭘까요?");
			int input1 = sc.nextInt();

			if (input1 == q) {
				System.out.println("어뜨케알았지..");
				break;
			} else if (input1 > q) {
				System.out.println("좀 더 낮아요!");
			} else if (input1 < q) {
				System.out.println("더 높아요!!");
			}
			if (i == 9) {
				System.out.println("끝!! 정답은 : " + q);
			}

		}
	}
}
