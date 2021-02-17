package sol21_02_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> h = new HashMap<>();
		
		h.put("아메리카노",4500);
		h.put("카푸치노",5500);
		h.put("라떼",5500);
		
		while(true) {
			System.out.print("메뉴 입력: ");
			String in = sc.next();
			
			if(in.equals("그만")) {
				break;
			} else {
				System.out.println(h.get(in));
			}
		}
		
	}

}
