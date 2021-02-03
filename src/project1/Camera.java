package project1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Camera extends JPanel{
	
	Camera(){
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		
		JLabel center = new JLabel("Ä«¸Þ¶ó");
		center.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
		add(center);
		
	}
}