package Collection_Framework;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();

		h.put(1, "���");
		h.put(2, "�ؿ�"); // ����. hashmap ������ add�� �ƴ϶� put ���

		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i+1));
		}							  //Ű�� �ҷ���.��
	}
}
