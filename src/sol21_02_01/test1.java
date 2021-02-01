package sol21_02_01;

import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;

	void set(int a, int b) {
		width = a;
		height = b;
	}

	void show() {
		System.out.println(width * height);
	}

}

public class test1 {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("사각형 너비: ");
				int a = sc.nextInt();
				System.out.println("사각형 높이: ");
				int b = sc.nextInt();
				r.set(a, b);
				break;
				
			} catch (Exception e) {
				System.out.println("유효한 값을 입력하세요");
				sc.nextLine();
				continue;
			}
		}
		r.show();
	}

}