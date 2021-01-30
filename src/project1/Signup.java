package project1;

import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signup extends JFrame{

	Signup(){
		Container c = getContentPane();
		c.setLayout(null);
		
		JButton jb_singin = new JButton("로그인");
		JButton jb_signup = new JButton("회원가입");
		c.add(jb_singin);
		jb_singin.setBounds(400,400,20,20);
		
		JLabel saleList = new JLabel("sale");
		c.add(saleList);
		saleList.setBounds(100,100,200,300);
		
		setSize(1400,600);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {

		new Signup();
		
	}

}
