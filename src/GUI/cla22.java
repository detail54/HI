package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class cla22 extends JFrame {

	static int result;
	
	cla22() {

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.BLACK);
		
		JLabel jl = new JLabel("0");
		jl.setBackground(Color.BLACK);
		jl.setForeground(Color.white);
		jl.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 30));
		jl.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1,1));
		jp1.setBackground(Color.BLACK);
		jp1.add(jl);
		
		
		
		c.add(jp1,BorderLayout.NORTH);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,4));
		jp2.setBackground(Color.BLACK);
		
		String[] str = { "7", "8", "9", "/", "4", "5", "6", "x", "1", "2", "3", "-", "<", "0", "=", "+" };
		JButton[] jb = new JButton[16];
		
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			jp2.add(jb[i]);
			jb[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
			jb[i].setBackground(Color.GRAY);
			jb[i].setForeground(Color.white);
		}
		
		c.add(jp2,BorderLayout.SOUTH);
		
		setSize(500,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new cla22();
	}

}
