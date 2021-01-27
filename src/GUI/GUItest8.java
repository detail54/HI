package GUI;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MouseTwo extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭!");
	}
}

public class GUItest8 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());

		// Mouse m = new MouseTwo();
		MouseListener m = new MouseTwo(); // up

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");

		j1.addMouseListener(m);
		j2.addMouseListener(m);

		f.add(j1);
		f.add(j2);
		f.setVisible(true);

	}
}
