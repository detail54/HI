package ����;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int list[] = new int[12];

		for (int i = 0; i < list.length; i++) {
			System.out.print(i+1 + "�� �ϼ� �Է� : ");
			list[i] = sc.nextInt();
		}
		while (true) {
			System.out.printf("�ϼ� ��ȸ�� �� �Է�: ");
			int input = sc.nextInt();
			int output = list[input - 1];
			System.out.println(input + "���� " + output + "�� �Դϴ�.");
		}
	}

}
