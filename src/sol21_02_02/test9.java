package sol21_02_02;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test9 extends JFrame {

	test9() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));
		setVisible(true);
		
		JLabel[] jl = new JLabel[12];
		
		for (int i = 0; i < jl.length; i++) {
			jl[i] = new JLabel();
			c.add(jl[i]);
			
			jl[i].setBackground(Color.white);
			
			jl[i].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					JLabel jj = (JLabel)e.getSource();
				
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					
					jj.setOpaque(true);	//���� ����
					jj.setBackground(new Color(r,g,b));
				}
				
			});
		}
		
	}

	public static void main(String[] args) {
		new test9();

	}

}
//. GridLayout4�� 3���� ��ġ�ϰ� JLabel �� 12�� �����Ѵ�. �ʱ� ������ �Ͼ������ �����ϰ�, 
//���̺� ���� ���콺�� Ŭ���ϸ� ���� �����ϰ� ä�������� ���α׷��� �ۼ��ض�. ���� �ڵ带 �̿��ض�.