package ����;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = (int) (Math.random() * 100);
		//System.out.println(q);
		System.out.println("0~99������ ������ �߻��߽��ϴ�. ��ȸ�� 10��! ���纸����!");

		for (int i = 0; i < 10; i++) {
			System.out.print("�����?");
			int input1 = sc.nextInt();

			if (input1 == q) {
				System.out.println("����ɾ˾���..");
				break;
			} else if (input1 > q) {
				System.out.println("�� �� ���ƿ�!");
			} else if (input1 < q) {
				System.out.println("�� ���ƿ�!!");
			}
			if (i == 9) {
				System.out.println("��!! ������ : " + q);
			}

		}
	}
}
