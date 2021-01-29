package project1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
	
	public Main() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JButton jb_Start = new JButton();
		c.add(jb_Start);
		
		JLabel saleList = new JLabel();
		c.add(saleList);
		saleList.setBounds(getBounds());
		
		setSize(1400,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new Main();
		
	}

}
