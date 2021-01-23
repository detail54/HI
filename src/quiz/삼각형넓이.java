package quiz;

import java.util.Scanner;

public class 삼각형넓이 {

	public static void main(String[] args) {

		/*
		 (삼각형넓이 = (밑변 * 높이)/2)  
		--입력--
		밑변 :  입력  
		높이 :   입력
		넓이 :   XX.XX  <--- 소수 2자리까지출력하시오
		*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("밑변: ");
		int bot = s.nextInt();
		
		System.out.println("높이");
		int hei = s.nextInt();
		
		System.out.println((bot*hei)/2);
		
		
	}

}
