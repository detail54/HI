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
		c.requestFocus();	//컨텐트팬에 포커스 설정.;.. 키 입력 가능하도록하는것.
	}

	class Key extends KeyAdapter {		//숫자 지정해서 해당 숫자의 색 불러옴.
		public void keyPressed(KeyEvent e) {
			int a = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			int c = (int) (Math.random() * 256);

			switch (e.getKeyChar()) {
				//엔터입력시.,			//VK_LEFT 방향키 왼쪽.   VK_는 키보드
			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a,b,c));
				break;
			case 'p':
				System.exit(0); 	//프로그램 종료
			}
		}

	}

	public static void main(String[] args) {

		new GUitest28();

	}

}
