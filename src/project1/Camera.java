package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Camera extends JPanel{
	
	Camera(){
		this.setBackground(Color.black);
		setOpaque(true);
		
		JLabel center = new JLabel("ī�޶�");
		center.setPreferredSize(new Dimension(680,580));
		center.setFont(new Font("������� ����", Font.BOLD, 18));
		center.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		center.setOpaque(true);
		center.setBackground(Color.white);
		add(center);
		
	}
}