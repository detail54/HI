package project1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReceiptCard extends JFrame{

	ReceiptCard(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel jp = new JPanel();
		c.add(jp);
		
		
		
		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String[] args) {

	}

}
