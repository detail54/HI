package sol21_01_25;

public class StringBufferrr {

	public static void main(String[] args) {
		// StringBuffer

		// 문자의 개수에 따라 버퍼 크기를 자동으로 조절할수있다.

		// 문자열이 길거나 문자열 작업이 많은 경우

		StringBuffer sb = new StringBuffer("Java");

		sb.append(" is very good");

		// 맨 끝에 추가하다

		sb.insert(0, "A "); // A Java is very good

		sb.replace(2, 6, "Html");

		System.out.println(sb);

	}

}