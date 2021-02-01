package Collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap4 {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();

		h.put("book", "책");
		h.put("water", "물");
		h.put("chair", "의자");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < h.size(); i++) {
			System.out.println("영어단어 입력");
			String a = sc.next();
			String ko = h.get(a);
			// 키 값입력.
			if (ko == null) {
				System.out.println("없는단어");
			} else {
				System.out.println(ko);
			}

		}
	}

}
