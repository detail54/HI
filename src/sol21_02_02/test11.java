package sol21_02_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> a = new ArrayList<>();
		int big = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("�����Է�: ");
			int in = sc.nextInt();
			a.add(in);
		}

		Iterator<Integer> it = a.iterator();

		while (it.hasNext()) {
			if (big < it.next()) {
				big = it.next();
			}

		}
		System.out.println(big);

	}

}
//Scanner�� ����Ͽ� 5�� �������� �Է¹޾�
//list �Ǵ�  vector�� �����Ѵ�
//������ list, vector�� �˻��Ͽ� ���� ū �� ����ض�.