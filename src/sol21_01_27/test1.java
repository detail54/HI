package sol21_01_27;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class test1 extends JFrame {

	test1() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);

		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		JButton j3 = new JButton("Get");
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		JTextField jx = new JTextField(5);
		JTextField jy = new JTextField(5);
		c.add(jx);
		c.add(jy);
		
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				c.setBackground(Color.orange);
			}
		});
		j2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j2.setEnabled(false);
			}
		});
		j3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jx.setText(Integer.toString(j3.getX()));
				jy.setText(Integer.toString(j3.getY()));
				System.out.println(j3.getX() + " " +j3.getY());
			}
		});
		
		setVisible(true);

	}

	public static void main(String[] args) {

//		2. ����Ʈ���� ������ blue������ �ϰ�, Ok, Cancel, Get ��ư�� ������ ���α׷� �ۼ��ض�.
//		2.1Ok ��ư�� ������ ����Ʈ�� ���� orange, Cancel ��ư�� ������ ��ư�� ��Ȱ��ȭ��Ű�� Get ��ư�� ������ ��ư�� ��ġ(x,y)���� ����ض�.

		new test1();
		
	}

}
