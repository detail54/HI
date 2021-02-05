package sol21_02_04;

import java.util.HashSet;
import java.util.Iterator;

class Simple {
	int i;

	Simple(int i) {
		this.i = i;
	}

	public String toString() {
		return String.valueOf(i);
	}
}

public class test6 {

	public static void main(String[] args) {

		HashSet<Simple> h = new HashSet<Simple>();

		h.add(new Simple(30));
		h.add(new Simple(30));
		h.add(new Simple(40));

		Iterator<Simple> it = h.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
