package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Textt implements ActionListener{
	
	JTextField jt;
	JPasswordField jp;
	Textt(JTextField jt, JPasswordField jp){
		this.jt = jt;
		this.jp = jp;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(jt.getText());
		System.out.println(jp.getText());
		
	}
}

public class GUItest23 {

	public static void main(String[] args) {

		JFrame j = new JFrame();

		j.setBounds(120, 120, 150, 150); // X,Y,폭,높이

		j.setLayout(new GridLayout(2, 2));

		JLabel id = new JLabel("ID", SwingConstants.LEFT);
		JTextField jid = new JTextField(20);
		
		JLabel pw = new JLabel("PW", SwingConstants.LEFT);
		JPasswordField jpw = new JPasswordField(20);
		
		jpw.setEchoChar('*');//입력값 *로 보이게함.
		
		jpw.addActionListener(new Textt(jid,jpw));
		
		j.add(id);
		j.add(jid);
		j.add(pw);
		j.add(jpw);
		
		j.setVisible(true);
		
		
	}
	

}
