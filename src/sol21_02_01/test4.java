package sol21_02_01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test4 extends JFrame {

	test4() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		Color co[] = { Color.RED, Color.orange, Color.yellow, Color.GREEN, Color.BLUE };
		JButton[] jb = new JButton[5];

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton();
			c.add(jb[i]);
			jb[i].setBackground(co[i]);
			
			Color a = co[i];
		
			jb[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					c.setBackground(a);
				}
			});
		}
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new test4();
	}

}
