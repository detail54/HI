package codingtest;

import java.util.Arrays;

class Solution2 {
	public String solution(String[] participant, String[] completion) {

		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (completion[i].equals(participant[i])) {
				continue;
			} else {
				if (i + 1 == completion.length) {
					answer = participant[participant.length - 1];
					break;
				} else {
					answer = participant[i];
					break;
				}

			}
		}

		System.out.println(answer);
		return answer;

	}
}

public class codingtest5 {

	public static void main(String[] args) {

		Solution2 ss = new Solution2();

		String[] in1 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] in2 = { "josipa", "filipa", "marina", "nikola" };

		ss.solution(in1, in2);

	}

}
