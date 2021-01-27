package GUI;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class EMouse implements MouseMotionListener{
	
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
	}
}

public class GUItest9 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		JButton j1=new JButton("one");
		JButton j2=new JButton("two");
		
		j1.addMouseMotionListener(new EMouse());
		j2.addMouseMotionListener(new EMouse());
	
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}

}
