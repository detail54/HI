package non;

import java.util.Scanner;

class Num extends Exception{
	Num(){
		super("잘못된 값!!!");
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

		System.out.println("양수 입력");

		try {
			int n = in(); 
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
