package Collection_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap3 {

	public static void main(String[] args) {
		// <> ����� �Ǵµ� �ظ��ϸ� ���°� ����.
		HashMap h = new HashMap();

		h.put("jisun", "123");
		h.put("daehyun", "234");
		h.put("taehyun", "345");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id, pw �Է�: ");
			String id = sc.next();
			String pw = sc.next();
			// �ʿ� Ű id ���� �ִ��� Ȯ��// Ű���� ���ٸ�,
			if (!h.containsKey(id)) {
				System.out.println("id�� �������� �ʳ׿�");
				continue;
			} else {
				if (!h.get(id).equals(pw)) { // id�� ������� pw �� id�� �´��� Ȯ��.
					System.out.println("��й�ȣ�� ��ġ���� �ʳ׿�");
				} else {
					System.out.println("�α���");
					break;
				}
			}
		}

	}

}
