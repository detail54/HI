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
		super("���̾�α�");

		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);

		setVisible(true);
	}

	class Dia extends Panel {
		JButton j = new JButton("�̸� �Է�");
		JTextField f = new JTextField(10);

		JButton j1 = new JButton("Ȯ��");
		JButton j2 = new JButton("�޼���");

		Dia() {
			setBackground(Color.pink);

			add(j);
			add(f);
			add(j1);
			add(j2);

			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸��Է�");

					if (name != null) {
						f.setText(name);
					}
				}
			});

			j1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "����Ұ̴ϱ�?", "Ȯ��", JOptionPane.YES_NO_OPTION);

					if (r == JOptionPane.CLOSED_OPTION) {
						f.setText("���þ��ߴ�");
					} else if(r == JOptionPane.YES_OPTION){
						f.setText("��");
					} else {
						f.setText("�ƴϿ�");
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "���","�޼���",JOptionPane.WARNING_MESSAGE);
				}
			});

		}
	}

	public static void main(String[] args) {

		new Dialog();

	}

}

// �˾� ���̾�α�
// 1) �Է� ���̾�α� : JOptionPane.showInputDialog() "Ok"��ư�� ������ �Է��� �� ���� "Cancel"��ư�� ������ null�� ����
// 2) Ȯ�� ���̾�α� : JOptionPane.showConfirmDialog()
// 3) �޽��� ���̾�α� : JOptionPane.showMessageDialog()
