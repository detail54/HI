package 허허;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열에 저장시킬 숫자 총 개수입력 : ");
		int inputAll = sc.nextInt();

		int[] ary = new int[inputAll];
		int r = 1;
		int y = 1;

		for (int i = 0; i < ary.length; i++) {
			System.out.print(r + "번째 배열에 저장할 숫자 입력: ");
			ary[i] = sc.nextInt();
			r++;
		}

		System.out.println("\n" + "입력이 완료되었습니다." + "\n");

		for (int k = 0; k < ary.length; k++) {
			System.out.println(y + "번째 수: " + ary[k]);
			y++;
		}
		
		for (;;) {
			System.out.print("\n" + "@@여러개 입력가능, 중단하려면 \"stop\"입력@@\n" + "몇번째 수 만큼 * 입력할까?");
			String Sinput = sc.nextLine();

			if (Sinput == "stop") {
				break;
			}

			for (int z = 0; z < Sinput.length(); z++) {
				char ch = Sinput.charAt(z);
				int output = (int) ch - 48;

				if (output > inputAll) {
					System.out.println(output + "번째의 배열은 존재하지 않습니다.");
				} else {
					for (int t = 0; t < output; t++) {
						System.out.print("*");
					}
				}

				System.out.println();
			}

		}
		System.out.println("종료");
	}

}
