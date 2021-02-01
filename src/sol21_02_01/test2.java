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

		System.out.print("인원수: ");
		int p = sc.nextInt();

		Profile[] f = new Profile[p];

		for (int i = 0; i < p; i++) {
			System.out.print("이름: ");
			String a = sc.next();
			System.out.print("아이디: ");
			String b = sc.next();
			f[i] = new Profile(a, b);
		}
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getname() + " " + f[i].getid());
		}

	}

}
//A. main() Prob1: main()에서 인원수를 입력받아 인원수를 Profile에 대한객체 배열 개수로 설정한다. 이름과아이디도 입력받아 객체 배열에 저장한 후 출력해라.

