package sol21_02_02;

import java.util.Iterator;
import java.util.LinkedList;

public class test2 {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		
		l.add("one");
		l.add("two");
		l.add("three");
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.compareTo("three")==0){
				it.remove();
			}
		}
		
		it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
//1. LinkedList에 “one”,”two”,”three”를 저장한다. 
//저장 후 Iterator로 반복한 후(while) “three”라는 단어가 보이면(comepareTo함수 사용) 삭제해라.
