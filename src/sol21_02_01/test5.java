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

//6. ArrayList�� 0~100������������ ���� 10���� �����ϰ� ��� ����ض�. ����Ҷ��� Iterator�������̽��� ����ؼ� ����ض�.