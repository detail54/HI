package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest12 extends JFrame{

	GUItest12(){
		
		JLabel j = new JLabel("자바는");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		c.add(j);
		j.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				j.setText("재밌어");
			}
			public void mouseExited(MouseEvent e) {
				j.setText("자바는");
			}
			
		});
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GUItest12();
		
	}

}
