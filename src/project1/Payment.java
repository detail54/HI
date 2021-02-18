package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Payment extends JFrame{

	Change ch = new Change();
	public static DefaultTableModel model;
	
	Payment() {
		setTitle("����Ȯ��");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.black);

		JPanel itemlist = new JPanel();
		itemlist.setOpaque(true);
		itemlist.setBackground(Color.white);
		itemlist.setPreferredSize(new Dimension(480, 470));
		c.add(itemlist);

		ImageIcon[] image = new ImageIcon[ch.model.getRowCount()];

		for (int i = 0; i < ch.model.getRowCount(); i++) {
			String get = (String) ch.model.getValueAt(i, 0);
			image[i] = new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/" + get + ".png");
		}

		Object set[][] = new Object[ch.model.getRowCount()][4];		//jtabel ������ �Է�

		for (int i = 0; i < ch.model.getRowCount(); i++) {
			String get1 = (String) ch.model.getValueAt(i, 0);
			String get2 = (String) ch.model.getValueAt(i, 1);
			String get3 = (String) ch.model.getValueAt(i, 2);
			
			set[i][0] = image[i];
			set[i][1] = get1;
			set[i][2] = get2;
			set[i][3] = get3;
		}

		String[] buyItemHeader = { "��ǰ", "��ǰ��", "����", "�ݾ�" };

		model = new DefaultTableModel(set, buyItemHeader) {
			public Class getColumnClass(int c) { // JTable 0�� ����Ʈ�� �����Ͽ� ��׶���� ���� �̹��� ǥ�Ⱑ���ϰ���.
				return getValueAt(0, c).getClass();
			}
		};

		JTable buyItemTable = new JTable(model);
		buyItemTable.getColumnModel().getColumn(0).setPreferredWidth(160);
		buyItemTable.getColumnModel().getColumn(1).setPreferredWidth(70);
		buyItemTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		buyItemTable.getColumnModel().getColumn(3).setPreferredWidth(120);
		buyItemTable.setRowHeight(120);
		buyItemTable.setFont(new Font("������� ����", Font.BOLD, 15));

		JScrollPane js = new JScrollPane(buyItemTable);
		js.setPreferredSize(new Dimension(480, 469));
		js.getViewport().setBackground(Color.WHITE);
		itemlist.add(js);

		JLabel totalPrice = new JLabel("�����ݾ�: "); // �� �����ݾ� Ȯ��
		totalPrice.setPreferredSize(new Dimension(250, 20));
		totalPrice.setFont(new Font("������� ����", Font.BOLD, 18));
		totalPrice.setForeground(Color.white);
		c.add(totalPrice);

		Integer total = 0;

		for (int j = 0; j < model.getRowCount(); j++) {
			total += Integer.parseInt(((String) model.getValueAt(j, 3)).replaceAll(",", ""));
		}

		String totalset = String.format("%,d", total);
		totalPrice.setText("�����ݾ�: " + totalset + " ��");

		JButton rowremove = new JButton("����"); // ���� ���Ź�ư
		rowremove.setFont(new Font("������� ����", Font.BOLD, 30));
		rowremove.setForeground(Color.white);
		rowremove.setPreferredSize(new Dimension(230, 80));
		rowremove.setOpaque(true);
		rowremove.setBackground(Color.black);
		c.add(rowremove);

		rowremove.addMouseListener(new MouseAdapter() {	//���� ��ư ������ ����â ��ٱ��� ����Ʈ �ʱ�ȭ + ������ ���
			public void mouseClicked(MouseEvent e) {
				new ReceiptCash();
				setVisible(false);
			}
		});

		JButton paybutton = new JButton("ī��"); // ī�� ���Ź�ư
		paybutton.setFont(new Font("������� ����", Font.BOLD, 30));
		paybutton.setForeground(Color.white);
		paybutton.setPreferredSize(new Dimension(230, 80));
		paybutton.setOpaque(true);
		paybutton.setBackground(Color.black);
		c.add(paybutton);

		paybutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ReceiptCard();
				setVisible(false);
			}
		});

		setSize(500, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new Payment();
	}

}
