package sol21_01_28;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class test3 extends JFrame {

	test3() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JRadioButton j1 = new JRadioButton("magenta");
		JRadioButton j2 = new JRadioButton("red");
		
		c.add(j1);
		c.add(j2);
		
		ButtonGroup b = new ButtonGroup();
		b.add(j1);
		b.add(j2);
		
		j1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.magenta);
			}
		});
		j2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.red);
			}
		});
				
		setVisible(true);
	}

	public static void main(String[] args) {

		new test3();

	}

}
//5. ������ư �̸��� ��magenta��, ��red�� �ΰ��� �����ϰ�magenta�� ������ ��ư�� ���� magenta��, red�� ������ red������ �����ض�