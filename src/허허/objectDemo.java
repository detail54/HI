package ����;

import java.util.Scanner;

class objectDemo {

	int left;
	String right;

	public void Test(int left, String right) {

		this.left = left;
		this.right = right;
		
		for (int i = 0; i < left; i++) {
			System.out.println(right);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int left;
		String right;
		
		System.out.print("�ݺ���ų Ƚ��: ");
		left = sc.nextInt();
		System.out.print("�ݺ���ų ����: ");
		right = sc.next();
		
		
		objectDemo output = new objectDemo();
		
		output.Test(left, right);
		
		
		
	}
}
