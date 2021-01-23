package sol21_01_22;

import java.util.Scanner;

abstract class CCircle {
	protected double r;
  
	CCircle(double r) {
		this.r = r;
	}
	abstract double get();
}

class Cir extends CCircle {
	Cir(double r) {
		super(r);
	}
	double get() {
		return r;
	}
}

public class test3 {

	public static void main(String[] args) {
		CCircle s[] = new CCircle[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			double r = sc.nextDouble();
			s[i] = new Cir(r);

			System.out.println(s[i].get());

		}
	}
}
