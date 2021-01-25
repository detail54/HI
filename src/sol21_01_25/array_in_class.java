package sol21_01_25;

class Num {
	int a;

	Num(int a) {
		this.a = a;
	}
	int get() {
		return a;
	}
}

public class array_in_class {

	public static void main(String[] args) {

		Num[] ary = new Num[] { new Num(1), new Num(2), new Num(3) };

		for(Num a : ary) {
			System.out.println(a.get());
		}
	}

}
