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
				j.setText("안녕");
			}	
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new test4();
		
	}

}
//6. JLabel j=new JLabel(“Hi); 
//
//에서 j를 마우스로 클릭하면 “안녕”이라고 바꾸는 코드를 작성해라.