package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class QMouse extends MouseAdapter implements MouseMotionListener{
	public void mouseDragged(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.yellow);
	}
	public void mouseMoved(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.pink);
	}
	
	
}


public class GUItest10 extends JFrame{

	GUItest10(){
		Container c = getContentPane();
		c.setBackground(Color.pink);
		
		c.addMouseMotionListener(new QMouse());
		c.addMouseListener(new QMouse());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new GUItest10();
		
	}

}
