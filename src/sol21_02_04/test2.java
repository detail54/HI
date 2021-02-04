package sol21_02_04;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2 extends JFrame {

	test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 3));

		JPanel jp[] = new JPanel[3];
		JButton[] jb_choice = new JButton[3];
		JButton[] jb_plus = new JButton[3];
		JButton[] jb_minus = new JButton[3];
		JButton[] jb_ok = new JButton[3];
		JLabel[] jl_price = new JLabel[3];
		JLabel[] jl_sum = new JLabel[3];
		JTextField[] jt = new JTextField[3];

		String[] a = { "¾Æ¸Þ¸®Ä«³ë", "Ä«Æä¶ó¶¼", "Ä«ÇªÄ¡³ë" };
		String[] b = { "5000¿ø", "5500¿ø", "6000¿ø" };

		for (int i = 0; i < 3; i++) {
			jp[i] = new JPanel();
			jb_choice[i] = new JButton(a[i]);
			jb_choice[i].setForeground(Color.white);
			jb_choice[i].setBackground(Color.black);
			jb_choice[i].setPreferredSize(new Dimension(160, 160));
			jb_choice[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));

			jb_plus[i] = new JButton("+");
			jb_plus[i].setForeground(Color.white);
			jb_plus[i].setBackground(Color.black);
			jb_plus[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
			jb_plus[i].setEnabled(false);

			jb_minus[i] = new JButton("-");
			jb_minus[i].setForeground(Color.white);
			jb_minus[i].setBackground(Color.black);
			jb_minus[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
			jb_minus[i].setEnabled(false);

			jb_ok[i] = new JButton("ok");
			jb_ok[i].setPreferredSize(new Dimension(170, 50));
			jb_ok[i].setBackground(new Color(195, 195, 195));
			jb_ok[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));
			jb_ok[i].setEnabled(false);

			jl_price[i] = new JLabel(b[i]);
			jl_price[i].setPreferredSize(new Dimension(160, 60));
			jl_price[i].setHorizontalAlignment(JLabel.CENTER);
			jl_price[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));

			jt[i] = new JTextField(7);
			jt[i].setText("0");
			jt[i].setPreferredSize(new Dimension(7, 30));

			jl_sum[i] = new JLabel("");
			jl_sum[i].setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));

			if (i == 1) {
				jp[i].setLayout(new FlowLayout());
				jp[i].setBackground(new Color(185, 122, 87));
				jp[i].add(jb_choice[i]);
				jp[i].add(jl_price[i]);
				jp[i].add(jb_plus[i]);
				jp[i].add(jt[i]);
				jp[i].add(jb_minus[i]);
				jp[i].add(jb_ok[i]);
				jp[i].add(jl_sum[i]);
				c.add(jp[i]);
			} else {
				jp[i].setLayout(new FlowLayout());
				jp[i].setBackground(new Color(136, 0, 21));
				jp[i].add(jb_choice[i]);
				jp[i].add(jl_price[i]);
				jp[i].add(jb_plus[i]);
				jp[i].add(jt[i]);
				jp[i].add(jb_minus[i]);
				jp[i].add(jb_ok[i]);
				jp[i].add(jl_sum[i]);
				c.add(jp[i]);
			}

			int n = i;
						//´©¸¥ Ä¿ÇÇ¸¸ ¹öÆ° È°¼ºÈ­
			jb_choice[n].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if (n == 0) {
						jb_plus[n].setEnabled(true);
						jb_minus[n].setEnabled(true);
						jb_ok[n].setEnabled(true);
						for (int j = 1; j < 3; j++) {
							jb_plus[j].setEnabled(false);
							jb_minus[j].setEnabled(false);
							jb_ok[j].setEnabled(false);
							jl_sum[j].setText("");
							jt[j].setText("0");
						}
					} else if (n == 1) {
						jb_plus[n].setEnabled(true);
						jb_minus[n].setEnabled(true);
						jb_ok[n].setEnabled(true);
						for (int j = 0; j < 3; j++) {
							if (j == 1) {
								continue;
							} else {
								jb_plus[j].setEnabled(false);
								jb_minus[j].setEnabled(false);
								jb_ok[j].setEnabled(false);
								jl_sum[j].setText("");
								jt[j].setText("0");
							}
						}
					} else if (n == 2) {
						jb_plus[n].setEnabled(true);
						jb_minus[n].setEnabled(true);
						jb_ok[n].setEnabled(true);
						for (int j = 0; j < 2; j++) {
							jb_plus[j].setEnabled(false);
							jb_minus[j].setEnabled(false);
							jb_ok[j].setEnabled(false);
							jl_sum[j].setText("");
							jt[j].setText("0");
						}
					}
				}
			});	
			jb_plus[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sum = Integer.parseInt(jt[n].getText());
					jt[n].setText(Integer.toString(sum + 1));
				}
			});
			jb_minus[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (jt[n].getText().equals("0")) {
						jt[n].setText("0");
					} else {
						int sum = Integer.parseInt(jt[n].getText());
						jt[n].setText(Integer.toString(sum - 1));
					}
				}
			});
			jb_ok[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String pr = jl_price[n].getText();
					int price = Integer.parseInt(pr.substring(0, pr.length() - 1));
					int mul = Integer.parseInt(jt[n].getText());

					jl_sum[n].setText(Integer.toString(price * mul) + "¿ø");
				}
			});
		}
		
		setSize(600, 450);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test2();
	}

}
