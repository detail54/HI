package Collection_Framework;

class AA {
	public String toString() {
		return "AA";
	}
}

class BB {
	public String toString() {
		return "BB";
	}
}

class In {
	<T> void show(T t) {
		System.out.println(t);
	}

	void show() {
		System.out.println("generic");
	}
}

public class generic2 {

	public static void main(String[] args) {

		AA a = new AA();
		BB b = new BB();
		In i = new In();

		i.<AA>show(a);
		i.<BB>show(b);
		i.show();

	}

}
