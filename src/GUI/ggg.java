package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ggg extends JFrame{

	ggg(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel jl = new JLabel("Password:");
		c.add(jl);
		
		JPasswordField jp = new JPasswordField(10);
		c.add(jp);
		
		JButton jb1 = new JButton("OK");
		c.add(jb1);
		
		JButton jb2 = new JButton("Reset");
		c.add(jb2);
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jp.setText("");
			}
		});
		
		setSize(500,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ggg();
	}

}
