package Collection_Framework;

class Java {
	String title;

	Java(String t) {
		title = t;
	}

	void show() {
		System.out.println(title);
	}
}

class DB {
	int n;

	DB(int n) {
		this.n = n;
	}

	void pr() {
		System.out.println(n);
	}
}

class Program<T> { // 제네릭 기호. 어느 자료형이든 받는다.
	T t;

	void in(T t) {
		this.t = t;
	}
	T get() {	
		return t;
	}
}

public class generic1 {

	public static void main(String[] args) {

		Program<Java> p = new Program<Java>();
		
		p.in(new Java("java"));
		Java j = p.get();
		j.show();
		
		Program<DB> d = new Program<DB>();
		
		d.in(new DB(5));
		DB dd = d.get();
		dd.pr();
		
	}

}
