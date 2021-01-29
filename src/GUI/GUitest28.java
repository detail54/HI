package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUitest28 extends JFrame {

	JLabel j = new JLabel();

	GUitest28() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(j);

		setVisible(true);

		c.addKeyListener(new Key());
		c.requestFocus();	//����Ʈ�ҿ� ��Ŀ�� ����.;.. Ű �Է� �����ϵ����ϴ°�.
	}

	class Key extends KeyAdapter {		//���� �����ؼ� �ش� ������ �� �ҷ���.
		public void keyPressed(KeyEvent e) {
			int a = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			int c = (int) (Math.random() * 256);
					//getKeycode �� ��Ʈ��.  ex) e.getKeyCode()==keyEvent.VK_up; ���� ©�� ����Ű �̵� �̷���.
			switch (e.getKeyChar()) {
				//�����Է½�.,			//VK_LEFT ����Ű ����.   VK_�� Ű����
			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a,b,c));
				break;
			case 'p':
				System.exit(0); 	//���α׷� ����
			}
		}

	}

	public static void main(String[] args) {

		new GUitest28();

	}

}