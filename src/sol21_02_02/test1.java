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
			//입력받을 객체를 비교하기위해 사용.
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
		// 벡터에 클래스가 들어왔기 때문에 new Person 생성해야함.
		v.add(new Person("aa", 10));
		v.add(new Person("bb", 20));
		v.add(new Person("cc", 30));
		v.add(new Person("dd", 40));
	}

	void in() {
		while (true) {
			System.out.println("이름, id입력: ");
			String name = sc.next();

			if (name.equals("stop")) {
				break;
			}

			int id = sc.nextInt();
			Person pp = new Person(name, id);
			// 해당 내용이 있는지 확인.  객체를 비교하는거기 때문에 boolean equals로 객체 비교해야함.
			if (v.contains(pp)) {
				// (aa)은 이미 있다.
				System.out.println(pp.getname() + "은 이미 있다.");
			} else {
				v.add(pp);
			}

		}
	}

	void out() {
		while (true) {
			Random r = new Random(); // 난수 발생
			int n = r.nextInt(v.size());

			Person p = v.get(n);
			String str = p.getname();

			System.out.println(str + "id는?");
			int id = p.getid();

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == -1) {
				break;
			} else if (i == id) {
				System.out.println("정답");
			} else {
				System.out.println("정답아님");
			}
		}
	}
	void end() {
		System.out.println("종료");
		System.exit(0);
	}
}

public class test1 {

	public static void main(String[] args) {

		Game g = new Game();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1,2,3");
			// 1.입력 in함수
			// 2.out함수
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
