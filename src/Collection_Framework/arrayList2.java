package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList2 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();
		a.add("bb");
		a.add("cc");
		a.add("dd");

		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String n = it.next();
			System.out.println(n);
		}

	}

}
