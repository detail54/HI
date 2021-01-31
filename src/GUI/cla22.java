package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class cla22 extends JFrame {

	static int check;
	static int flag;
	static JLabel jl1;
	static JLabel jl2;

	cla22() {

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.BLACK);

		jl1 = new JLabel("");
		jl1.setBackground(Color.BLACK);
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("�������� ����", Font.BOLD, 40));
		jl1.setHorizontalAlignment(SwingConstants.RIGHT);
		if ((jl1.getText()).length() >= 16) {
			jl1.setFont(new Font("�������� ����", Font.BOLD, 25));
		}
		if ((jl1.getText()).length() >= 23) {
			jl1.setFont(new Font("�������� ����", Font.BOLD, 18));
		}

		jl2 = new JLabel(""); // ���� ����� ����.
		jl2.setBackground(Color.BLACK);
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("�������� ����", Font.BOLD, 40));
		jl2.setHorizontalAlignment(SwingConstants.RIGHT);

		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2, 1));
		jp1.setBackground(Color.BLACK);
		jp1.add(jl1);
		jp1.add(jl2);

		c.add(jp1, BorderLayout.NORTH);

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 4, 5, 5));
		jp2.setBackground(Color.BLACK);
		jp2.setPreferredSize(new Dimension(300, 280));

		String[] str = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "<", "0", "=", "+" };
		JButton[] jb = new JButton[16];

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			jp2.add(jb[i]);
			jb[i].setFont(new Font("�������� ����", Font.BOLD, 20));
			jb[i].setBackground(Color.GRAY);
			jb[i].setForeground(Color.white);
		}

		for (int i = 0; i < jb.length; i++) {
			char ch = jb[i].getText().charAt(0);
			if (i % 4 != 3 && i < 11) {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton bb = (JButton) e.getSource();
						String t1 = jl1.getText();
						String t2 = bb.getText();
						jl1.setText(t1 + t2);
					}
				});
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton bb = (JButton) e.getSource();
						String t1 = jl1.getText();
						String t2 = bb.getText();
						jl1.setText(t1 + t2);
					}
				});
			} else if (ch == '<') {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n = jl1.getText().length() - 1;
						if (n == 0) {
							jl1.setText("");
						} else {
							jl1.setText(jl1.getText().substring(0, n));
						}
					}
				});
			} else if (ch == '=') {
				jb[i].addActionListener(new Result());
			}
		}

		c.add(jp2, BorderLayout.SOUTH);

		setSize(400, 500);
		setVisible(true);

	}
	public class Result implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String get = jl1.getText();
			double result = Calculator(get);

			if (result < 0) {
				jl1.setText(Double.toString(result));
				flag = 1;
			} else if (result >= 10000000) {
				jl1.setText("0.0");
			} else
				jl1.setText(Double.toString(result));
		}
	}

	public double Calculator(String ss) {
		int i;
		double ans;
		check = 0;
		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();

		op.add(null);
		String str = new String("");
		for (i = 0; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			String s = Character.toString(c);

			if (Character.isDigit(c)) {
				str += Character.toString(c);
				if (i == ss.length() - 1)
					v.add(Double.parseDouble(str));
			} else if (s.equals("."))
				str += s;
			else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}

		for (i = 0; i < v.size(); i++) {
			if (v.get(i) >= 10000000) {
				check = 1;
				break;
			}
		}

		if (check == 0) {
			for (i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double tmp;

				if (s.equals("*")) {
					tmp = v.get(i - 1) * v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i - 1);
					v.add(i - 1, tmp);
					i--;
				} else if (s.equals("/")) {
					tmp = v.get(i - 1) / v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i - 1);
					v.add(i - 1, tmp);
					i--;
				}
			}

			ans = v.get(0);
			for (i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double n = v.get(i);

				if (s.compareTo("+") == 0)
					ans = ans + n;
				else if (s.compareTo("-") == 0)
					ans = ans - n;
			}

			return ans;
		}

		return 0;
	}

	public static void main(String[] args) {
		new cla22();
	}

}
