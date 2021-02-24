package codingtest;

import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {

		Stack<Integer> stack = new Stack<>();

		int answer = 0;

		for (int i = 0; i < moves.length; i++) {
			int j = 0;
			while (true) {
				try {
					if (board[j][moves[i] - 1] == 0) {
						j++;
						continue;
					} else {
						if (stack.empty() == true || stack.peek() != board[j][moves[i] - 1]) {
							stack.push(board[j][moves[i] - 1]);
							board[j][moves[i] - 1] = 0;
						} else {
							board[j][moves[i] - 1] = 0;
							stack.pop();
							answer += 2;
						} 
						break;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
		}
		return answer;
	}
}

public class codingtest3 {

	public static void main(String[] args) {

		int in1[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };

		int in[] = { 1, 5, 3, 5, 1, 2, 1, 4 };

		Solution ss = new Solution();
		ss.solution(in1, in);

	}

}
