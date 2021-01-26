package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest4 extends JFrame{

	GUItest4(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("¾È³ç");
		
		ImageIcon img = new ImageIcon("C://Users//Administrator//Desktop//ÀÇÀÚ.jpg");
		JLabel i = new JLabel(img);
		
		c.add(j);
		c.add(i);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUItest4();
		
	}

}
