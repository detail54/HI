package sol21_02_02;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Person {
	private String name;
	private int id;

	Person(String a, int b) {
		name = a;
		id = b;
	}

	String getname() {
		return name;
	}

	int getid() {
		return id;
	}
			//�Է¹��� ��ü�� ���ϱ����� ���.
	public boolean equals(Object obj) {
		Person p = (Person) obj;

		if ((p.getid() == this.id) && (p.getname().equals(this.name))) {
			return true;
		} else {
			return false;
		}

	}

}

class Game {

	Scanner sc = new Scanner(System.in);

	Vector<Person> v = new Vector<Person>(5);

	Game() {
		// ���Ϳ� Ŭ������ ���Ա� ������ new Person �����ؾ���.
		v.add(new Person("aa", 10));
		v.add(new Person("bb", 20));
		v.add(new Person("cc", 30));
		v.add(new Person("dd", 40));
	}

	void in() {
		while (true) {
			System.out.println("�̸�, id�Է�: ");
			String name = sc.next();

			if (name.equals("stop")) {
				break;
			}

			int id = sc.nextInt();
			Person pp = new Person(name, id);
			// �ش� ������ �ִ��� Ȯ��.  ��ü�� ���ϴ°ű� ������ boolean equals�� ��ü ���ؾ���.
			if (v.contains(pp)) {
				// (aa)�� �̹� �ִ�.
				System.out.println(pp.getname() + "�� �̹� �ִ�.");
			} else {
				v.add(pp);
			}

		}
	}

	void out() {
		while (true) {
			Random r = new Random(); // ���� �߻�
			int n = r.nextInt(v.size());

			Person p = v.get(n);
			String str = p.getname();

			System.out.println(str + "id��?");
			int id = p.getid();

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == -1) {
				break;
			} else if (i == id) {
				System.out.println("����");
			} else {
				System.out.println("����ƴ�");
			}
		}
	}
	void end() {
		System.out.println("����");
		System.exit(0);
	}
}

public class test1 {

	public static void main(String[] args) {

		Game g = new Game();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1,2,3");
			// 1.�Է� in�Լ�
			// 2.out�Լ�
			// 3.end
			int select = sc.nextInt();

			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}

	}

}
