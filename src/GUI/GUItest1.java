package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class GUItest1 extends JFrame{

	GUItest1(){
		super("java");	//== setTitle("java");   제목설정
		setSize(300,300);	//프레임 크기 설정
		setVisible(true);	//프레임 출력 메소드.
		
		JButton j1 = new JButton("버튼 1");
		JButton j2 = new JButton("버튼 2");
		JButton j3 = new JButton("버튼 3");
		
		Container c = getContentPane();
		//컨텐트팬 알아냄. (창의 나머지 부분)
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		c.setLayout(new FlowLayout());
		
	}
	
	public static void main(String[] args) {

		new GUItest1();
		
	}

}