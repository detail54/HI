package GUI;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class My implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton)e.getSource();	//�̺�Ʈ�� ��� �Ͼ���� �˾Ƴ�.
		
		if(j.getText().equals("����")) {	//getText : 
			j.setText("execute");		//setText : 
		} else {
			j.setText("exe");
		}
	}
	
}

public class GUItest5 extends JFrame {

	GUItest5 (){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton j = new JButton("����");
		j.addActionListener(new My());
		
		c.add(j);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
			
		new GUItest5();
		
	}

}
