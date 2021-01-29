package Collection_Framework;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> v1 = new Vector<Integer>();

		v.add(new Integer(5));
		v.add(5);
		v.add(10);
		v.add(0, 20); // 인덱스 0에 20을 넣겠다.

		System.out.println(v.size()); // size == 크기불러오는 함수. 갯수??

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}

	}

}
