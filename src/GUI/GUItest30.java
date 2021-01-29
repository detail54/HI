package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUItest30 extends JFrame {

	ImageIcon[] im = { new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/aa.jpg"),
			new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/bb.jpg"),
			new ImageIcon("C:/Users/82109/OneDrive/바탕 화면/gg.jpg") };

	JLabel[] jl = new JLabel[3];

	GUItest30() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		for (int i = 0; i < 3; i++) {
			jl[i] = new JLabel(im[i]);
			c.add(jl[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUItest30();
	}

}
//6.이미지 세개를 다운받아프레임에 부착해라.(for문 사용해서 부착)