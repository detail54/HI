package non;

import java.util.Scanner;

class Num extends Exception{
	Num(){
		super("�߸��� ��!!!");
	}
}

public class sfewefwe {

	static int in() throws Num{
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		if(in<0) {
			Num num = new Num();
			throw num;
		}
		return in;
	}

	public static void main(String[] args) {

		System.out.println("��� �Է�");

		try {
			int n = in(); 
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
