package quiz;

import java.util.Scanner;

public class 화폐갯수 {

	public static void main(String[] args) {

		/*
		[문제1]65430원을 만들기 위한 화폐의 갯수를 구하시오.
		money = 65430원
		만원 = 6
		천원 = 5
		백원 = 4
		십원 = 3
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int a = sc.nextInt();
		
		int m5 = 50000;
		int m = 10000;
		int s = 1000;
		int h = 100;
		int t = 10;
		int o = 1;
		
		int one = a%m5;
		int two = one%m;
		int three = two%s;
		int four = three%h;
		int five = four%t;
		int six = five%o;
		
		int one1 = a/m5;
		int two1 = one/m;
		int three1 = two/s;
		int four1 = three/h;
		int five1 = four/t;
		int six1 = five/o;
		
		if(a>=50000) {
			System.out.println("5만원권: "+one1+"장");
			System.out.println("1만원권: "+two1+"장");
			System.out.println("1천원권: "+three1+"장");
			System.out.println("100원 동전: "+four1+"개");
			System.out.println("10원 동전:  "+five1+"개");
			System.out.println("1원 동전: "+six1+"개");
		} else if(a<50000) {
			System.out.println("1만원권: "+two1+"장");
			System.out.println("1천원권: "+three1+"장");
			System.out.println("100원 동전: "+four1+"개");
			System.out.println("10원 동전:  "+five1+"개");
			System.out.println("1원 동전: "+six1+"개");
		} else if(a<10000) {
			System.out.println("1천원권: "+three1+"장");
			System.out.println("100원 동전: "+four1+"개");
			System.out.println("10원 동전:  "+five1+"개");
			System.out.println("1원 동전: "+six1+"개");
		} else if(a<1000) {
			System.out.println("100원 동전: "+four1+"개");
			System.out.println("10원 동전:  "+five1+"개");
			System.out.println("1원 동전: "+six1+"개");
		} else if(a<100) {
			System.out.println("10원 동전:  "+five1+"개");
			System.out.println("1원 동전: "+six1+"개");
		} else if(a<10) {
			System.out.println("1원 동전: "+six1+"개");
		} else {
			System.out.println("1원 이상의 금액을 입력하세요.");
		}
		
		
		

	}
}
