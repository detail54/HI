package ����;
import java.util.Scanner;

public class asciicodeDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է�: ");
		String input = sc.nextLine();

		int A = 0;
		int a = 0;
		int n = 0;
		char c;

		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				A++;
			} else if (c >= 'a' && c <= 'z') {
				a++;
			} else if (c >= 48 && c <= 57) {
				n++;
			} else {
				continue;
			}
		}
		System.out.println("�빮�� " + A + "��, �ҹ��� " + a + "��, ���� " + n + "��");

	}

}