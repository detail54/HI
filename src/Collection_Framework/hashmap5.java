package Collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class hashmap5 {

	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			h.put(name, age);
		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();

		int max = 0;
		String str = "";

		while (it.hasNext()) {
			String name = it.next();
			int age = h.get(name);

			if (max < age) {
				max = age;
				str = name;
			}
		}
		System.out.println(str + " " + max);

	}
}
