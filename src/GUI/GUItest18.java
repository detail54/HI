package GUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUItest18 extends JFrame {

	GUItest18() {

		Container c = getContentPane();
		JCheckBox j[] = new JCheckBox[15];

		c.setLayout(new GridLayout(3, 5));

		for (int i = 0; i < j.length; i++) {
			j[i] = new JCheckBox("dd"+(i+1));
			c.add(j[i]);
		}

		setVisible(true);
	}

	public static void main(String[] args) {

		new GUItest18();
		
	}

}
