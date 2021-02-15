package project1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Basket extends JFrame{

	Basket(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		
		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		//setResizable(false);
	}
	
	public static void main(String[] args) {
		new Basket();
	}

}
