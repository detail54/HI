package sol21_01_25;

import java.util.StringTokenizer;

public class STringTokenizerrr {

	public static void main(String[] args) {

		String str = "id=123#name=gildong#addr=soule";
		//#기준으로 문자열 나눔
		StringTokenizer s = new StringTokenizer(str,"#");
		
		int n = s.countTokens();
		System.out.println(n);
		//# 기준으로 문자열 몇개가 있는지
		
				//
		while(s.hasMoreTokens()) {
			String a = s.nextToken();
			System.out.println(a);
		}
		
	}

}
