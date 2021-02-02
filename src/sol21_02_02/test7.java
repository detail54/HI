package sol21_02_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class PPerson {
	int num;
	String name;

	PPerson(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int hashCode() {
		return num % 4;	//num 으로만 써도된다. num을 기준으로 하고있어서.
	}

	public boolean equals(Object o) {
		PPerson p = (PPerson)o;
		
		if(p.num==num) {
			return true;
		} else {
			return false;
		}
	}
}

public class test7 {

	public static void main(String[] args) {
		Set<PPerson> s = new HashSet<PPerson>();

		s.add(new PPerson(12, "홍길동"));
		s.add(new PPerson(23, "김길동"));
		s.add(new PPerson(12, "이길동"));

		Iterator<PPerson> it = s.iterator();

		while (it.hasNext()) {
			PPerson p = it.next();
			System.out.println(p.num + " " + p.name);

		}
	}

}
