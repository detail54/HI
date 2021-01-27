package sol21_01_27;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test2 extends JFrame {

	test2() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);

		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		JButton j3 = new JButton("Get");
		
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.orange);
			}
		});
		c.add(j3);
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(j3.getX() + " " + j3.getY());
			}
		});
		
		setVisible(true);

	}

	public static void main(String[] args) {

//		2. ����Ʈ���� ������ blue������ �ϰ�, Ok, Cancel, Get ��ư�� ������ ���α׷� �ۼ��ض�.
//		2.1Ok ��ư�� ������ ����Ʈ�� ���� orange, Cancel ��ư�� ������ ��ư�� ��Ȱ��ȭ��Ű�� Get ��ư�� ������ ��ư�� ��ġ(x,y)���� ����ض�.

		new test2();
		
	}

}
