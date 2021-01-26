package sol21_01_26;

class Music extends Thread {
	String a;

	Music(String a) {
		this.a = a;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+a);
		}

	}
}

class Movie extends Music implements Runnable {
	Movie(String a){
		super(a);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+a);
		}
	}
}

public class test3 {

	public static void main(String[] args) {

		Music m = new Music("음악 재생");
		m.start();
		Movie m1 = new Movie("영화 재생");
		Thread t = new Thread(m1);
		t.start();

		try {
			m.join();
			t.join();
		}catch(Exception e) {}
	}

}
