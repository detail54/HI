package ����;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� �����ų ���� �� �����Է� : ");
		int inputAll = sc.nextInt();

		int[] ary = new int[inputAll];
		int r = 1;
		int y = 1;

		for (int i = 0; i < ary.length; i++) {
			System.out.print(r + "��° �迭�� ������ ���� �Է�: ");
			ary[i] = sc.nextInt();
			r++;
		}

		System.out.println("\n" + "�Է��� �Ϸ�Ǿ����ϴ�." + "\n");

		for (int k = 0; k < ary.length; k++) {
			System.out.println(y + "��° ��: " + ary[k]);
			y++;
		}
		
		for (;;) {
			System.out.print("\n" + "@@������ �Է°���, �ߴ��Ϸ��� \"stop\"�Է�@@\n" + "���° �� ��ŭ * �Է��ұ�?");
			String Sinput = sc.nextLine();

			if (Sinput == "stop") {
				break;
			}

			for (int z = 0; z < Sinput.length(); z++) {
				char ch = Sinput.charAt(z);
				int output = (int) ch - 48;

				if (output > inputAll) {
					System.out.println(output + "��°�� �迭�� �������� �ʽ��ϴ�.");
				} else {
					for (int t = 0; t < output; t++) {
						System.out.print("*");
					}
				}

				System.out.println();
			}

		}
		System.out.println("����");
	}

}
