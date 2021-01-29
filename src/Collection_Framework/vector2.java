package Collection_Framework;

import java.util.Vector;

class XY{
	int a;
	int b;
	
	XY(int a, int b){
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return a+" "+b;
	}
}

public class vector2 {

	public static void main(String[] args) {

		Vector<XY> v = new Vector<XY>();
		
		v.add(new XY(4,7));
		v.add(new XY(5,9));
		v.add(new XY(10,11));
		
		v.remove(2);	//인덱스 값 삭제
		
		for(int i=0; i<v.size(); i++) {
			XY x=v.get(i);
			System.out.println(x);
		}
	}

}
