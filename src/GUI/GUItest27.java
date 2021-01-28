package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUItest27 extends JFrame {

	GUItest27() {
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		JTextField j = new JTextField(20);
		JTextArea j1 = new JTextArea(10, 20);
		JLabel jl = new JLabel();

		c.add(jl);
		c.add(j);
		c.add(new JScrollPane(j1));

		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = j.getText().toUpperCase();
				j1.append(a + "\n");
				j.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new GUItest27();

	}

}
