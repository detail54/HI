package sol21_01_22;

class In {

	private int a;

	In(int a) {
		this.a = a;
	}	//toString 함수는 public 필수
	public String toString() {
		return Integer.toString(a);
	}
}
  
public class test5 {

	public static void main(String[] args) {

		In i = new In(4);
		System.out.println(i);

	}

}
