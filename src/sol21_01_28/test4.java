package sol21_01_28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test4 extends JFrame{

	test4(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Hi"); 
		c.add(j);
		
		j.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j.setText("�ȳ�");
			}	
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new test4();
		
	}

}
//6. JLabel j=new JLabel(��Hi); 
//
//���� j�� ���콺�� Ŭ���ϸ� ���ȳ硱�̶�� �ٲٴ� �ڵ带 �ۼ��ض�.