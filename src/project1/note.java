package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class note extends JFrame{

	note(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,2));
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.black);
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.blue);
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.orange);
		
		c.add(jp3);
		c.add(jp1);
		
		
		JButton jb = new JButton("HI");
		jp3.add(jb);
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(jp1);
				getContentPane().add(jp2);
				revalidate();
				repaint();
			}
		});
		
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new note();

	}
}
