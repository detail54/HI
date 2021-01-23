package sol21_01_22;

public class boxing_unboxing {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Double b = new Double(3.14);
		  
		Integer a = 10;
		Double c = 3.14;		//자동 박싱. 
		//기본 자료형을 객체로 변경.(boxing)
		
		System.out.println(i);
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(c);
		
		i = new Integer(i.intValue());
		b = new Double(b.doubleValue());
		
		a = new Integer(a.intValue());
		c = new Double(c.doubleValue());
		//객체를 기본 자료형으로 변경.(unboxing)
		
		System.out.println(i);
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(c);
	}

}
