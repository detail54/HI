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
			System.out.println("입력");
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
//2. HashMap에 (1,”one”),(2,”two”),(3,”three”)를 저장하여 키, 값을 다 출력한다.
//출력 후, 1을 입력하면 one, 2를 입력하면 two, 3을 입력하면 three가 출력될 수 있게끔 코드를 작성해라. 