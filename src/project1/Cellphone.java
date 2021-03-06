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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cellphone extends JPanel{
	Change c = new Change();
	public JLabel[] itemLabel = new JLabel[6]; // 상품 칸
	public JLabel[] itemImgLabel = new JLabel[6];
	public JLabel[] itemNameLabel = new JLabel[6];
	public JLabel[] priceLabel = new JLabel[6]; // 정상가격레이블
	public JLabel[] saleLabel = new JLabel[6]; // 할인가격레이블
	public JLabel[] saleTextLabel = new JLabel[6];

	Cellphone() {
		this.setBackground(Color.black);
		setOpaque(true);

		JLabel center = new JLabel();
		center.setPreferredSize(new Dimension(680, 580));
		center.setFont(new Font("나눔고딕 보통", Font.BOLD, 18));
		center.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		center.setOpaque(true);
		center.setBackground(Color.white);
		center.setLayout(new GridLayout(2, 3));
		add(center);
		ImageIcon[] itemImg = { new ImageIcon("phone1.png"),
				new ImageIcon("phone2.png"),
				new ImageIcon("phone3.png"),
				new ImageIcon("phone4.png"),
				new ImageIcon("phone5.png"),
				new ImageIcon("phone6.png") };

		String[] itemName = { "phone1", "phone2", "phone3", "phone4", "phone5", "phone6" }; // 상품명
		String[] itemPrice = { "정상가 539,900원", "정상가 992,000원", "정상가 1,280,700원", "정상가 895,700원", "정상가 1,280,700원",
				"정상가 510,700원" };// 정상가격

		int[] salePrice = { (int) (Math.random() * 439900) + 100000, (int) (Math.random() * 792000) + 200000,
				(int) (Math.random() * 1080700) + 200000, (int) (Math.random() * 695700) + 200000,
				(int) (Math.random() * 1080700) + 200000, (int) (Math.random() * 410700) + 100000 }; // 할인가격

		for (int i = 0; i < itemLabel.length; i++) {
			int n = i; // 액션리스너 인덱스값
			String p = String.valueOf(itemPrice[i]); // 할인가 문자열 변환.

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
			itemNameLabel[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
			itemNameLabel[i].setPreferredSize(new Dimension(150, 30));
			itemNameLabel[i].setHorizontalAlignment(JLabel.CENTER);
			itemNameLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(itemNameLabel[i]);

			priceLabel[i] = new JLabel(itemPrice[i]);
			priceLabel[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
			priceLabel[i].setPreferredSize(new Dimension(200, 30));
			priceLabel[i].setHorizontalAlignment(JLabel.CENTER);
			priceLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(priceLabel[i]);

			saleTextLabel[i] = new JLabel("할인가");
			saleTextLabel[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 20));
			saleTextLabel[i].setPreferredSize(new Dimension(200, 20));
			saleTextLabel[i].setOpaque(true);
			saleTextLabel[i].setBackground(Color.yellow);
			saleTextLabel[i].setForeground(Color.red);
			saleTextLabel[i].setHorizontalAlignment(JLabel.CENTER);
			itemLabel[i].add(saleTextLabel[i]);

			String price = String.format("%,d", salePrice[i]); // 1000원 단위 콤마

			saleLabel[i] = new JLabel(price + "원");
			saleLabel[i].setFont(new Font("나눔고딕 보통", Font.BOLD, 30));
			saleLabel[i].setPreferredSize(new Dimension(200, 30));
			saleLabel[i].setForeground(Color.red);
			saleLabel[i].setHorizontalAlignment(JLabel.CENTER);
			saleLabel[i].setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			itemLabel[i].add(saleLabel[i]);

			// 테이블 행 수만큼 반복해서 상품명에 일치하는게 있는지 확인해서 없으면 수량 1추가,있으면 얻어온 값에 +1
			itemImgLabel[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
					if (c.model.getRowCount() == 0) {
						c.model.addRow(new Object[] { itemName[n], "1", price });
					} else if (c.model.getRowCount() >= 1) {
						
						for(int j = 0; j < c.model.getRowCount(); j++) {
							String ob = (String) c.model.getValueAt(j, 0);
							
							if (!(ob.equals(itemName[n]))) {
								if((j + 1) == c.model.getRowCount()) {
									c.model.addRow(new Object[] { itemName[n], "1", price });
									break;
								} else {
									continue;
								}
							} else {
								String set = String.valueOf(Integer.parseInt((String) c.model.getValueAt(j, 1)) + 1);
								Integer sale = Integer.parseInt(((String) c.model.getValueAt(j, 2)).replaceAll(",", ""));
								String priceset = String.format("%,d", (sale + salePrice[n]));
								c.model.setValueAt(set, j, 1);
								c.model.setValueAt(priceset, j, 2);
								break;
							}
						}
					}
					Integer total = 0;
					 
					for (int j = 0; j < c.model.getRowCount(); j++) {
						total += Integer.parseInt(((String) c.model.getValueAt(j, 2)).replaceAll(",", ""));
					}
					
					String totalset = String.format("%,d",total);
					c.totalPrice.setText("결제금액: "+totalset+" 원");
				}
			});
		}
	}
}