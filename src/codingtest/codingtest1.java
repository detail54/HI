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

//1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.  -- 
//2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�. --
//3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�. --
//4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.	if . = ""firstNum = numbers[0];
//5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�. //if null = a

//6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.	if String.length>= 16~ array-3 �迭��������?
//     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.//lastNum = numbers[numbers.length-1];

//7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.

//if arrya index <= 2,   for i = arrya[i]  index = 3  array[i] = numbers[numbers.length-1]  
