package sol21_02_02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class test4 extends JFrame{

	test4(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar jm = new JMenuBar();
		JMenu j = new JMenu("File");
		jm.add(j);
		
		JMenuItem i1 = new JMenuItem("Load");
		JMenuItem i2 = new JMenuItem("Hide");
		JMenuItem i3 = new JMenuItem("Exit");
		
		j.add(i1);
		j.add(i2);
		j.add(i3);
		
		ImageIcon ic = new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/11jpg.jpg");
		JLabel jl = new JLabel();
		c.add(jl);
		
		
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(ic);
			}
		});
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(null);
			}
		});
		i3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setJMenuBar(jm);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new test4();

	}
}
//3. File 메뉴에 메뉴 아이템 세개를 만들어라.(Load, Hide, Exit) 
//Load를 선택하면 이미지(사진)을 띄우고, Hide를 선택하면 이미지를 보이지 않게한다. Exit을 선택하면 프로그램을 종료하도록 작성해라.