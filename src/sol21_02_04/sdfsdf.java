package sol21_02_04;

import javax.swing.JFrame;

public class sdfsdf extends JFrame{

	
	public static void main(String[] args) {
		
		int a = 1231251245;
		
		String price = String.format("%,d", a);
		
		Integer s = Integer.parseInt(price.replaceAll(",", ""));
		
		System.out.println(s);
	
	}

}
