 package project1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//ȭ�� ��ȯ ����.

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
	public JPanel jm;

	Change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 700);
		setLocation(270, 100);

		Container c = getContentPane();
		c.setLayout(new CardLayout(0, 15));
		c.setBackground(Color.black);

		jm = new JPanel();
		jm.setOpaque(true);
		jm.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		c.add(jm);

		JLabel center = new JLabel(Integer.toString((int) (Math.random() * 50)));
		center.setFont(new Font("������� ����", Font.BOLD, 18));
		jm.add(center);

		JMenuBar menu_bar;
		menu_bar = new JMenuBar();
		menu_bar.setBackground(Color.black);
		menu_bar.setPreferredSize(new Dimension(80, 50));
		setJMenuBar(menu_bar);

		// �޴��� �̿��غ�. Ŭ���ϸ� �ش� ȭ�� �̵�
		String[] menuName = { "Main", "   TV", "��ǻ��", "ī�޶�", "������", "�ڵ���", "�����", "��ٱ���", "   ����", "Log-Out" };
		JMenuItem[] jmenu = new JMenuItem[10];

		for (int i = 0; i < jmenu.length; i++) {
			jmenu[i] = new JMenu(menuName[i]);
			jmenu[i].setPreferredSize(new Dimension(100, 50));
			jmenu[i].setFont(new Font("������� ����", Font.BOLD, 18));
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

	public void change(String a) {

		if (a.equals("Main")) {
			getContentPane().removeAll();
			main = new Main();
			getContentPane().add(main);
			revalidate();
			repaint();
		} else if (a.equals("   TV")) {
			getContentPane().removeAll();
			tv = new Tv();
			getContentPane().add(tv);
			revalidate();
			repaint();
		} else if (a.equals("��ǻ��")) {
			getContentPane().removeAll();
			com = new Computer();
			getContentPane().add(com);
			revalidate();
			repaint();
		} else if (a.equals("ī�޶�")) {
			getContentPane().removeAll();
			ca = new Camera();
			getContentPane().add(ca);
			revalidate();
			repaint();
		} else if (a.equals("������")) {
			getContentPane().removeAll();
			air = new Airconditioner();
			getContentPane().add(air);
			revalidate();
			repaint();
		} else if (a.equals("�����")) {
			getContentPane().removeAll();
			re = new Refrigerator();
			getContentPane().add(re);
			revalidate();
			repaint();
		} else if (a.equals("��ٱ���")) {
			getContentPane().removeAll();
			ba = new Basket();
			getContentPane().add(ba);
			revalidate();
			repaint();
		} else if (a.equals("   ����")) {
			getContentPane().removeAll();
			pay = new Payment();
			getContentPane().add(pay);
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {

		new Change();
	}

}
