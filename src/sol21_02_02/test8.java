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
//7. Runnable�������̽��� �̿��Ͽ� �����带 �����ض�. ��������۵� 10�� �� �����ϰԲ� �ۼ��ض�.