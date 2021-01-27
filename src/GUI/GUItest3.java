package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUItest3 extends JFrame{

	GUItest3(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.DARK_GRAY);
		
		c.add(new Button("java"));
		c.add(new Button("db"));
		c.add(new Button("html"));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUItest3();
		
	}

}