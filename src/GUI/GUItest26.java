package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import GUI.Dialog.Dia;

public class GUItest26 extends JFrame {
		JLabel jl = new JLabel("계산 출력");
		
	GUItest26() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton jb = new JButton("Cal");

		c.add(jb);
		c.add(jl);
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dia d = new Dia();
				d.setVisible(true);
			}
		});
		setSize(600,300);
		setVisible(true);
	}

	class Dia extends JDialog {

		Dia(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel jla = new JLabel("두 수를 더합니다");
			JTextField jf1 = new JTextField(10);
			JTextField jf2 = new JTextField(10);
			JButton jb = new JButton("ADD");
			
			c.add(jla);
			c.add(jf1);
			c.add(jf2);
			c.add(jb);
			
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(jf1.getText())+Integer.parseInt(jf2.getText());
					jl.setText(String.valueOf(a));
				}
			});
			
			setSize(300,300);
			
		}
	}

	public static void main(String[] args) {
		new GUItest26();
	}

}
