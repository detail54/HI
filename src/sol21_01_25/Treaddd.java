package sol21_01_25;

class Thh implements Runnable {
	String a;

	Thh(String a) {
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

		Thh t = new Thh("������");
		Thread t1 = new Thread(t);
		t1.start(); // run �޼ҵ� ����

	}
}