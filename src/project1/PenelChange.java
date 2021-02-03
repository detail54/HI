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
		}else if(a.equals("컴퓨터")) {
			getContentPane().removeAll();
			getContentPane().add(com);
			revalidate();
			repaint();
		}else if(a.equals("카메라")) {
			getContentPane().removeAll();
			getContentPane().add(ca);
			revalidate();
			repaint();
		}else if(a.equals("에어컨")) {
			getContentPane().removeAll();
			getContentPane().add(air);
			revalidate();
			repaint();
		}else if(a.equals("냉장고")) {
			getContentPane().removeAll();
			getContentPane().add(re);
			revalidate();
			repaint();
		}else if(a.equals("장바구니")) {
			getContentPane().removeAll();
			getContentPane().add(ba);
			revalidate();
			repaint();
		}else if(a.equals("   결제")) {
			getContentPane().removeAll();
			getContentPane().add(pay);
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {

	}

}
