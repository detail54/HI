package lib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project1.Signup;

public class Home2 extends JFrame {


	Home2() {
		// 화면구성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel jp1;
		JPanel jp2;
		JPanel jp3;
		JLabel main_Title;
		JLabel main_Img;
		JButton jb_login;
		JButton jb_signup;
		JLabel n;

		jp1 = new JPanel();
		jp1.setBackground(Color.black);

		main_Title = new JLabel("J-Market");
		main_Title.setFont(new Font("impact", Font.PLAIN, 70));
		main_Title.setForeground(Color.white);
		jp1.add(main_Title);
		c.add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setBackground(Color.black);
		ImageIcon im = new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/cart.png");
		main_Img = new JLabel(im);
		jp2.add(main_Img);
		c.add(jp2, BorderLayout.CENTER);

		jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		jp3.setBackground(Color.black);

		jb_login = new JButton("Log in");
		jb_login.setBackground(Color.black);
		jb_login.setFont(new Font("impact", Font.PLAIN, 28));
		jb_login.setForeground(Color.white);
		jb_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jp3.add(jb_login);

		n = new JLabel("           "); // 여백용....
		jp3.add(n);

		jb_signup = new JButton("sign up");
		jb_signup.setBackground(Color.black);
		jb_signup.setFont(new Font("impact", Font.PLAIN, 28));
		jb_signup.setForeground(Color.white);
		jb_signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jp3.add(jb_signup);
		c.add(jp3, BorderLayout.SOUTH);

		// 이벤트

		jb_signup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		jb_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Signin s = new Signin();
				s.setVisible(true);

			}
		});
			
		setSize(400, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {

		new Home2();

	}

}
