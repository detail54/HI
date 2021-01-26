package sol21_01_26;

class Share extends Thread {
	synchronized void pr(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}

class Tt1 extends Thread {
	Share s;
	String[] str;

	Tt1(Share s, String str[]) {
		this.s = s;
		this.str = str;
	}

	public void run() {
		for (int i = 0; i < str.length; i++) {
			s.pr(str[i]);
		}
	}
}

public class synchronizeddd1 {

	public static void main(String[] args) {

		Share s = new Share();
		String eng[] = { "java", "study", "db" };
		String kor[] = { "자바", "공부", "데이터베이스", "스프링", "제이에스피" };

		Tt1 t1 = new Tt1(s, eng);
		Thread t2 = new Tt1(s, kor);
		t1.start();
		t2.start();

	}

}
