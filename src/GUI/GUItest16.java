package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUItest16 extends JFrame{

	GUItest16(){
		
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JLabel j = new JLabel("안녕하세요");
		
		ImageIcon i = new ImageIcon("C://Users//82109//OneDrive//바탕 화면//50c7cb594942d60d5a5713cfdaf8ef78.jpg");
		JLabel j1 = new JLabel(i);
		JLabel j2 = new JLabel("수요일이네요",SwingConstants.CENTER);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
				
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GUItest16();
		
	}

}
