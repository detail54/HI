package sol21_01_25;

class Th extends Thread {
	String str;

	Th(String str, int n) {
		this.str = str;
		setPriority(n);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			System.out.println(getPriority());
		}
	}
}

public class Threaddd3 {

	public static void main(String[] args) {
		// 스레드의 우선순위 선정 가능.
		Th t1 = new Th("장군", Thread.MAX_PRIORITY);
		Th t2 = new Th("재경", Thread.MIN_PRIORITY);
		Th t3 = new Th("형록", Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
