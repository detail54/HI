package sol21_02_17;

import java.util.Iterator;
import java.util.TreeSet;

public class test2 {

	public static void main(String[] args) {

		String str = "�ο�,�ο�,�ο�,�¼�,�屺,����,�屺";

		TreeSet<String> t = new TreeSet<>();
		String st[] = str.split(",");

		for (int i = 0; i < st.length; i++) {
			t.add(st[i]);
		}
		
		Iterator<String> it = t.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
