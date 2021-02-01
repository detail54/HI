package sol21_02_01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class test3 extends JFrame{

	test3(){
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jt1 = new JTextField("ID: ",10);
		JTextField jt2 = new JTextField("PW: ",10);
		
		c.add(jt1);
		c.add(jt2);
		
		jt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = jt1.getText();
				String b = jt2.getText();
				System.out.println(a+" "+b);
				jt1.setText("ID: ");
				jt2.setText("PW: ");
			}
		});
		jt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = jt1.getText();
				String b = jt2.getText();
				System.out.println(a+" "+b);
				jt1.setText("ID: ");
				jt2.setText("PW: ");
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new test3();
	}

}
//4.  JTextField를 사용해 id, pw가 뜰 수 있도록로그인 창을 만들어라.
//(“enter”를 입력하는 순간 id가 출력된다.)