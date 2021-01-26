package sol21_01_26;

abstract class Profile {

	abstract void add(String name, String id);
	abstract String check(String id);

}

class Person {
	String name, id;

	Person(String n, String i) {
		name = n;
		id = i;
	}

	String getname() {
		return name;
	}

	String getid() {
		return id;
	}

}
class Per extends Profile {

	Person ary[];// 객체 배열 선언

	int n;
	Per(int n) {
		ary = new Person[n];
	}
	void add(String name, String id) {
		ary[n] = new Person(name, id);
		n++;
	}

	String check(String id) {
		for (int i = 0; i < n; i++) {
			if (id.compareTo(ary[i].getid()) == 0) {
				return ary[i].getname();
			}
		}
		return null;
	}
}

public class test1 {

	public static void main(String[] args) {

		Profile p = new Per(5);
		p.add("병용", "123");
		p.add("용현", "456");
		p.add("재경", "344");

		System.out.println(p.check("123"));
		System.out.println(p.check("456"));
		System.out.println(p.check("456"));

	}

}
