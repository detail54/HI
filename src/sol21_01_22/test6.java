package sol21_01_22;

interface IT {
	public void java();
}

class STudent1 {
	public void study(IT i) {
		i.java();
	}
}
  
class ITStudent implements IT {
	public void java() {
		System.out.println("자바공부");
	}

}

class DBStudent implements IT {
	public void java() {
		System.out.println("데이터베이스공부");
	}

}

public class test6 {

	public static void main(String[] args) {

		STudent1 s = new STudent1();
		ITStudent i = new ITStudent();
		DBStudent d = new DBStudent();

		s.study(i);
		s.study(d);

	}

}
