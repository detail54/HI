package project1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Airconditioner extends JPanel{

	Airconditioner(){
		
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		
		JLabel center = new JLabel("¿¡¾îÄÁ");
		center.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 18));
		add(center);
	}
	
	public static void main(String[] args) {
		new Airconditioner();
	}

}
