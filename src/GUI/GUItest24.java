package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest24 extends JFrame {

	GUItest24() {

		String[] s = { "안경", "치킨" };
		ImageIcon[] im = { new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/aa.jpg"),
				new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/bb.jpg") };

		JLabel j = new JLabel(im[0]);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox com = new JComboBox(s);
		
		c.add(com);
		c.add(j);
		
		com.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int i = com.getSelectedIndex();
				j.setIcon(im[i]);
				//콤보박스에 선택된 아이템 인덱스 알아내기
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new GUItest24();

	}

}
