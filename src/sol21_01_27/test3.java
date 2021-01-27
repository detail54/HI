package sol21_01_27;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Ggg implements MouseListener {

	JButton j = new JButton();
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (j.getText().equals("Ok")) {
			j.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
				}
			});
		} else if(j.getText().equals("cancel")) {
			j.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
				}
			});
		} else if(j.getText().equals("Get")) {
			j.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					System.out.println(j.getX()+ " " +j.getY());
				}
			});
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}

public class test3 extends JFrame {

	

		test3() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);

		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		JButton j3 = new JButton("Get");

		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.orange);
			}
		});
		c.add(j3);

		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(j3.getX() + " " + j3.getY());
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

//		2. 컨텐트팬의 배경색을 blue색으로 하고, Ok, Cancel, Get 버튼을 부착한 프로그램 작성해라.
//		2.1Ok 버튼을 누르면 컨텐트팬 색을 orange, Cancel 버튼을 누르면 버튼을 비활성화시키고 Get 버튼을 누르면 버튼의 위치(x,y)값을 출력해라.

		new test3();

	}

}
