package sol21_02_01;

import java.util.Scanner;

class Profile {
	String name, id;

	Profile(String name, String id) {
		this.name = name;
		this.id = id;
	}

	String getname() {
		return name;
	}

	String getid() {
		return id;
	}
}

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ο���: ");
		int p = sc.nextInt();

		Profile[] f = new Profile[p];

		for (int i = 0; i < p; i++) {
			System.out.print("�̸�: ");
			String a = sc.next();
			System.out.print("���̵�: ");
			String b = sc.next();
			f[i] = new Profile(a, b);
		}
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getname() + " " + f[i].getid());
		}

	}

}
//A. main() Prob1: main()���� �ο����� �Է¹޾� �ο����� Profile�� ���Ѱ�ü �迭 ������ �����Ѵ�. �̸������̵� �Է¹޾� ��ü �迭�� ������ �� ����ض�.

