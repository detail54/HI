package GUI;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse implements MouseListener{	//MouseListener ���ս� �޼ҵ� �ٻ����ؾߵǼ� ���ŷο�.
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class GUItest7 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		MouseListener m = new Mouse();
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		
		
	}

}
