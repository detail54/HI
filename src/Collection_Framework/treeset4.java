package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {

		TreeSet<Integer> grade = new TreeSet<>();
		grade.add(30);
		grade.add(100);
		grade.add(40);
		grade.add(50);

		// 제일 먼저 입력한 값 출력.
		Integer i = grade.first();
		System.out.println(i);

		i = grade.last();
		System.out.println(i);
			//80바로 밑의 수 출력
		i = grade.lower(new Integer(80));
		System.out.println(i);
			//80바로 위의 수 출력
		i = grade.higher(new Integer(80));
		System.out.println(i);

	}

}
