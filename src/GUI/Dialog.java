package sol21_01_28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dialog extends JFrame {

	Dialog() {
		super("다이얼로그");

		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);

		setVisible(true);
	}

	class Dia extends Panel {
		JButton j = new JButton("이름 입력");
		JTextField f = new JTextField(10);

		JButton j1 = new JButton("확인");
		JButton j2 = new JButton("메세지");

		Dia() {
			setBackground(Color.pink);

			add(j);
			add(f);
			add(j1);
			add(j2);

			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름입력");

					if (name != null) {
						f.setText(name);
					}
				}
			});

			j1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "계속할겁니까?", "확인", JOptionPane.YES_NO_OPTION);

					if (r == JOptionPane.CLOSED_OPTION) {
						f.setText("선택안했다");
					} else if(r == JOptionPane.YES_OPTION){
						f.setText("네");
					} else {
						f.setText("아니요");
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "경고","메세지",JOptionPane.WARNING_MESSAGE);
				}
			});

		}
	}

	public static void main(String[] args) {

		new Dialog();

	}

}

// 팝업 다이얼로그
// 1) 입력 다이얼로그 : JOptionPane.showInputDialog() "Ok"버튼을 누르면 입력한 값 리턴 "Cancel"버튼을 누르면 null값 리턴
// 2) 확인 다이얼로그 : JOptionPane.showConfirmDialog()
// 3) 메시지 다이얼로그 : JOptionPane.showMessageDialog()
