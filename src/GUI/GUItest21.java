package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GUItest21 extends JFrame {
	GUItest21(){

		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		JCheckBox jc = new JCheckBox("공부선택");
		c.add(jc);
		
		
		JRadioButton j1 = new JRadioButton("Java");
		c.add(j1);
		j1.setEnabled(false);
		JRadioButton j2 = new JRadioButton("Pyton");
		c.add(j2);
		j2.setEnabled(false);
		JRadioButton j3 = new JRadioButton("C#");
		c.add(j3);
		j3.setEnabled(false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		
		jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jc.setEnabled(false);
				j1.setEnabled(true);
				j2.setEnabled(true);
				j3.setEnabled(true);
			}
		});
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("자바!!!");
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("파이썬!!!");
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("C#!!!");
			}
		});
		setVisible(rootPaneCheckingEnabled);
	}
	
	public static void main(String[] args) {

		new GUItest21();
		
	}

}
