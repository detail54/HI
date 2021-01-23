package sol21_01_22;

interface Addin {
	public int add(int a, int b);

	public int add(int a);
}

class Add implements Addin {
	int a;
	int b;
  
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a) {
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}

public class test4 {

	public static void main(String[] args) {

		Add a = new Add();
		System.out.println(a.add(1, 4)); // 두 수합
		System.out.println(a.add(10)); // 1~10 합

	}

}
