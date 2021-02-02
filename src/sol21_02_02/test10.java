package sol21_02_02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test10 extends JFrame {

	test10() {

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel jp1;
		JPanel jp2;
		JPanel jp3;
		JLabel eng;
		JLabel kor;
		JTextField eng_text;
		JTextField kor_text;
		JButton jb1;
		JButton jb2;
		JTextArea ja;

		jp1 = new JPanel();
		jp1.setPreferredSize(new Dimension(400, 30));
		jp1.setLayout(new FlowLayout());
		eng = new JLabel("영어");
		eng_text = new JTextField(10);
		kor = new JLabel("한글");
		kor_text = new JTextField(10);

		jp1.add(eng);
		jp1.add(eng_text);
		jp1.add(kor);
		jp1.add(kor_text);
		c.add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jb1 = new JButton("삽입");
		jb2 = new JButton("찾기");

		jp2.add(jb1);
		jp2.add(jb2);
		c.add(jp2, BorderLayout.CENTER);

		jp3 = new JPanel();
		jp3.setPreferredSize(new Dimension(400, 250));
		jp3.setLayout(new FlowLayout());
		ja = new JTextArea(10, 30);

		jp3.add(ja);
		c.add(jp3, BorderLayout.SOUTH);

		HashMap<String, String> h = new HashMap<String, String>();
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String e1 = eng_text.getText();
				String k1 = kor_text.getText();

				if (!h.containsKey(e1)) {
					h.put(e1, k1);
					ja.append(jb1.getText() + " (" + e1 + "," + k1 + ")\n");
					eng_text.setText("");
					kor_text.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "이미 등록되어있는 단어입니다.");
					eng_text.setText("");
					kor_text.setText("");
				}

			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < h.size(); i++) {
					String e1 = eng_text.getText();
					String ko = h.get(e1);
					if (!h.containsKey(e1)) {
						JOptionPane.showMessageDialog(null, "없는 단어");
						eng_text.setText("");
						kor_text.setText("");
					} else {
						eng_text.setText(e1);
						kor_text.setText(ko);
					}

				}
			}
		});

		setSize(350, 360);
		setVisible(true);

	}

	public static void main(String[] args) {

		new test10();

	}

}
