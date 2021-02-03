package sol21_02_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test1 {
		
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		Integer big = 0;
		Integer sum = 0;
		String bbig = null;
		int i = 0;
		
		m.put("aa",100);
		m.put("bb",74);
		m.put("cc",33);
		
		Set<Map.Entry<String, Integer>> s = m.entrySet();
		
		for(Map.Entry<String, Integer> m2 : s) {
			sum += m2.getValue();
			if(big < m2.getValue()) {
				big = m2.getValue();
				bbig = m2.getKey();
			}
			i++;
		}
		System.out.println("평균: "+(sum/i));
		System.out.println("최고점수: "+big+"점 "+"이름: "+bbig);
	}

}
//3. HashMap인터페이스 구조(이름, 성적)<String, Integer>로 설정해 임의의 값 3개 해쉬맵에 저장한다. 저장 후 평균 점수와 최고점수, 최고 점수를 받은 이름을 출력해라. 
//
//(entrySet, getKey, getValue 메소드 이용)
//
//​