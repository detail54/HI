package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUItest15 extends JFrame{

	GUItest15(){
		
		JMenuBar j = new JMenuBar();
		
		JMenu j1 = new JMenu("File");
		JMenu j2 = new JMenu("Edit");
		JMenu j3 = new JMenu("Source");
		
		JMenuItem j4 = new JMenuItem("New");
		JMenuItem j5 = new JMenuItem("Undo Typing");
		
		setJMenuBar(j);
		
		j.add(j1);
		j.add(j2);
		j.add(j3);
		
		j1.add(j4);
		j2.add(j5);
		
		j4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("new");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUItest15();
		
	}

}
