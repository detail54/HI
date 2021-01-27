package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUItest20 extends JFrame {

	JTextField j = new JTextField(20);
	JTextArea j1 = new JTextArea(10,20);
	
	GUItest20(){
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout());

	JLabel jl=new JLabel("enter Å° ÀÔ·Â");
	c.add(jl);
	c.add(j);
	c.add(new JScrollPane(j1));
	
	setVisible(true);
	}

	public static void main(String[] args) {

		new GUItest20();
		
	}

}
