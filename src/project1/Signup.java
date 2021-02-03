package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//회원가입 화면

//입력받은 id , pw를 한 줄에 저장시킬 코드.
class Id_Pw {
	String id;
	String pw;

	Id_Pw(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	String out() {
		return id + " " + pw + "\n";
	}
}

public class Signup extends JFrame {

	Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel jp1;
		JPanel jp2;
		JPanel jp3;
		JTextField id;
		JTextField pw;
		JLabel text_signup;
		JLabel text_id;
		JLabel text_pw;
		JLabel n;
		JButton ok_button;

		jp1 = new JPanel();
		jp1.setSize(300, 20);
		jp1.setBackground(Color.black);

		text_signup = new JLabel("회원가입");
		text_signup.setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
		text_signup.setForeground(Color.white);

		jp1.add(text_signup);
		c.add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.setSize(300, 120);
		jp2.setBackground(Color.black);

		n = new JLabel("    ");

		text_id = new JLabel("ID");
		text_id.setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
		text_id.setForeground(Color.white);
		text_pw = new JLabel("PW");
		text_pw.setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
		text_pw.setForeground(Color.white);

		id = new JTextField(20);
		pw = new JTextField(20);

		jp2.add(text_id);
		jp2.add(id);
		jp2.add(n);
		jp2.add(text_pw);
		jp2.add(pw);
		c.add(jp2, BorderLayout.CENTER);

		jp3 = new JPanel();
		jp3.setBackground(Color.black);
		jp3.setSize(300, 10);

		ok_button = new JButton("확인");
		ok_button.setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
		ok_button.setForeground(Color.white);
		ok_button.setBackground(Color.darkGray);

		ok_button.addActionListener(new ActionListener() { // 입력한 정보 텍스트 파일에 저장.

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("src/project1/Guest.txt", true); // true를 넣어서 누적 작성되게함.

					Id_Pw input = new Id_Pw(id.getText(), pw.getText());
					fw.write(input.out());
					fw.close();
					JOptionPane.showMessageDialog(null, "회원가입 완료!");
					setVisible(false);

				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		jp3.add(ok_button);
		c.add(jp3, BorderLayout.SOUTH);

		setLocationRelativeTo(null);
		setSize(300, 200);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {

		new Signup();

	}

}
