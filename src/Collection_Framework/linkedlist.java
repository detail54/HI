package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<>();
		
		li.add("one");
		li.add("two");
		li.add("three");
		
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) {
			String n = it.next();
			if(n.compareTo("two")==0) {
				it.remove();
			}
		}
		
		it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
