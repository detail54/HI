package Collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap2 {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();

		h.put("물", "water");
		h.put("자바", "java");
		h.put("티", "tea");

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String a = it.next();	//키값 저장.
			String b = h.get(a);	//키에 해당하는 값 저장.
			System.out.println(a+" "+b);
		}
		
		
		
	}

}
