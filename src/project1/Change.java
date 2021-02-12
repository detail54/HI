package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


//ȭ�� ��ȯ ����.

public class Change extends JFrame {

	public Main main;
	public Basket ba;
	public Refrigerator re;
	public Cellphone cell;
	public Airconditioner air;
	public Camera ca;
	public Computer com;
	public Tv tv;
	public Payment pay;
	public JButton basketButton;
	public JButton payButton;
	public static String[] buyItemHeader = { "��ǰ��", "����", "�ݾ�" };
	public static DefaultTableModel model = new DefaultTableModel(buyItemHeader, 0);
	public JTable buyItemTable = new JTable(model);
	public JScrollPane js;
	public String in1;
	public String in2;
	public String in3;
	public static JLabel totalPrice;

	public void change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 680);
		setLocation(270, 100);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.black);

		// ȭ�� ���� ��ٱ��� ����Ʈ ���� �г�
		JPanel minibasket = new JPanel();
		minibasket.setLayout(new FlowLayout());
		minibasket.setPreferredSize(new Dimension(300, 700));
		minibasket.setOpaque(true);
		minibasket.setBackground(Color.black);
		c.add(minibasket, BorderLayout.WEST);

		JPanel minibasket_in = new JPanel();
		minibasket_in.setLayout(new FlowLayout());
		minibasket_in.setFont(new Font("������� ����", Font.BOLD, 18));
		minibasket_in.setPreferredSize(new Dimension(300, 580));
		minibasket_in.setOpaque(true);
		minibasket_in.setBackground(Color.white);
		minibasket.add(minibasket_in);

		buyItemTable.setShowHorizontalLines(false); // ���� �� ����
		buyItemTable.setShowVerticalLines(false); // ���� �� ����
		js = new JScrollPane(buyItemTable);
		js.setPreferredSize(new Dimension(280, 378));
		minibasket_in.add(js);
		// model.addRow(new Object[] {" "," "," "});
		
		totalPrice = new JLabel("�����ݾ�: ");	//�� �����ݾ� Ȯ��
		totalPrice.setPreferredSize(new Dimension(250, 20));
		totalPrice.setFont(new Font("������� ����", Font.BOLD, 18));
		minibasket_in.add(totalPrice);
		
		JButton rowremove = new JButton("����");
		rowremove.setPreferredSize(new Dimension(265, 20));
		rowremove.setFont(new Font("������� ����", Font.BOLD, 18));
		rowremove.setForeground(Color.white);
		rowremove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rowremove.setOpaque(true);
		rowremove.setBackground(Color.black);
		minibasket_in.add(rowremove);
		
		rowremove.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int select = buyItemTable.getSelectedRow();
				model.removeRow(select);
				
				Integer total = 0;	//���� �� �����ݾ� ����.
				for (int j = 0; j < model.getRowCount(); j++) {
					total += Integer.parseInt(((String) model.getValueAt(j, 2)).replaceAll(",", ""));
				}
				String totalset = String.format("%,d",total);
				totalPrice.setText("�����ݾ�: "+totalset+" ��");
			}
		});

		JButton basketButton = new JButton("��ٱ���");
		basketButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		basketButton.setFont(new Font("������� ����", Font.BOLD, 23));
		basketButton.setForeground(Color.white);
		basketButton.setPreferredSize(new Dimension(130, 100));
		basketButton.setOpaque(true);
		basketButton.setBackground(Color.black);

		JButton payButton = new JButton("����");
		payButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		payButton.setFont(new Font("������� ����", Font.BOLD, 23));
		payButton.setForeground(Color.white);
		payButton.setPreferredSize(new Dimension(130, 100));
		payButton.setOpaque(true);
		payButton.setBackground(Color.black);

		minibasket_in.add(basketButton);
		minibasket_in.add(payButton);

		// ȭ�� ������ ����� ȭ�� �г�. �ʱ�� Main���� ����.
		c.add(new Main(), BorderLayout.CENTER);

		// ȭ����ȯ �޴��� �̿��غ�. Ŭ���ϸ� �ش� ȭ�� �̵�
		JMenuBar menu_bar;
		menu_bar = new JMenuBar();
		menu_bar.setBackground(Color.black);
		menu_bar.setPreferredSize(new Dimension(80, 50));
		setJMenuBar(menu_bar);

		// �޴����������� �����ϰ� �޴��̸�, �׼��̺�Ʈ ����.
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
		// setResizable(false);

	}

	// ȭ�� �̵���, ���� ��ٱ��ϸ���Ʈ ������ä ������ ȭ�鸸 �����Ű�� �޼ҵ�.
	public void change(String a) {

		if (a.equals("Main")) {
			getContentPane().remove(1);
			main = new Main();
			getContentPane().add(main, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("   TV")) {
			getContentPane().remove(1);
			tv = new Tv();
			getContentPane().add(tv, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("��ǻ��")) {
			getContentPane().remove(1);
			com = new Computer();
			getContentPane().add(com, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("ī�޶�")) {
			getContentPane().remove(1);
			ca = new Camera();
			getContentPane().add(ca, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("������")) {
			getContentPane().remove(1);
			air = new Airconditioner();
			getContentPane().add(air, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("�����")) {
			getContentPane().remove(1);
			re = new Refrigerator();
			getContentPane().add(re, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("��ٱ���")) {
			getContentPane().remove(1);
			ba = new Basket();
			getContentPane().add(ba, BorderLayout.CENTER);
			revalidate();
			repaint();
		} else if (a.equals("   ����")) {
			getContentPane().remove(1);
			pay = new Payment();
			getContentPane().add(pay, BorderLayout.CENTER);
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {

		Change c = new Change();
		c.change();
	}

}
