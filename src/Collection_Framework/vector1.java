package Collection_Framework;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> v1 = new Vector<Integer>();

		v.add(new Integer(5));
		v.add(5);
		v.add(10);
		v.add(0, 20); // �ε��� 0�� 20�� �ְڴ�.

		System.out.println(v.size()); // size == ũ��ҷ����� �Լ�. ����??

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}

	}

}
