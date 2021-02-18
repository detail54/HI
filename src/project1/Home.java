package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//로그인 화면

public class Home extends JFrame {

	static String set_id;
	static String set_pw;
	static String read_id;
	static String read_pw;

	Home() {
		// 화면구성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel jp1;
		JPanel jp2;
		JPanel jp3;
		JLabel main_Title;
		JLabel main_Img;
		JTextField id;
		JTextField pw;
		JLabel text_id;
		JLabel text_pw;
		JButton jb_login;
		JButton jb_signup;
		JLabel n;		//간격 띄우는 용도..

		jp1 = new JPanel();
		jp1.setBackground(Color.black);

		main_Title = new JLabel("Black-Market");
		main_Title.setFont(new Font("impact", Font.PLAIN, 70));
		main_Title.setForeground(Color.white);
		jp1.add(main_Title);
		c.add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setSize(400, 500);
		jp2.setBackground(Color.black);
		
		ImageIcon im = new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/cart.png");
		
		text_id = new JLabel("ID");
		text_id.setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
		text_id.setForeground(Color.white);
		text_id.setBounds(70, 380, 30, 30);
		
		text_pw = new JLabel("PW");
		text_pw.setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
		text_pw.setForeground(Color.white);
		text_pw.setBounds(70, 410, 30, 30);
		
		id = new JTextField(20);
		id.setBounds(120, 382, 200, 25);
		
		pw = new JTextField(20);
		pw.setBounds(120, 412, 200, 25);
		
		main_Img = new JLabel(im);
		main_Img.setBounds(10, 30, 380, 350);

		jp2.add(main_Img);
		jp2.add(text_id);
		jp2.add(id);
		jp2.add(text_pw);
		jp2.add(pw);

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

		n = new JLabel("           ");
		jp3.add(n);

		jb_signup = new JButton("sign up");
		jb_signup.setBackground(Color.black);
		jb_signup.setFont(new Font("impact", Font.PLAIN, 28));
		jb_signup.setForeground(Color.white);
		jb_signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jp3.add(jb_signup);
		c.add(jp3, BorderLayout.SOUTH);

		// 이벤트

		jb_signup.addActionListener(new ActionListener() { // 회원가입 프레임창 띄움.

			@Override
			public void actionPerformed(ActionEvent e) {

				Signup s = new Signup();
				s.setVisible(true);

			}
		});
		jb_login.addActionListener(new ActionListener() { // 텍스트 파일에 저장된 정보 ArrayList로 id,pw 일치 하면 Main 화면 띄움.

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

					while ((read = br.readLine()) != null) { // 텍스트 파일에 저장된 id,pw 불러서 ArrayList에 저장.
						int idx = read.indexOf(" ");
						ary_id.add(read.substring(0, idx));
						ary_pw.add(read.substring(idx + 1, (read.length() - 1) + 1));
					}

					while (true) { // 입력한 id, pw 비교하여 일치하면 Main창 띄움.
						for (int i = 0; i < ary_id.size(); i++) {
							if (set_id.equals(ary_id.get(i))) {
								if (set_pw.equals(ary_pw.get(i))) {
									fi.close();
									br.close();
									setVisible(false);
									Change ch = new Change();
									ch.change();
									ch.setVisible(true);
									break;
								} else {
									JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
									id.setText(id.getText());
									pw.setText("");
									break;
								}
							} else if(ary_id.size() == i+1) {
								JOptionPane.showMessageDialog(null, "가입되어있지 않은 아이디 입니다.");
							}
						}
						id.setText("");
						pw.setText("");
						break;
					}

				} catch (FileNotFoundException e1) { // 파일 경로 다를떄 팝업창 띄움. 파일 경로 재설정해야함.
					JOptionPane.showMessageDialog(null, "데이터 파일 찾을 수 없음.");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "데이터 파일 찾을 수 없음.");
				}

			}
		});

		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {

		new Home();

	}

}
