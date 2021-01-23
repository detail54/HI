package quiz;

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {

		// [문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
		// 조건) 성별 : M 이면 "남자", 나머지 "여자" (삼항연산자 이용)

		Scanner s = new Scanner(System.in);

		String in;
		String out;
		
		System.out.print("성별: ");
		in = s.next();

		out = (in.equals("M")) ? "남자" : "여자";

		System.out.println(out);
	}

}
