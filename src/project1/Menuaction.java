package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class Menuaction extends JFrame {
	String[] menuName = { "Main", "   TV", "컴퓨터", "카메라", "에어컨", "핸드폰", "냉장고", "장바구니", "   결제", "Log-Out" };
	JMenuItem[] jmenu;
	int i;

	Menuaction(JMenuItem[] jmenu, int i) {
		this.jmenu = jmenu;
		this.i = i;
	}

	void create() {
		if (i == 0) {
			jmenu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main main = new Main();
					main.setVisible(true);
					
				}
			});
		} else if (i == 1) {
			jmenu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Tv tv = new Tv();
					tv.setVisible(true);
					setVisible(false);
				}
			});
		} else if (i == 2) {
			jmenu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Computer com = new Computer();
					com.setVisible(true);
				}
			});
		}

	}

}
//jmenu[0].addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		Main main = new Main();
//		main.setVisible(true);
//		setVisible(false);
//	}
//});