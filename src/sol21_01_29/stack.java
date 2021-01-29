package sol21_01_29;

class st<T> {
	int n;
	Object[] obj; // ���ʸ� Ŭ�����̱� ������ ��� ���� �� �������� Object ����ؾ���.

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

		str.push("���");
		str.push("����");
		str.push("����");

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
