package Collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap2 {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();

		h.put("��", "water");
		h.put("�ڹ�", "java");
		h.put("Ƽ", "tea");

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String a = it.next();	//Ű�� ����.
			String b = h.get(a);	//Ű�� �ش��ϴ� �� ����.
			System.out.println(a+" "+b);
		}
		
		
		
	}

}
