package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

class PPRoo implements Comparable<PPRoo> {
	String a;

	PPRoo(String a) {
		this.a = a;
	}

	public int len() {
		return a.length();
	}

	public int compareTo(PPRoo p) {
		if (len() > p.len()) {
			return -1;
		} else if (len() < p.len()) {
			return 1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return a;
	}
	void show() {
		System.out.println(a);
	}
}

public class treeset3 {

	public static void main(String[] args) {

		TreeSet<PPRoo> s = new TreeSet<PPRoo>();

		s.add(new PPRoo("ccc"));
		s.add(new PPRoo("aaaa"));
		s.add(new PPRoo("bb"));

		Iterator<PPRoo> it = s.iterator();

		while (it.hasNext()) {
			it.next().show();

		}

	}

}
