package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Text implements ActionListener{
	
	JTextArea jt;
	Text(JTextArea jt){
		this.jt = jt;
	}
	public void actionPerformed(ActionEvent e) {
		jt.setText("삭제!");
		jt.append("내용입력");
		
	}
	
}

public class GUItest22 {

	public static void main(String[] args) {

		JFrame j = new JFrame();
		
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10,20);
		jt.append("입력");
		jt.setLineWrap(true);		//문자열 차면 다음라인으로 보냄
		
		JButton b = new JButton("삭제");
		b.addActionListener(new Text(jt));
		j.add(b);
		j.add(jt);
		
		
		j.setVisible(true);		//JFrame 상속안받고 객체로 만들면 setVisible 앞에 JFrame 객체명 붙여줘야함.
		
	}

}
