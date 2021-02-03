package sol21_02_03;

class Sh {

	private int num = 0;

	public void add() {
		int n = num;
		Thread.yield();
		n += 10;
		num = n;

		System.out.print(num + " ");
	}
}

class Student extends Thread {
	String a;
	Sh s;

	Student(String a, Sh s) {
		this.a = a;
		this.s = s;
	}

	public void run() {
		try {
			while (true) {
				s.add();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class test3 {

	public static void main(String[] args) {

		Sh sh = new Sh();

		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);

		
		try {
			th1.start();
			th1.join();
			th2.start();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
