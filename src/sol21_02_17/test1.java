package sol21_02_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> h = new HashMap<>();
		
		h.put("�Ƹ޸�ī��",4500);
		h.put("īǪġ��",5500);
		h.put("��",5500);
		
		while(true) {
			System.out.print("�޴� �Է�: ");
			String in = sc.next();
			
			if(in.equals("�׸�")) {
				break;
			} else {
				System.out.println(h.get(in));
			}
		}
		
	}

}
