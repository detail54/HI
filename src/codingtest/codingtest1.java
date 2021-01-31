package codingtest;

public class codingtest1 {

	public static String solution(String new_id) {

		int ch;
		String aa = "";

		for (int i = 0; i < new_id.length(); i++) {
			ch = new_id.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				aa += (char) (ch + 32);
			} else if ((ch >= 'a' && ch <= 'z') || ch == '.' || ch == '-' || ch == '_' || ch == '.') {
				aa += (char) ch;
			} else {
				aa += "";
			}
		}

		if (aa.contains("..")) {
			for (int i = 0; i < aa.length(); i++) {
				aa = aa.replace("..", ".");
			}
		}

		StringBuffer str = new StringBuffer(aa);

		if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
			if (str.charAt(0) == '.') {
				str.deleteCharAt(0);
			}
			if (str.charAt(str.length() - 1) == '.') {
				str.deleteCharAt(str.length() - 1);
			}
		}
		
		
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					str.replace(i, i + 1, "a");
				}
			}
		

		if (str.length() > 15) {
			str.delete(16, str.length() - 1);
			if (str.length() - 1 == '.') {
				str.deleteCharAt(str.length() - 1);
			}
		}

		String answer = str.toString();
		String re = "";

		if (answer.length() <= 2) {
			for (int i = (answer.length() - 1) + 1; i < 3; i++) {
				String sc = answer.substring(0, answer.length() - 1);
				re = sc + "a";
			}
			answer = re;
		}

		return answer;
	}

	public static void main(String[] args) {

		String in = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(solution(in));

	}

}

//1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.  -- 
//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다. --
//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다. --
//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.	if . = ""firstNum = numbers[0];
//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다. //if null = a

//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.	if String.length>= 16~ array-3 배열수미지정?
//     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.//lastNum = numbers[numbers.length-1];

//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

//if arrya index <= 2,   for i = arrya[i]  index = 3  array[i] = numbers[numbers.length-1]  
