package Collection_Framework;

class Box<T> {
	T t;
	Box<T> next;

	void in(T t) {
		this.t = t;
	}
	T out() {
		return t;
	}
}

public class linkedlist1 {

	public static void main(String[] args) {

		Box<Integer> b = new Box<Integer>();

		b.in(30); // �ʱ�ȭ

		b.next = new Box<Integer>();
		b.next.in(40); // ��ü�� �ѹ� �� ����.
		
		// next�� ����Ǿ��ִٴ� ��.
		b.next.next = new Box<Integer>();
		b.next.next.in(50);

		Box<Integer> tmp;
		tmp = b.next;
		System.out.println(tmp.out());
		tmp = b.next.next;
		System.out.println(tmp.out());
	}

}
