package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUItest2 {

	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());

		j.add(new JButton("��"), BorderLayout.EAST);
		//BorderLayout �� ��ġ ���� �ʿ���
		j.add(new JButton("��"), BorderLayout.WEST);
		j.add(new JButton("��"), BorderLayout.SOUTH);
		j.add(new JButton("��"), BorderLayout.NORTH);
		j.add(new JButton("�߾�"), BorderLayout.CENTER);
		
		j.setVisible(true);
		
	}

}
