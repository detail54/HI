package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ReceiptCard extends JFrame {

	Change ch = new Change();

	public static JLabel b2; // �Է��� ī���ȣ ǥ��
	public static JLabel b3; // ������ �ݾ� ǥ��

	ReceiptCard() {
		setTitle("ī�����");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				for (int i = 0; i < ch.model.getRowCount(); i++) {
					ch.model.setRowCount(i);
				}
				ch.totalPrice.setText("�����ݾ�: ");
				setVisible(false);
			}
		});

		// ��� ������ ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.black);

		// ������ ��µǴ� �� ó�� ���� �̵������� �г�
		JPanel jp = new JPanel();

		// setHorizontalAlignment(jp.CENTER);
		jp.setLayout(null);
		jp.setFont(new Font("������� ����", Font.BOLD, 20));
		jp.setPreferredSize(new Dimension(420, 1100));
		jp.setOpaque(true);
		jp.setBackground(Color.white);
		c.add(jp);

		// ������� ��� ���� �̵�
		class Th extends Thread {

			int y = 600;

			public void run() {
				for (int i = 0; i < 110; i++) {
					y = y - 10;
					jp.setLocation(0, y);
					try {
						Thread.sleep(17);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		Th th = new Th();
		th.start();

		// ������ ����------------------------------------------------
		// itemlist �ҷ��ͼ� �̸�, ����, �ݾ׺��� ���� ����
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> price = new ArrayList<>();

		for (int i = 0; i < ch.model.getRowCount(); i++) {
			name.add((String) ch.model.getValueAt(i, 0));
			num.add((String) ch.model.getValueAt(i, 1));
			price.add((String) ch.model.getValueAt(i, 2));
		}

		JLabel top = new JLabel("<html>Black-Market<br>==================================<html>");
		top.setFont(new Font("������� ����", Font.BOLD, 20));
		top.setBounds(0, 550, 420, 40);
		jp.add(top);
		JLabel top1 = new JLabel("<html>��ǰ��&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
				+ "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
				+ "����&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
				+ "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�ݾ�<html>");

		top1.setFont(new Font("������� ����", Font.BOLD, 13));
		top1.setPreferredSize(new Dimension(420, 50));
		top1.setBounds(0, 590, 410, 20);
		jp.add(top1);

		int y = 620; // y�� ������ ����.
		int cc; // ��Ʈ ũ�� ���� ����.
		int h; // ���̺� ���� ���� ����.
		int s; // y�� ���� ���� ����.

		JLabel listname[] = new JLabel[name.size()]; // ��ǰ�� �߰��� ���̺�
		JLabel listnum[] = new JLabel[name.size()]; // ���� �߰��� ���̺�
		JLabel listprice[] = new JLabel[name.size()]; // ���� �߰��� ���̺�

		for (int i = 0; i < listname.length; i++) {
			if (listname.length >= 16) {
				cc = 11;
				h = 15;
				s = 15;
			} else {
				cc = 13;
				h = 20;
				s = 25;
			}

			listname[i] = new JLabel(name.get(i));
			listnum[i] = new JLabel(num.get(i));
			listprice[i] = new JLabel(price.get(i));

			listname[i].setFont(new Font("������� ����", Font.BOLD, cc));
			listname[i].setBounds(0, y, 110, h);
			jp.add(listname[i]);

			listnum[i].setFont(new Font("������� ����", Font.BOLD, cc));
			listnum[i].setBounds(120, y, 80, h);
			jp.add(listnum[i]);

			listprice[i].setFont(new Font("������� ����", Font.BOLD, cc));
			listprice[i].setBounds(210, y, 140, h);
			jp.add(listprice[i]);

			y += s;
		}

		// ������ �ϴ� ���� ����, �����ݾ� ǥ�� �г�
		JPanel bott = new JPanel();
		bott.setLayout(null);
		bott.setFont(new Font("������� ����", Font.BOLD, 18));
		bott.setOpaque(true);
		bott.setBackground(Color.white);
		bott.setBounds(0, 1000, 420, 100);
		jp.add(bott);

		JLabel b1 = new JLabel("======================================");
		b1.setFont(new Font("������� ����", Font.BOLD, 18));
		b1.setBounds(0, 0, 405, 20);
		bott.add(b1);

		// �Է��� ī���ȣ
		b2 = new JLabel();
		b2.setFont(new Font("������� ����", Font.BOLD, 18));
		b2.setBounds(0, 20, 405, 25);
		b2.setHorizontalAlignment(b2.RIGHT);
		bott.add(b2);

		// ������ �ݾ�
		b3 = new JLabel(ch.totalPrice.getText());
		b3.setFont(new Font("������� ����", Font.BOLD, 30));
		b3.setBounds(0, 45, 405, 50);
		b3.setHorizontalAlignment(b3.RIGHT);
		bott.add(b3);

		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new ReceiptCard();
	}

}
