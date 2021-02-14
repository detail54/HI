package project1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Tv extends JPanel {

	Change c = new Change();
	public JLabel[] itemLabel = new JLabel[6]; // ��ǰ ĭ
	public JLabel[] itemImgLabel = new JLabel[6];
	public JLabel[] itemNameLabel = new JLabel[6];
	public JLabel[] priceLabel = new JLabel[6]; // ���󰡰ݷ��̺�
	public JLabel[] saleLabel = new JLabel[6]; // ���ΰ��ݷ��̺�
	public JLabel[] saleTextLabel = new JLabel[6];

	Tv() {
		this.setBackground(Color.black);
		setOpaque(true);

		JLabel center = new JLabel();
		center.setPreferredSize(new Dimension(680, 580));
		center.setFont(new Font("������� ����", Font.BOLD, 18));
		center.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		center.setOpaque(true);
		center.setBackground(Color.white);
		center.setLayout(new GridLayout(2, 3));
		add(center);
		ImageIcon[] itemImg = { new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv1.jpg"),
				new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv2.jpg"),
				new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv3.jpg"),
				new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv4.jpg"),
				new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv5.jpg"),
				new ImageIcon("C:/Users/82109/eclipse-workspace/HI/src/project1/Img/tv6.jpg") };

		String[] itemName = { "Tv1", "Tv2", "Tv3", "Tv4", "Tv5", "Tv6" }; // ��ǰ��
		String[] itemPrice = { "���� 295,000��", "���� 2,140,000��", "���� 208,900��", "���� 430,000��", "���� 219,000��",
				"���� 2,990,000��" };// ���󰡰�

		int[] salePrice = { (int) (Math.random() * 195000) + 100000, (int) (Math.random() * 2040000) + 100000,
				(int) (Math.random() * 158900) + 50000, (int) (Math.random() * 330000) + 100000,
				(int) (Math.random() * 189000) + 30000, (int) (Math.random() * 2890000) + 100000 }; // ���ΰ���

		for (int i = 0; i < itemLabel.length; i++) {
			int n = i; // �׼Ǹ����� �ε�����
			String p = String.valueOf(itemPrice[i]); // ���ΰ� ���ڿ� ��ȯ.

			itemLabel[i] = new JLabel();
			itemLabel[i].setLayout(new FlowLayout());
			itemLabel[i].setPreferredSize(new Dimension(200, 200));
			itemLabel[i].setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
			center.add(itemLabel[i]);

			itemImgLabel[i] = new JLabel(itemImg[i]);
			itemImgLabel[i].setBackground(Color.red);
			itemImgLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			itemLabel[i].add(itemImgLabel[i]);

			itemNameLabel[i] = new JLabel(itemName[i]);
			itemNameLabel[i].setFont(new Font("������� ����", Font.BOLD, 20));
			itemNameLabel[i].setPreferredSize(new Dimension(150, 30));
			itemNameLabel[i].setHorizontalAlignment(JLabel.CENTER);
			itemNameLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(itemNameLabel[i]);

			priceLabel[i] = new JLabel(itemPrice[i]);
			priceLabel[i].setFont(new Font("������� ����", Font.BOLD, 20));
			priceLabel[i].setPreferredSize(new Dimension(200, 30));
			priceLabel[i].setHorizontalAlignment(JLabel.CENTER);
			priceLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(priceLabel[i]);

			saleTextLabel[i] = new JLabel("���ΰ�");
			saleTextLabel[i].setFont(new Font("������� ����", Font.BOLD, 20));
			saleTextLabel[i].setPreferredSize(new Dimension(200, 20));
			saleTextLabel[i].setOpaque(true);
			saleTextLabel[i].setBackground(Color.yellow);
			saleTextLabel[i].setForeground(Color.red);
			saleTextLabel[i].setHorizontalAlignment(JLabel.CENTER);
			itemLabel[i].add(saleTextLabel[i]);

			String price = String.format("%,d", salePrice[i]); // 1000�� ���� �޸�

			saleLabel[i] = new JLabel(price + "��");
			saleLabel[i].setFont(new Font("������� ����", Font.BOLD, 30));
			saleLabel[i].setPreferredSize(new Dimension(200, 30));
			saleLabel[i].setForeground(Color.red);
			saleLabel[i].setHorizontalAlignment(JLabel.CENTER);
			saleLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(saleLabel[i]);

			// j < Integer.parseInt((String)c.buyItemTable.getValueAt(j, 1));

			// c.model.addRow(new Object[] { " "," "," " });

			// ���̺� �� ����ŭ �ݺ��ؼ� ��ǰ�� ��ġ�ϴ°� �ִ��� Ȯ���ؼ� ������ ���� 1�߰�,������ ���� ���� +1

			itemImgLabel[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
					if (c.model.getRowCount() == 0) {
						c.model.addRow(new Object[] { itemName[n], "1", price });
					} else if (c.model.getRowCount() >= 1) {
						int k = 0;
						String ob = (String) c.model.getValueAt(k, 0);
						while (true) {
							if (ob.equals(itemName[n])) {
								String set = String.valueOf(Integer.parseInt((String) c.model.getValueAt(k, 1)) + 1);
								Integer sale = Integer.parseInt(((String) c.model.getValueAt(k, 2)).replaceAll(",", ""));
								String priceset = String.format("%,d", (sale + salePrice[n]));
								c.model.setValueAt(set, k, 1);
								c.model.setValueAt(priceset, k, 2);
								break;
							} else {
								if(k != c.model.getRowCount()) {
									k++;
								} else {
									c.model.addRow(new Object[] { itemName[n], "1", price });
									break;
								}
							}
						}
					}
					Integer total = 0;
					 
					for (int j = 0; j < c.model.getRowCount(); j++) {
						total += Integer.parseInt(((String) c.model.getValueAt(j, 2)).replaceAll(",", ""));
					}
					
					String totalset = String.format("%,d",total);
					c.totalPrice.setText("�����ݾ�: "+totalset+" ��");
				}
			});
		}
	}
}
