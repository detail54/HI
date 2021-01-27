package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUItest13 extends JFrame{

	GUItest13(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox j1 = new JCheckBox("C++");
		JCheckBox j2 = new JCheckBox("C");
		JCheckBox j3 = new JCheckBox("java");
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
	}
	
	public static void main(String[] args) {
		
		new GUItest13();
		
	}

}
