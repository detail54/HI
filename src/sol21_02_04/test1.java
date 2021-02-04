package sol21_02_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		int big = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("이름, 성적입력: ");
			String a = sc.next();
			int b = sc.nextInt();
			h.put(a, b);
		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();

		String name = "";
		
		while (it.hasNext()) {
			String str = it.next();
			int b = h.get(str);
			
			if (b > big) {
				big = b;
				name =str;
			}
		}
		System.out.println("최고점: "+big+", 이름: "+name);
	}
}
