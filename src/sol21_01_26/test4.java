package sol21_01_26;

class Total {
	int sum;

	Total() {
		sum = 0;
	}

	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

class AThread extends Thread {
	Total t;
	int a, b;

	AThread(Total t, int a, int b) {
		this.t = t;
		this.a = a;
		this.b = b;
	}

	public void run() {
		for (int i = a; i <= b; i++) {
			t.total(i);
		}
		System.out.println(t.get());

	}
}

public class test4 {

	public static void main(String[] args) {

		Total t = new Total();

		AThread a = new AThread(t, 1, 50);
		AThread b = new AThread(t, 51, 100);
		try {
			a.start();
			a.join();
			t.sum = 0;
			b.start();
			b.join();
		} catch (Exception e) {
		}

	}

}
