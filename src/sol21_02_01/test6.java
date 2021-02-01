package sol21_02_01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Th extends Thread {
	JLabel a;

	Th(JLabel a) {
		this.a = a;
	}

	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				String aa = Integer.toString(i);
				a.setText(a.getText() + aa);
				sleep(1000);
			}
			
		} catch (Exception e) {
			return;
		}
	}
}

public class test6 extends JFrame {

	test6() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel j = new JLabel();

		c.add(j);

		Th t = new Th(j); // 쓰레드 객체 생성

		setVisible(true);
		t.start(); // 쓰레드 실행

	}

	public static void main(String[] args) {

		new test6();

	}

}
//7. 다음 코드를 보고 작성해라. 쓰레드가실행될 때 화면에 1초단위로정수를 출력하게끔 만들어라. 
//(정수0부터 시작하여 프레임에 정수를 문자열로 변경해서 넣고 try문안에서1초씩 정지하게끔 만들어라 예외 발생하면 쓰레드는 종료된다.(return)
