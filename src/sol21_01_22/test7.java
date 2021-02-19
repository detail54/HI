package sol21_01_22;

import java.util.Scanner;

class Profile {

	String a;
	String b;

	Profile(String a, String b) {
		this.a = a;
		this.b = b;
	}

}

public class test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Profile p[] = new Profile[2];

		for (int i = 0; i < p.length; i++) {
			System.out.print("이름");
			String name = sc.next();

			System.out.print("아이디");
			String id = sc.next();

			p[i] = new Profile(name, id);
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].a + p[i].b);
		}

	}

}
