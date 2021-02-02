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
//1. LinkedList�� ��one��,��two��,��three���� �����Ѵ�. 
//���� �� Iterator�� �ݺ��� ��(while) ��three����� �ܾ ���̸�(comepareTo�Լ� ���) �����ض�.
