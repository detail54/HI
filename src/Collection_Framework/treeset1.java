package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
			//�������� ���� ����. treeset ���� comparable �������̽� -> comparTo ��°� ������.
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		s.add(20);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(1);
		
		Iterator<Integer> it = s.iterator();	
												
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
//hashset �� Treeset �ΰ� ��� ���� Ŭ�����϶��� �ߺ����� �Լ��� ���� ¥���ʾƵ��ȴ�. ������ �Ϲ� Ŭ���� �϶��� �ߺ����� �Լ� �����ؾ���.
//hashset = > hashcode, boolean equals
//treeset = > comparable, compareto