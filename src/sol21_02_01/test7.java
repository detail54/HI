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
			System.out.print("�̸��Է�: ");
			String name = sc.next();
			Integer age = m.get(name);
			
			if(age == null) {
				System.out.println("����");
			} else {
				System.out.println(age);
			}
			
		}
	}

}

//8.  Map����� �̸�, ���������ؼ� �̸��� ��ġ�ϴ� ���� ����ض�.