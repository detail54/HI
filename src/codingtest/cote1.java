package codingtest;

import java.util.ArrayList;
import java.util.Arrays;


class cote1 {
	public static int[] solution(int[] arr) {
		int[] answer = {};
		int check = 10;
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != check) {
				check = arr[i];
				ary.add(check);
			}
		}
		
		answer = new int[ary.size()];
		for(int i = 0; i < ary.size(); i++) {
			answer[i] = ary.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] ary = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(solution(ary)));
	}
}