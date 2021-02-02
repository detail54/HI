package project1;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
	
	public Main() {
		
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		
		JLabel j = new JLabel("ÇÏÀÌ");
		j.setFont(new Font("³ª´®°íµñ",Font.BOLD,50));
		c.add(j);
		
		setLocationRelativeTo(null);
		setSize(400,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new Main();
		
	}

}
