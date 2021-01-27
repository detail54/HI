package sol21_01_27;

import java.util.Scanner;

class Circle {

	private double x, y;

	private int r;

	Circle(double x, double y, int r) {

		this.x = x;
		this.y = y;
		this.r = r;
	}

	void show() {

		System.out.println(x + " " + y + " " + r);
	}
}

public class test5 {

	public static void main(String[] args) {
//		3���� Circle ��ü �迭�� ����� x, y, r���� �о� 3���� Circle��ü�� �����show()�Լ����� �� ����ض�. 
//		   x,y,r : 1.0 1.0 4
//         x,y,r : 2.5 3.5 6
//         x,y,r : 4.2 1.2 4

		Scanner sc = new Scanner(System.in);

		Circle[] c = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.println("�Ǽ�2�� ���� 1�� �Է�");
			Double x = sc.nextDouble();
			Double y = sc.nextDouble();
			int r = sc.nextInt();

			c[i] = new Circle(x, y, r);
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}

	}

}
