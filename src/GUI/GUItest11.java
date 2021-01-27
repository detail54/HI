package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUItest11 extends JFrame {

	GUItest11() {
		JButton j1 = new JButton("ok");
		JButton j2 = new JButton("cancel");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(j1);
		c.add(j2);

		j1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				System.out.println("ok");
			}
		});
		
		j2.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {
				j2.setEnabled(false);
			}

		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new GUItest11();

	}

}
