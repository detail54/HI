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

		Th t = new Th(j); // ������ ��ü ����

		setVisible(true);
		t.start(); // ������ ����

	}

	public static void main(String[] args) {

		new test6();

	}

}
//7. ���� �ڵ带 ���� �ۼ��ض�. �����尡����� �� ȭ�鿡 1�ʴ����������� ����ϰԲ� ������. 
//(����0���� �����Ͽ� �����ӿ� ������ ���ڿ��� �����ؼ� �ְ� try���ȿ���1�ʾ� �����ϰԲ� ������ ���� �߻��ϸ� ������� ����ȴ�.(return)
