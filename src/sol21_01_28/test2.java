package sol21_01_28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test2 extends JFrame {

	test2() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");

		c.add(j1);
		c.add(j2);
		
		j1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ȯ��");
			}
		});
		j2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new test2();

	}
}
//4.  ����Ʈ���� ������ ���������� �ϰ�, Ok, Cancel ��ư�������� frame�ϳ� ������
//
//Ok��ư�� ������ ��Ȯ�Ρ�, Cancel�� ������ ��ư�� ��Ȱ��ȭ ���Ѷ�. 
//
//(MouseAdapter�� ����)