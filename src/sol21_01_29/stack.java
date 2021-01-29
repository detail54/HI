package sol21_01_29;

class st<T> {
	int n;
	Object[] obj; // 제너릭 클래스이기 때문에 모든 값을 다 받으려면 Object 사용해야함.

	st() {
		n = 0;
		obj = new Object[3];
	}

	void push(T t) {
		if (n == 3) {
			return;
		} else {
			obj[n] = t;
			n++;
		}
	}

	T pop() {
		if (n == 0) {
			return null;
		} else {
			n--;
			return (T) obj[n];
		}
	}

}

public class stack {

	public static void main(String[] args) {

		st<String> str = new st<String>();

		str.push("재경");
		str.push("용현");
		str.push("지선");

		for (int i = 0; i < 3; i++) {
			System.out.println(str.pop());
		}

		st<Integer> str1 = new st<Integer>();
		str1.push(4);
		str1.push(6);
		str1.push(7);

		for (int i = 0; i < 3; i++) {
			System.out.println(str1.pop());
		}
	}
}
