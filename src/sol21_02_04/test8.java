package sol21_02_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Worker {
	private String name;
	private String num;
	private String bo;
	private String jo;
	private String bu;

	static HashMap<String, ArrayList<String>> h = new HashMap<>();
	static ArrayList<String> ary = new ArrayList<String>();

	Worker(String a, String b, String c, String d, String e) {
		num = a;
		name = b;
		bo = c;
		jo = d;
		bu = e;

		ary.add(name);
		ary.add(bo);
		ary.add(jo);
		ary.add(bu);
		h.put(num, ary);
	}

	static void setter() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���: ");
		String a = sc.next();

		System.out.print("�̸�: ");
		String b = sc.next();

		System.out.print("�μ�: ");
		String c = sc.next();

		System.out.print("�ּ�: ");
		String d = sc.next();

		System.out.print("����: ");
		String e = sc.next();

		new Worker(a, b, c, d, e);

	}

	static void getter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� ����� �����?");
		String in = sc.next();

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();

		String re = String.valueOf(h.get(in)).substring(1,String.valueOf(h.get(in)).length()-1);
		re.replace(" ", "");
		String[] out = re.split(",");

		System.out.println("�̸�:" + out[0]);
		System.out.println("�μ�:" + out[1]);
		System.out.println("�ּ�:" + out[2]);
		System.out.println("����:" + out[3]);

	}
}

public class test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.��������Է�\n2.������� ������ȸ\n3.���α׷� ����");
			int in = sc.nextInt();
			switch (in) {
			case 1:
				Worker.setter();
				sc.nextLine();
				break;
			case 2:
				Worker.getter();
				sc.nextLine();
				break;
			case 3:
				System.out.println("����");
				return;
			}
		}

	}

}
