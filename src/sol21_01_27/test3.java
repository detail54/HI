package sol21_01_27;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Ggg implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton j = (JButton) e.getSource();
		if (j.getText().equals("Ok")) {
			j.setBackground(Color.orange);
		} else if (j.getText().equals("cancel")) {
			j.setEnabled(false);
		} else if (j.getText().equals("Get")) {
			System.out.println(j.getX() + " " + j.getY());

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}

public class test3 extends JFrame {

	test3() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);

		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		JButton j3 = new JButton("Get");

		Ggg g = new Ggg();
		j1.addMouseListener(g);
		j2.addMouseListener(g);
		j3.addMouseListener(g);
		add(j1);
		add(j2);
		add(j3);

		setVisible(true);

	}

	public static void main(String[] args) {

//		2. ����Ʈ���� ������ blue������ �ϰ�, Ok, Cancel, Get ��ư�� ������ ���α׷� �ۼ��ض�.
//		2.1Ok ��ư�� ������ ����Ʈ�� ���� orange, Cancel ��ư�� ������ ��ư�� ��Ȱ��ȭ��Ű�� Get ��ư�� ������ ��ư�� ��ġ(x,y)���� ����ض�.

		new test3();

	}

}
