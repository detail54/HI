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

		b.in(30); // 초기화

		b.next = new Box<Integer>();
		b.next.in(40); // 객체에 한번 더 접근.
		
		// next는 연결되어있다는 뜻.
		b.next.next = new Box<Integer>();
		b.next.next.in(50);

		Box<Integer> tmp;
		tmp = b.next;
		System.out.println(tmp.out());
		tmp = b.next.next;
		System.out.println(tmp.out());
	}

}
