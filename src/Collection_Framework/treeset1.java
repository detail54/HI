package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
			//오름차순 기준 정렬. treeset 에는 comparable 인터페이스 -> comparTo 라는게 들어가있음.
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
//hashset 과 Treeset 두개 모두 래퍼 클래스일때는 중복제거 함수를 따로 짜지않아도된다. 하지만 일반 클래스 일때는 중복제거 함수 구현해야함.
//hashset = > hashcode, boolean equals
//treeset = > comparable, compareto