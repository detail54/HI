package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUItest2 {

	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());

		j.add(new JButton("동"), BorderLayout.EAST);
		//BorderLayout 은 위치 지정 필요함
		j.add(new JButton("서"), BorderLayout.WEST);
		j.add(new JButton("남"), BorderLayout.SOUTH);
		j.add(new JButton("북"), BorderLayout.NORTH);
		j.add(new JButton("중앙"), BorderLayout.CENTER);
		
		j.setVisible(true);
		
	}

}
