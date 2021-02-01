package sol21_02_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> m = new HashMap<>();
		
		m.put("aa", 10);
		m.put("bb", 20);
		m.put("cc", 30);
		
		Set<String> k = m.keySet();
		Iterator<String> it = k.iterator();
		
		while(it.hasNext()) {
			System.out.print("이름입력: ");
			String name = sc.next();
			Integer age = m.get(name);
			
			if(age == null) {
				System.out.println("없음");
			} else {
				System.out.println(age);
			}
			
		}
	}

}

//8.  Map만들어 이름, 나이저장해서 이름과 일치하는 나이 출력해라.