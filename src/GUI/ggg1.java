package GUI;

import java.util.ArrayList;
import java.util.Scanner;

class gg {
	String ggg;
	ArrayList<String> aa = new ArrayList<>();

	gg(String a) {
		ggg = a;
	}

	void gggg() {
		for (int i = 0; i < 3; i++) {
			int n = (int) (Math.random() * 3);
			aa.add(String.valueOf(n));
		}
	}

	String ooo() {
		String qq = "";
		for (int i = 0; i < aa.size(); i++) {
			qq += aa.get(i);
		}
		return qq;
	}
}

public class ggg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		gg[] gg = new gg[2];

		for (int i = 0; i < gg.length; i++) {
			System.out.print("이름: ");
			String ggg = sc.next();
			gg[i] = new gg(ggg);
		}

		while (true) {
			System.out.print(gg[0].ggg + ": 엔터이외 아무키나 입력해라: ");
			String r = sc.next();
			gg[0].gggg();
			System.out.println(gg[0].ooo());

			System.out.print(gg[1].ggg + ": 엔터이외 아무키나 입력해라: ");
			String rr = sc.next();
			gg[1].gggg();
			System.out.println(gg[1].ooo());

			if (gg[0].aa.get(0).equals(gg[0].aa.get(1)) && gg[0].aa.get(0).equals(gg[0].aa.get(2))) {
				System.out.println(gg[0].ggg + "가 이김");
				break;
			} else if (gg[1].aa.get(0).equals(gg[1].aa.get(1)) && gg[1].aa.get(0).equals(gg[1].aa.get(2))) {
				System.out.println(gg[1].ggg + "가 이김");
				break;
			} else {
				for (int i = 0; i < 3; i++) {
					gg[0].aa.remove(0);
					gg[1].aa.remove(0);
				}
				continue;
			}

		}

	}

}