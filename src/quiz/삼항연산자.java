package quiz;

import java.util.Scanner;

public class ���׿����� {

	public static void main(String[] args) {

		// [����10] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�
		// ����) ���� : M �̸� "����", ������ "����" (���׿����� �̿�)

		Scanner s = new Scanner(System.in);

		String in;
		String out;
		
		System.out.print("����: ");
		in = s.next();

		out = (in.equals("M")) ? "����" : "����";

		System.out.println(out);
	}

}
