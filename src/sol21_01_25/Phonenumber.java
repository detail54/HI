package sol21_01_25;

import java.util.Scanner;

class PhoneNum {
	String name;
	String phone;

	PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}

	void show() {
		System.out.println("�̸� " + name);
		System.out.println("��ȣ " + phone); 
	}
}

class School extends PhoneNum {
	String major;

	School(String n, String p, String m) {
		super(n, p);
		this.major = m;
	}

	void show() {
		super.show();
		System.out.println("���� " + major);
	}
}

class Worker extends PhoneNum {
	String grade;

	Worker(String n, String p, String g) {
		super(n, p);
		this.grade = g;
	}

	void show() {
		super.show();
		System.out.println("�μ� " + grade);
	}
}

class Arr {
	PhoneNum[] ary;
	int n;

	Arr(int n) {	// school�� worker �� �����ؼ� �Է� �����ǵ� �׷��� ���ؼ��� school�� worker�� ����� ��� ����ؾ���. �׷��� ��2������ ���� Ŭ������ PhoneNum�� �ҷ���.
		ary = new PhoneNum[n];
	} 

	void add(PhoneNum p) {
		ary[n++] = p;
	}

	void frined(char ch) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("��ȣ: ");
		String num = sc.next();

		switch (ch) {
		case 'A':
			System.out.print("����: ");
			String major = sc.next();
			add(new School(name, num, major));
			break;
		case 'B':
			System.out.print("�μ�: ");
			String grade = sc.next();
			add(new Worker(name, num, grade));
			break;
		}
	}

	void all() {
		for (int i = 0; i < ary.length; i++) {
			ary[i].show();
		}
	}
}

public class Phonenumber {

	public static void main(String[] args) {
		
		Arr ar = new Arr(3);
		
		while (true) {
			System.out.println("A.�б� ģ�� ����");
			System.out.println("B.���� ���� ����");
			System.out.println("C.����");
			System.out.println("D.���");
			
			Scanner sc = new Scanner(System.in);
			
			char c = sc.next().charAt(0);
			
			switch(c) {
			case 'A':
				ar.frined(c);
				break;
			case 'B':
				ar.frined(c);
				break;
			case 'C' :
				System.out.println("����");
				return;
			case 'D' : 
				ar.all();
				
			}
			
		}
		
		
	}

}
