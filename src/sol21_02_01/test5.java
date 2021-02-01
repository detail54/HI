package sol21_02_01;

import java.util.ArrayList;
import java.util.Iterator;

public class test5 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>(10);

		for (int i = 0; i < 10; i++) {
			a.add((int)(Math.random()*101));
		}
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

//6. ArrayList에 0~100사이의임의의 정수 10개를 삽입하고 모두 출력해라. 출력할때는 Iterator인터페이스를 사용해서 출력해라.