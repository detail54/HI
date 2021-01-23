package sol21_01_22;

import java.util.Scanner;

class Circle {
	private double r;
  
	Circle(double r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Circle[] c = new Circle[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			double a = sc.nextDouble();
			c[i] = new Circle(a);
			sum += c[i].area();
		}
		System.out.println(sum);

	}

}
