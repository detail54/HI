package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro> {
	String a;
	int b;

	Pro(String a, int b) {
		this.a = a;
		this.b = b;
	}

	void show() {
		System.out.println(a + " " + b);
	}
		//정렬기준 설정.
	public int compareTo(Pro p) {
		if (b > p.b) {
			return 1;
		} else if (b < p.b) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class treeset2 {

	public static void main(String[] args) {

		TreeSet<Pro> s = new TreeSet<Pro>();

		s.add(new Pro("cc", 20));
		s.add(new Pro("aa", 30));
		s.add(new Pro("bb", 40));

		Iterator<Pro> it = s.iterator();

		while (it.hasNext()) {
			it.next().show();

		}

	}

}
