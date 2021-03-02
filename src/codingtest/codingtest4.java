package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution1 {
	public int[] solution(int[] numbers) {
		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				h.add(numbers[i] + numbers[j]);
			}
		}

		Iterator<Integer> it = h.iterator();
		int answer[] = new int[h.size()];

		for (int i = 0; i < h.size(); i++) {

			answer[i] = it.next();
		}
		Arrays.sort(answer);
		return answer;
	}
}

public class codingtest4 {

	public static void main(String[] args) {

		int[] in = { 2, 1, 3, 4, 1, 4, 7, 2, 6, 3, 6, 10, 0, 0 };

		Solution1 ss = new Solution1();
		ss.solution(in);

	}

}
