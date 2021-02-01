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

	static int in;
	static JLabel jl1;
	static JLabel jl2;

	cla22() {

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.BLACK);

		jl1 = new JLabel("");
		jl1.setBackground(Color.BLACK);
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 40));
		jl1.setHorizontalAlignment(JLabel.RIGHT);

		jl2 = new JLabel(""); // ÀÌÀü °á°ú°ª ÀúÀå.
		jl2.setBackground(Color.BLACK);
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 40));
		jl2.setHorizontalAlignment(JLabel.RIGHT);

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
			jb[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));
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
			double result = Ca(get);

			if (result < 0) {
				jl1.setText(Double.toString(result));
				jl2.setText(Double.toString(result));
			} else if (result >= 10000000) {
				jl1.setText("0.0");
				jl2.setText("0.0");
			} else {
				jl1.setText(Double.toString(result));
				jl2.setText(Double.toString(result));
			}
		}
	}

	public double Ca(String ss) {
		int i;
		double d;
		in = 0;
		ArrayList<Double> a1 = new ArrayList<Double>();
		ArrayList<String> a2 = new ArrayList<String>();

		a2.add(null);
		String str = new String("");
		for (i = 0; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			String s = Character.toString(c);

			if (Character.isDigit(c)) {
				str += Character.toString(c);
				if (i == ss.length() - 1)
					a1.add(Double.parseDouble(str));
			} else if (s.equals("."))
				str += s;
			else {
				a1.add(Double.parseDouble(str));
				a2.add(Character.toString(c));
				str = "";
			}
		}
		if (in == 0) {
			for (i = 1; i < a1.size(); i++) {
				String s = a2.get(i);
				double tmp;

				if (s.equals("*")) {
					tmp = a1.get(i - 1) * a1.get(i);
					a2.remove(i);
					a1.remove(i);
					a1.remove(i - 1);
					a1.add(i - 1, tmp);
					i--;
				} else if (s.equals("/")) {
					tmp = a1.get(i - 1) / a1.get(i);
					a2.remove(i);
					a1.remove(i);
					a1.remove(i - 1);
					a1.add(i - 1, tmp);
					i--;
				}
			}

			d = a1.get(0);
			for (i = 1; i < a1.size(); i++) {
				String s = a2.get(i);
				double n = a1.get(i);

				if (s.compareTo("+") == 0)
					d += n;
				else if (s.compareTo("-") == 0)
					d -= n;
			}

			return d;
		}

		return 0;
	}

	public static void main(String[] args) {
		new cla22();
	}

}
