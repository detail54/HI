package Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

class Num{
	int a;
	Num(int a){
		this.a = a;
	}
	public String toString() {
		return a+" ";
	}
	
}

public class hashset1 {

	public static void main(String[] args) {

		HashSet<Num> h = new HashSet<Num>();
		
		h.add(new Num(30));
		h.add(new Num(20));
		h.add(new Num(10));
		h.add(new Num(10));
		
		Iterator<Num> i = h.iterator();
		
		while(i.hasNext()) {		//출력시 순서 유지안됌. 중복 가능.
			System.out.println(i.next());
		}
	}

}
