package sol21_01_25;

import java.util.StringTokenizer;

public class STringTokenizerrr {

	public static void main(String[] args) {

		String str = "id=123#name=gildong#addr=soule";
		//#�������� ���ڿ� ����
		StringTokenizer s = new StringTokenizer(str,"#");
		
		int n = s.countTokens();
		System.out.println(n);
		//# �������� ���ڿ� ��� �ִ���
		
				//
		while(s.hasMoreTokens()) {
			String a = s.nextToken();
			System.out.println(a);
		}
		
	}

}
