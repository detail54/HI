package sol21_02_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> h = new HashMap<>();

		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");

		Set<Integer> keys = h.keySet();
		Iterator<Integer> it = keys.iterator();
		
		while (it.hasNext()) {
			System.out.println("�Է�");
			Integer name = it.next();
			
			int key = sc.nextInt();
			switch(key) {
			case 1:
				System.out.println(name + " "+ h.get(key));
				break;
			case 2:
				System.out.println(name + " "+ h.get(key));
				break;
			case 3:
				System.out.println(name + " "+ h.get(key));
				break;
			}
		}
	}
}
//2. HashMap�� (1,��one��),(2,��two��),(3,��three��)�� �����Ͽ� Ű, ���� �� ����Ѵ�.
//��� ��, 1�� �Է��ϸ� one, 2�� �Է��ϸ� two, 3�� �Է��ϸ� three�� ��µ� �� �ְԲ� �ڵ带 �ۼ��ض�. 