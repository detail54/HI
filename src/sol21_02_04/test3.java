package sol21_02_04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


class Th extends Thread{
	JLabel jl;
	
	Th(JLabel jl){
		this.jl = jl;
	}
	public void run() {
		int n = 0;
		while(true) {
			jl.setText(Integer.toString(n));
			n++;
			try {
				sleep(1000);
			} catch (Exception e){
				return;		//������ ���� �ְԵǸ� ��� ������� ����. �׷��� ���� ��� ������ ����.
			}
		}
	}
}

public class test3 extends JFrame{

	test3(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel();
		c.add(j);
		
		Th t = new Th(j);
		t.start();
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new test3();
		
	}

}
