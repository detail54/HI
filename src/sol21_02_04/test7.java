package sol21_02_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Collection_Framework.arraylist3;

class HIHI {

	private String num;
	private String name;
	private String bo;
	private String jo;
	private String bu;

	static ArrayList<String> ary = new ArrayList<>();
	static HashMap<String, ArrayList<String>> h = new HashMap<>();

	HIHI(String a, String b, String c, String d, String e) {
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

		new HIHI(a, b, c, d, e);
	}

	static void getter() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� ���: ");
		String cho = sc.next();

		String re = String.valueOf(h.get(cho));
		re.substring(1, re.length() - 1);
		re.replace(" ", "");
		String[] out = re.split(",");

		System.out.println("�̸�: " + out[0]);
		System.out.println("�μ�: " + out[1]);
		System.out.println("�ּ�: " + out[2]);
		System.out.println("����: " + out[3]);

	}
}

public class test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.��������Է�\n2.������� ������ȸ\n3.���α׷� ����");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				HIHI.setter();
				break;
			case 2:
				HIHI.getter();
				break;
			case 3:
				System.out.println("����");
				return;
			}
		}

	}

}
