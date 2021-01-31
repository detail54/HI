package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class cla22 extends JFrame {

	static int result;
	
	cla22() {

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.BLACK);
		
		JLabel jl1 = new JLabel("01123123123123121231232322");
		jl1.setBackground(Color.BLACK);
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 40));
		jl1.setHorizontalAlignment(SwingConstants.RIGHT);
		if((jl1.getText()).length()>=16) {
			jl1.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 25));
		}
		if((jl1.getText()).length()>=23) {
			jl1.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
		}
		
		JLabel jl2 = new JLabel("0");
		jl2.setBackground(Color.BLACK);
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 40));
		jl2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2,1));
		jp1.setBackground(Color.BLACK);
		jp1.add(jl1);
		jp1.add(jl2);

		c.add(jp1,BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,4,5,5));
		jp2.setBackground(Color.BLACK);
		jp2.setPreferredSize(new Dimension(300,280));
		
		String[] str = { "7", "8", "9", "/", "4", "5", "6", "x", "1", "2", "3", "-", "<", "0", "=", "+" };
		JButton[] jb = new JButton[16];
		
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			jp2.add(jb[i]);
			jb[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));
			jb[i].setBackground(Color.GRAY);
			jb[i].setForeground(Color.white);
		}
		
		
		
		c.add(jp2,BorderLayout.SOUTH);
		
		setSize(400,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new cla22();
	}

}
