package quiz;

import java.util.Scanner;

public class ��ҹ���_������� {

	public static void main(String[] args) {

		/*
		 * [����] �Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ� �ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����Ͻÿ� �׿��� �����̸� "�Էµ���Ÿ����"��� ǥ���Ͻÿ�
		 */

		int change;
		String Output = "";
		String Input = "";

		Scanner s = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		Input = s.next();

		for (int i = 0; i < Input.length(); i++) {
			change = (int) (Input.charAt(i));
			if (change >= 65 || change <= 95) {
				Output += (char) (change + 32);
			} else if (change >= 97 || change <= 122) {
				Output += (char) (change - 32);
			} else {
				Output += (char) change;
			}
		}

		System.out.println(Output);
	}

}
