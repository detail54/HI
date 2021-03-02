package codingtest;

import java.util.ArrayList;

class Solution2 {
	public String solution(String[] participant, String[] completion) {


		/*ArrayList<String> aa = new ArrayList<>();

		for (int i = 0; i < participant.length; i++) {
			aa.add(participant[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < aa.size(); j++) {
				if(aa.get(j).equals(completion[i])) {
					aa.remove(j);
					break;
				}
			}
		}

		String answer = aa.get(0);
		System.out.println(answer);
		return answer;
	}
}*/

		ArrayList<String> aa = new ArrayList<>();
		ArrayList<String> bb = new ArrayList<>();

		for (int i = 0; i < participant.length; i++) {
			aa.add(participant[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			bb.add(completion[i]);
		}
		
		aa.removeAll(bb);
		
		String answer = aa.get(0);
		System.out.println(aa);
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
