package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest12 extends JFrame{

	GUItest12(){
		
		JLabel j = new JLabel("�ڹٴ�");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		c.add(j);
		j.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				j.setText("��վ�");
			}
			public void mouseExited(MouseEvent e) {
				j.setText("�ڹٴ�");
			}
			
		});
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GUItest12();
		
	}

}
