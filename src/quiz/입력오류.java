package quiz;

import java.util.Scanner;

public class �Է¿��� {

	public static void main(String[] args) {

		/*
		 * [����8] ���� �Է¹޾� 0���� �۰ų� 100���� ũ�� "�Է¿���!!" ���
		 * 
		 */

		Scanner s = new Scanner(System.in);

		System.out.print("1~100 �Է�: ");
		int Input = s.nextInt();

		if (Input < 0 || Input > 100) {
			System.out.println("�Է¿���!!");
		} else {
			System.out.println(Input);
		}

	}

}
