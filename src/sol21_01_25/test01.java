package sol21_01_25;

class Point {

	int a;
	int b;

	Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return a+" "+b;
	}
}

public class test01 {

	public static void main(String[] args) {

		Point p = new Point(3, 4);
		System.out.println(p);

	}

}
