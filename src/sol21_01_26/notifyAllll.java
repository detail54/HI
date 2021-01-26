package sol21_01_26;

class Cook {
	String food;
	boolean send = false;

	void set(String f) {
		food = f;
		send = true;
		// synchronized void pr()
		synchronized (this) {
			notifyAll(); // 잠자고 있는 쓰레드 다 깨움

		}
	}

	String get() {
		if (send == false) {
			try {
				synchronized (this) {
					wait();// 손님 기다림
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return food;
	}
}

class Chef extends Thread {// 요리사
	Cook c;

	Chef(Cook c) {
		this.c = c;
	}

	public void run() {
		c.set("음식");
	}
}

class Customer extends Thread {// 요리사
	Cook c;

	Customer(Cook c) {
		this.c = c;
	}

	public void run() {
		System.out.println(c.get());
	}
}

public class notifyAllll {

	public static void main(String[] args) {

		Cook co = new Cook();
		Customer c1 = new Customer(co);
		Customer c2 = new Customer(co);
		Chef c3 = new Chef(co);

		try {
			c1.start();
			c2.start();
			Thread.sleep(1000);
			c3.start();

			c1.join();
			c2.join();
			c3.join();
		} catch (Exception e) {

		}

	}

}
