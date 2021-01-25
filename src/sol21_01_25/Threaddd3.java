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
		// �������� �켱���� ���� ����.
		Th t1 = new Th("�屺", Thread.MAX_PRIORITY);
		Th t2 = new Th("���", Thread.MIN_PRIORITY);
		Th t3 = new Th("����", Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
