package Collection_Framework;

import java.util.Iterator;
import java.util.Vector;

public class vector3 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		
		for (int i = 0; i < 3; i++) {
			int a = (int)(Math.random()*100);
			v.add(a);
		}
		
		Iterator<Integer> it = v.iterator();
				//다음 요소가 있을때까지.
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

		

	}

}
