package GUI;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUItest14 extends JFrame {

	GUItest14() {

		JCheckBox j = new JCheckBox("java");
		// Container c = getContentPane(); //�����̳� �̻��� ��ӹ��� JFrame(this) �̿��Ͽ� ���̾ƿ���������.this. this. this. this.
		// c.setLayout(new FlowLayout());
		this.setLayout(new FlowLayout());

		j.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("�ڹ� ��մ�");
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
