 package project1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//화면 전환 구현.

public class Change extends JFrame {

	public Main main = null;
	public Basket ba = null;
	public Refrigerator re = null;
	public Cellphone cell = null;
	public Airconditioner air = null;
	public Camera ca = null;
	public Computer com = null;
	public Tv tv = null;
	public Payment pay = null;
	public JPanel minibasket;
	public JPanel salelist;

	Change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 680);
		setLocation(270, 100);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.black);

			//화면 왼쪽 장바구니 리스트 구현 패널
		minibasket = new JPanel();
		minibasket.setPreferredSize(new Dimension(300,700));
		minibasket.setOpaque(true);
		minibasket.setBackground(Color.black);
		c.add(minibasket,BorderLayout.WEST);

		JLabel minibasket_in = new JLabel("장바구니 자리");
		minibasket_in.setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
		minibasket_in.setPreferredSize(new Dimension(300,580));
		minibasket_in.setOpaque(true);
		minibasket_in.setBackground(Color.white);
		//center.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1, true));	//테두리 임시 제거.
		minibasket.add(minibasket_in);
		
			//화면 오른쪽 변경될 화면 패널. 초기는 Main으로 지정.
		c.add(new Main(),BorderLayout.CENTER);
		
			//화면전환 메뉴바 이용해봄. 클릭하면 해당 화면 이동
		JMenuBar menu_bar;
		menu_bar = new JMenuBar();
		menu_bar.setBackground(Color.black);
		menu_bar.setPreferredSize(new Dimension(80, 50));
		setJMenuBar(menu_bar);
			
			//메뉴아이템으로 생성하고 메뉴이름, 액션이벤트 구현.
		String[] menuName = { "Main", "   TV", "컴퓨터", "카메라", "에어컨", "핸드폰", "냉장고", "장바구니", "   결제", "Log-Out" };
		JMenuItem[] jmenu = new JMenuItem[10];

		for (int i = 0; i < jmenu.length; i++) {
			jmenu[i] = new JMenu(menuName[i]);
			jmenu[i].setPreferredSize(new Dimension(100, 50));
			jmenu[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
			jmenu[i].setForeground(Color.white);
			jmenu[i].setBackground(Color.black);
			jmenu[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menu_bar.add(jmenu[i]);

			String val = menuName[i];
			if (i == 9) {
				jmenu[i].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
						Home h = new Home();
						h.setVisible(true);
					}
				});
			} else {
				jmenu[i].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						change(val);
					}
				});
			}
		}

		setVisible(true);

	}

		//화면 이동시, 왼쪽 장바구니리스트 유지한채 오른쪽 화면만 변경시키는 메소드.
	public void change(String a) {

		if (a.equals("Main")) {
			getContentPane().remove(1);
			main = new Main();
			getContentPane().add(main,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("   TV")) {
			getContentPane().remove(1);
			tv = new Tv();
			getContentPane().add(tv,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("컴퓨터")) {
			getContentPane().remove(1);
			com = new Computer();
			getContentPane().add(com,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("카메라")) {
			getContentPane().remove(1);
			ca = new Camera();
			getContentPane().add(ca,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("에어컨")) {
			getContentPane().remove(1);
			air = new Airconditioner();
			getContentPane().add(air,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("냉장고")) {
			getContentPane().remove(1);
			re = new Refrigerator();
			getContentPane().add(re,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("장바구니")) {
			getContentPane().remove(1);
			ba = new Basket();
			getContentPane().add(ba,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("   결제")) {
			getContentPane().remove(1);
			pay = new Payment();
			getContentPane().add(pay,BorderLayout.CENTER);
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {

		new Change();
	}

}
