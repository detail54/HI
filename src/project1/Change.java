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
	public JPanel minibasket;
	public JPanel salelist;

	Change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 680);
		setLocation(270, 100);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.black);

			//ȭ�� ���� ��ٱ��� ����Ʈ ���� �г�
		minibasket = new JPanel();
		minibasket.setPreferredSize(new Dimension(300,700));
		minibasket.setOpaque(true);
		minibasket.setBackground(Color.black);
		c.add(minibasket,BorderLayout.WEST);

		JLabel minibasket_in = new JLabel("��ٱ��� �ڸ�");
		minibasket_in.setFont(new Font("������� ����", Font.BOLD, 18));
		minibasket_in.setPreferredSize(new Dimension(300,580));
		minibasket_in.setOpaque(true);
		minibasket_in.setBackground(Color.white);
		//center.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1, true));	//�׵θ� �ӽ� ����.
		minibasket.add(minibasket_in);
		
			//ȭ�� ������ ����� ȭ�� �г�. �ʱ�� Main���� ����.
		c.add(new Main(),BorderLayout.CENTER);
		
			//ȭ����ȯ �޴��� �̿��غ�. Ŭ���ϸ� �ش� ȭ�� �̵�
		JMenuBar menu_bar;
		menu_bar = new JMenuBar();
		menu_bar.setBackground(Color.black);
		menu_bar.setPreferredSize(new Dimension(80, 50));
		setJMenuBar(menu_bar);
			
			//�޴����������� �����ϰ� �޴��̸�, �׼��̺�Ʈ ����.
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

		//ȭ�� �̵���, ���� ��ٱ��ϸ���Ʈ ������ä ������ ȭ�鸸 �����Ű�� �޼ҵ�.
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
		} else if (a.equals("��ǻ��")) {
			getContentPane().remove(1);
			com = new Computer();
			getContentPane().add(com,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("ī�޶�")) {
			getContentPane().remove(1);
			ca = new Camera();
			getContentPane().add(ca,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("������")) {
			getContentPane().remove(1);
			air = new Airconditioner();
			getContentPane().add(air,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("�����")) {
			getContentPane().remove(1);
			re = new Refrigerator();
			getContentPane().add(re,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("��ٱ���")) {
			getContentPane().remove(1);
			ba = new Basket();
			getContentPane().add(ba,BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("   ����")) {
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
