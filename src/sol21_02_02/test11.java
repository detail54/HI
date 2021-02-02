package sol21_02_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> a = new ArrayList<>();
		int big = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("정수입력: ");
			int in = sc.nextInt();
			a.add(in);
		}

		Iterator<Integer> it = a.iterator();

		while (it.hasNext()) {
			if (big < it.next()) {
				big = it.next();
			}

		}
		System.out.println(big);

	}

}
//Scanner를 사용하여 5개 정수값을 입력받아
//list 또는  vector에 저장한다
//저장후 list, vector를 검색하여 가장 큰 수 출력해라.