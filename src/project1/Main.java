package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JPanel {

	Main() {
		this.setBackground(Color.black);
		
		JLabel center = new JLabel("Up to 80%");
		JLabel center2 = new JLabel("SLAE");
		
		center.setPreferredSize(new Dimension(680,290));
		center.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 140));
		center.setForeground(Color.white);
		center.setOpaque(true);
		center.setBackground(Color.black);
		
		add(center);
		
		center2.setPreferredSize(new Dimension(680,290));
		center2.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 170));
		center2.setForeground(Color.white);
		center2.setOpaque(true);
		center2.setBackground(Color.black);
		center2.setHorizontalAlignment(center2.CENTER);
		
		add(center2);
		
		
	}
}
