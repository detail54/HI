package sol21_01_25;

public class StringBufferrr {

	public static void main(String[] args) {
		// StringBuffer

		// ������ ������ ���� ���� ũ�⸦ �ڵ����� �����Ҽ��ִ�.

		// ���ڿ��� ��ų� ���ڿ� �۾��� ���� ���

		StringBuffer sb = new StringBuffer("Java");

		sb.append(" is very good");

		// �� ���� �߰��ϴ�

		sb.insert(0, "A "); // A Java is very good

		sb.replace(2, 6, "Html");

		System.out.println(sb);

	}

}