package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class GUItest1 extends JFrame{

	GUItest1(){
		super("java");	//== setTitle("java");   ������
		setSize(300,300);	//������ ũ�� ����
		setVisible(true);	//������ ��� �޼ҵ�.
		
		JButton j1 = new JButton("��ư 1");
		JButton j2 = new JButton("��ư 2");
		JButton j3 = new JButton("��ư 3");
		
		Container c = getContentPane();
		//����Ʈ�� �˾Ƴ�. (â�� ������ �κ�)
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		c.setLayout(new FlowLayout());
		
	}
	
	public static void main(String[] args) {

		new GUItest1();
		
	}

}