package sol21_02_02;

public class test6 {

	static int add(int a[], int b) {
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a[i];
		}
		return sum;
	}

	static int add(int a[], int b, int c[]) {
		int sum = 0;

		for (int i = 0; i < b; i++) {
			sum += a[i];
		}
		for (int i = 0; i < b; i++) {
			sum += c[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10 };
		int c = add(a, 5);
		int d = add(a, 5, b);

		System.out.println(c);
		System.out.println(d);
	}

}
