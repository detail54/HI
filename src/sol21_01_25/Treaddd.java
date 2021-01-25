package sol21_01_25;

class Th implements Runnable {
	String a;

	Th(String a) {
		this.a = a;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
 
		}
	}
}

public class Treaddd {
	public static void main(String[] args) {

		Th t = new Th("쓰레드");
		Thread t1 = new Thread(t);
		t1.start(); // run 메소드 실행

	}
}