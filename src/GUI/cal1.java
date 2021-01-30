package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class cal1 extends JFrame {

	cal1() {

		Container c = getContentPane();
		c.setBackground(Color.black);

		JLabel jl1 = new JLabel("°è»ê±â");
		jl1.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
		jl1.setForeground(Color.white);

		JTextArea ja = new JTextArea(2, 20);
		ja.setBackground(Color.black);
		ja.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
		ja.setForeground(Color.LIGHT_GRAY);

		c.setLayout(new FlowLayout());

		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(300, 70));
		jp.setBackground(Color.black);
		c.add(jp);
		jp.add(jl1);
		jp.add(ja);

		JPanel jp2 = new JPanel();
		c.add(jp2);
		jp2.setPreferredSize(new Dimension(350, 200));
		jp2.setLayout(new GridLayout(4, 4));
		jp2.setBackground(Color.black);

		String[] str = { "7", "8", "9", "<", "4", "5", "6", "+", "1", "2", "3", "-", "/", "0", "*", "=" };

		JButton[] jb = new JButton[16];

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			jp2.add(jb[i]);
			jb[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
			jb[i].setBackground(Color.GRAY);
			jb[i].setForeground(Color.white);

			String b = jb[i].getText();

			if (!(str[i].charAt(0) >= '<' && str[i].charAt(0) <= '=')) {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ja.append(b);
					}
				});
			} else if (str[i].charAt(0) == '=') {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String index = ja.getText();
						Integer num1 = 0;
						Integer num2 = 0;
						int st1 = 0;
						int st2 = 0;

						if (index.contains("*")) {
							int n = index.indexOf("*");
							int n2 = index.indexOf("*");

							while (true) {
								n2--;
								if(n2 == 0) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
							}
							n2 = index.indexOf("*");
							while (true) {
								n2++;
								if(index.length()-1 == n2) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
							}
							String result = Integer.toString(num1 * num2);
							index = index.replace(index.substring(st1, st2), result);
						}
						if (index.contains("/")) {
							int n = index.indexOf("/");
							int n2 = index.indexOf("/");

							while (true) {
								n2--;
								if(n2 == 0) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
							}
							n2 = index.indexOf("/");
							while (true) {
								n2++;
								if(index.length()-1 == n2) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
							}
							String result = Integer.toString(num1 / num2);
							index = index.replace(index.substring(st1, st2), result);
						}
						if (index.contains("+")) {
							int n = index.indexOf("+");
							int n2 = index.indexOf("+");

							while (true) {
								n2--;
								if(n2 == 0) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
							}
							n2 = index.indexOf("+");
							while (true) {
								n2++;
								if(index.length()-1 == n2) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
							}
							String result = Integer.toString(num1 + num2);
							index = index.replace(index.substring(st1, st2), result);
						}
						if (index.contains("-")) {
							int n = index.indexOf("-");
							int n2 = index.indexOf("-");

							while (true) {
								n2--;
								if(n2 == 0) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num1 = Integer.parseInt(index.substring(n2, n));
									st1 = n2+1;
									break;
								}
							}
							n2 = index.indexOf("-");
							while (true) {
								n2++;
								if(index.length()-1 == n2) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
								if (!(index.charAt(n2) >= '0' && index.charAt(n2) >= '9')) {
									num2 = Integer.parseInt(index.substring(n + 1, n2+1));
									st2 = n2+1;
									break;
								}
							}
							String result = Integer.toString(num1 - num2);
							index = index.replace(index.substring(st1, st2), result);
						}
						ja.setText(index);

					}
				});
			} else if (str[i].charAt(0) == '<') {
				jb[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n = ja.getText().length() - 1;
						if (n == 0) {
							ja.setText("");
						}
						ja.setText(ja.getText().substring(0, n));
					}
				});
			}
		}

		setSize(400, 370);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {

		new cal1();

	}

}
