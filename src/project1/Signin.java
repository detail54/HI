package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signin extends JFrame {

	
	static String set_id;
	static String set_pw;
	static String read_id;
	static String read_pw;

	Signin() {
		
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
		int i = 0; // id 비교 변수.

		jp1 = new JPanel();
		jp1.setSize(300, 20);
		jp1.setBackground(Color.black);

		text_signup = new JLabel("로그인");
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

		ok_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					FileReader fi = new FileReader("src/project1/Guest.txt");
					BufferedReader br = new BufferedReader(fi);

					ArrayList<String> ary_id = new ArrayList<String>();
					ArrayList<String> ary_pw = new ArrayList<String>();
					String read;

					set_id = id.getText();
					set_pw = pw.getText();

					while ((read = br.readLine()) != null) {
						int idx = read.indexOf(" ");
						ary_id.add(read.substring(0, idx));
						ary_pw.add(read.substring(idx + 1, (read.length() - 1) + 1));
					}

					while (true) {
						while (true) {
							if (set_id.equals(ary_id.get(i))) {
								if (set_pw.equals(ary_pw.get(i))) {
									fi.close();
									br.close();
									setVisible(false);
									Home h = new Home();
									h.setVisible(false);
									Main m = new Main();
									m.setVisible(true);
									break;
								} else {
									JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
									id.setText(id.getText());
									pw.setText("");
									break;
								}
							} else {
								JOptionPane.showMessageDialog(null, "가입되어있지 않은 아이디 입니다.");
								id.setText("");
								pw.setText("");
								break;
							}
						}
						break;
					}
					

				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "데이터 파일 찾을 수 없음.");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "데이터 파일 찾을 수 없음.");
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

		new Signin();

	}

}
