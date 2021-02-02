package sol21_02_02;

class Eo implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
			System.exit(0);
			
		} catch (Exception e) {

		}
	}

}

public class test8 {

	public static void main(String[] args) {
		
			Eo eo = new Eo();
			Thread th = new Thread(eo);
			th.start();


	}

}
//7. Runnable인터페이스를 이용하여 쓰레드를 생성해라. 쓰레드는작동 10초 후 종료하게끔 작성해라.