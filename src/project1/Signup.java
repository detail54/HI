package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Signup extends JFrame {

	Signup() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp1;
		JPanel jp2;
		JPanel jp3;
		JLabel main_Title;
		JLabel main_Img;
		JButton jb_signin;
		JButton jb_signup;
		
		jp1 = new JPanel();
		jp1.setBackground(Color.black);
		
		main_Title = new JLabel("J-Market");
		main_Title.setFont(new Font("impact", Font.PLAIN, 70));
		main_Title.setForeground(Color.white);
		jp1.add(main_Title);
		c.add(jp1,BorderLayout.NORTH);
		
		
		jp2 = new JPanel();
		jp2.setBackground(Color.black);
		ImageIcon im = new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/img/cart.png");
		main_Img = new JLabel(im);
		jp2.add(main_Img);
		c.add(jp2,BorderLayout.CENTER);
		
		
		jp3 = new JPanel();
		jp3.setBackground(Color.black);
		

		jb_signin = new JButton("sign in");
		jb_signin.setFont(new Font("impact", Font.PLAIN, 16));
		//jb_signin.setBounds(190, 500, 90, 30);
		jp3.add(jb_signin);
		
		jb_signup = new JButton("sign up");
		jb_signup.setFont(new Font("impact", Font.PLAIN, 16));
		//jb_signup.setBounds(290, 500, 90, 30);
		jp3.add(jb_signup);
		
		c.add(jp3,BorderLayout.SOUTH);


		setSize(400, 600);
		setVisible(true);
		//setResizable(false);
	}

	public static void main(String[] args) {

		new Signup();

	}

}
