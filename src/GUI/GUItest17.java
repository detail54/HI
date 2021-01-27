package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GUItest17 extends JFrame {

	JRadioButton j1 = new JRadioButton("Â¥Àå¸é");
	JRadioButton j2 = new JRadioButton("ÅÁ¼öÀ°");

	GUItest17() {

		Container c = getContentPane();
		c.add(j1);
		c.add(j2);

		c.setLayout(new FlowLayout());
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(j1);
		b1.add(j2);

		A a = new A();
		j1.addItemListener(a);
		j2.addItemListener(a);

		setVisible(true);
	}

	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() != ItemEvent.SELECTED) {
				return;
			}
			if (e.getItem() == j1) {
				System.out.println("Â¥Àå¸é");
			} else if (e.getItem() == j2) {
				getContentPane().setBackground(Color.pink);	
			}
		}
	}

	public static void main(String[] args) {

		new GUItest17();

	}

}
