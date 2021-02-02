package project1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	String[] menuName = { "Main", "   TV", "컴퓨터", "카메라", "에어컨", "핸드폰", "냉장고", "장바구니", "   결제", "Log-Out" };
	JMenuItem[] jmenu = new JMenuItem[10];

	Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 700);
		setLocation(270, 100);

		Container c = getContentPane();
		c.setLayout(new CardLayout(0, 15));
		c.setBackground(Color.black);

		JLabel center = new JLabel();
		center.setOpaque(true);
		center.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		center.setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
		c.add(center);

		JMenuBar menu_bar;
		menu_bar = new JMenuBar();
		menu_bar.setBackground(Color.black);
		menu_bar.setPreferredSize(new Dimension(80, 50));
		setJMenuBar(menu_bar);

		// 메뉴바 이용해봄. 클릭하면 해당 화면 이동

		for (int i = 0; i < jmenu.length; i++) {
			jmenu[i] = new JMenu(menuName[i]);
			jmenu[i].setPreferredSize(new Dimension(100, 50));
			jmenu[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
			jmenu[i].setForeground(Color.white);
			jmenu[i].setBackground(Color.black);
			jmenu[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menu_bar.add(jmenu[i]);

		}

		for (int i = 0; i < jmenu.length; i++) {
			create();
		}

		setVisible(true);

	}

	void create() {
		jmenu[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				setVisible(true);
			}
		});
		jmenu[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tv tv = new Tv();
				tv.setVisible(true);
				setVisible(false);
			}
		});
		jmenu[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Computer com = new Computer();
				com.setVisible(true);
			}
		});
		jmenu[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Camera ca = new Camera();
				ca.setVisible(true);
			}
		});
		jmenu[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Airconditioner air = new Airconditioner();
				air.setVisible(true);
			}
		});
		jmenu[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Airconditioner air = new Airconditioner();
				air.setVisible(true);
			}
		});
		jmenu[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cellphone cell = new Cellphone();
				cell.setVisible(true);
			}
		});
		jmenu[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Refrigerator re = new Refrigerator();
				re.setVisible(true);
			}
		});
		jmenu[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Basket ba = new Basket();
				ba.setVisible(true);
			}
		});

		jmenu[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
			}
		});
	}

	

	public static void main(String[] args) {

		new Main();

	}

}
