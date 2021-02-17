package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReceiptCard extends JFrame {

	Change ch = new Change();

	ReceiptCard() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.black);

		JLabel jl = new JLabel("<html>Black-Market<br>===========================<html>");

		jl.setHorizontalAlignment(jl.CENTER);
		jl.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));
		jl.setPreferredSize(new Dimension(420, 1100));
		jl.setOpaque(true);
		jl.setBackground(Color.white);
		c.add(jl);

		class Th extends Thread {

			int y = 600;

			public void run() {
				for (int i = 0; i < 110; i++) {
					y = y - 10;
					jl.setLocation(0, y);
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

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> price = new ArrayList<>();

		for (int i = 0; i < ch.model.getRowCount(); i++) {
			name.add((String) ch.model.getValueAt(i, 0));
			num.add((String) ch.model.getValueAt(i, 1));
			price.add((String) ch.model.getValueAt(i, 2));
		}
		
		JLabel list[] = new JLabel[name.size()];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = new JLabel();
			list[i].setOpaque(true);
			list[i].setBackground(Color.yellow);
			list[i].setPreferredSize(new Dimension(420, 520));
			jl.add(list[i]);
			if(i==0) {
				list[i] = new JLabel();
				list[i].setOpaque(true);
				list[i].setBackground(Color.yellow);
				list[i].setPreferredSize(new Dimension(420, 520));
				jl.add(list[i]);
			}
		}

		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new ReceiptCard();
	}

}
