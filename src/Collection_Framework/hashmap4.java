package Collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap4 {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();

		h.put("book", "å");
		h.put("water", "��");
		h.put("chair", "����");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < h.size(); i++) {
			System.out.println("����ܾ� �Է�");
			String a = sc.next();
			String ko = h.get(a);
			// Ű ���Է�.
			if (ko == null) {
				System.out.println("���´ܾ�");
			} else {
				System.out.println(ko);
			}

		}
	}

}
