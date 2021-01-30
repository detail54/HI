package Collection_Framework;

public class generic3 {

	static <T> void show(T[] t) {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}

	public static void main(String[] args) {

		String[] str = { "안녕", "자바", "주말" };

		show(str);

	}

}
