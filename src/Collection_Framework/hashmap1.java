package Collection_Framework;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();

		h.put(1, "재경");
		h.put(2, "준엽"); // 삽입. hashmap 에서는 add가 아니라 put 사용

		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i+1));
		}							  //키값 불러옴.ㅇ
	}
}
