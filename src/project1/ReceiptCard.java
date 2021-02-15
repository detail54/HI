package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class ReceiptCard extends JFrame{

	Change ch = new Change();
	
	ReceiptCard(){
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> price = new ArrayList<>();
		
		for(int i = 0; i<ch.model.getRowCount(); i++) {
			name.add((String)ch.model.getValueAt(i, 0));
			num.add((String)ch.model.getValueAt(i, 1));
			price.add((String)ch.model.getValueAt(i, 2));
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.black);
		
		JLabel jl = new JLabel("<html><br><br><br><br>Black-Market<br>"
				+ "=============================<br>"
				+ "<br><br><br>hohi<br><br>hihi</html>");
		
		jl.setHorizontalAlignment(jl.CENTER);
		jl.setFont(new Font("³ª´®°íµñ º¸Åë", Font.BOLD, 20));
		jl.setPreferredSize(new Dimension(420, 1040));
		jl.setOpaque(true);
		jl.setBackground(Color.white);
		c.add(jl);
		
		class Th extends Thread{
			
			int y = 600;
			
			public void run() {
				for (int i = 0; i < 100; i++) {
					y = y - 10;
					jl.setLocation(0, y); // repaint()
					try {
						Thread.sleep(17);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		Th th = new Th();
		th.start();
		
		
		setSize(420, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new ReceiptCard();
	}

}
