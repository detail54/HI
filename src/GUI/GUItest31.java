package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest31 extends JFrame {
	String[] str = { "+5", "-5", "/5" };
	JLabel jl = new JLabel();
	JButton[] jb = new JButton[3];

	GUItest31() {
		int n = (int) (Math.random() * 50) + 10;

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		jl.setText(Integer.toString(n));
		c.add(jl);

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			c.add(jb[i]);
		}

		jb[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(Integer.parseInt(jl.getText())+5));
				jb[0].setEnabled(false);
			}
		});
		
		jb[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(Integer.parseInt(jl.getText())-5));
				jb[1].setEnabled(false);
			}
		});
		
		jb[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(Integer.parseInt(jl.getText())/5));
				jb[2].setEnabled(false);
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new GUItest31();
	}

}
