package Collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap3 {

	public static void main(String[] args) {
		// <> 안적어도 되는데 왠만하면 적는게 좋음.
		HashMap h = new HashMap();

		h.put("jisun", "123");
		h.put("daehyun", "234");
		h.put("taehyun", "345");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id, pw 입력: ");
			String id = sc.next();
			String pw = sc.next();
			// 맵에 키 id 값이 있는지 확인// 키값이 없다면,
			if (!h.containsKey(id)) {
				System.out.println("id가 존재하지 않네요");
				continue;
			} else {
				if (!h.get(id).equals(pw)) { // id가 있을경우 pw 가 id와 맞는지 확인.
					System.out.println("비밀번호가 일치하지 않네요");
				} else {
					System.out.println("로그인");
					break;
				}
			}
		}

	}

}
