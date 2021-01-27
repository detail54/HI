package GUI;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUItest14 extends JFrame {

	GUItest14() {

		JCheckBox j = new JCheckBox("java");
		// Container c = getContentPane(); //컨테이너 미사용시 상속받은 JFrame(this) 이용하여 레이아웃생성가능.this. this. this. this.
		// c.setLayout(new FlowLayout());
		this.setLayout(new FlowLayout());

		j.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("자바 재밌당");
				}
			}
		});

		this.add(j);

		setVisible(true);

	}

	public static void main(String[] args) {

		new GUItest14();

	}

}
