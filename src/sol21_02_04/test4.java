package sol21_02_04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

class HI extends Thread {

	public void run() {

		ArrayList<String> ary = new ArrayList<String>();

		try {
			sleep(500);
		} catch (Exception e) {
			return;
		}
	}
}

public class test4 extends JFrame {

	String get;

	test4() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel jl = new JLabel("HIHIHIHIHI");
		jl.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 100));
		c.add(jl);

		get = jl.getText();

		setVisible(true);
		setSize(400, 250);
	}

	public static void main(String[] args) {
		HI h = new HI();
		h.start();
		
		new test4();
		
	}
}
