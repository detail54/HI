package Collection_Framework;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class My{
	String t;
	int d;
	
	My(String t, int d){
		this.t=t;
		this.d=d;
	}
	public String toString() {
		return t + " " + d;
	}
	
}

public class vector4_combobox {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setLayout(new FlowLayout());
		
		Vector<My> v = new Vector<My>();
		
		v.add(new My("´ëÇö",20));
		v.add(new My("dd",30));
		v.add(new My("xx",40));
		
		JComboBox j = new JComboBox(v);
		jf.add(j);
		
		jf.setVisible(true);
		
	}

}
