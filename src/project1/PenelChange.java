package project1;

import javax.swing.JFrame;

public class PenelChange extends JFrame {

	Basket ba = null;
	Refrigerator re = null;
	Cellphone cell = null;
	Airconditioner air = null;
	Camera ca = null;
	Computer com = null;
	Tv tv = null;
	Main main = null;
	Payment pay = null;

	public void change(String a) {

		if (a.equals("Main")) {
			getContentPane().removeAll();
			getContentPane().add(main);
			revalidate();
			repaint();
		} else if(a.equals("   TV")) {
			getContentPane().removeAll();
			getContentPane().add(tv);
			revalidate();
			repaint();
		}else if(a.equals("��ǻ��")) {
			getContentPane().removeAll();
			getContentPane().add(com);
			revalidate();
			repaint();
		}else if(a.equals("ī�޶�")) {
			getContentPane().removeAll();
			getContentPane().add(ca);
			revalidate();
			repaint();
		}else if(a.equals("������")) {
			getContentPane().removeAll();
			getContentPane().add(air);
			revalidate();
			repaint();
		}else if(a.equals("�����")) {
			getContentPane().removeAll();
			getContentPane().add(re);
			revalidate();
			repaint();
		}else if(a.equals("��ٱ���")) {
			getContentPane().removeAll();
			getContentPane().add(ba);
			revalidate();
			repaint();
		}else if(a.equals("   ����")) {
			getContentPane().removeAll();
			getContentPane().add(pay);
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {

	}

}
