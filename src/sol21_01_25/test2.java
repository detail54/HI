package sol21_01_25;

class Tv {

	private int size;
	Tv(int size) {
		this.size = size;
	}
	protected int getsize() {
		return size;
	}
}

class Tv1 extends Tv {

	String b;
	
	Tv1(int a, String b) {
		super(a);
		this.b = b;
	}
	void show(){
		System.out.println(b+" "+getsize()+"ÀÎÄ¡ Tv");
	}

}

public class test2 {

	public static void main(String[] args) {

		Tv1 t = new Tv1(20, "»ï¼º");

		t.show();

	}

}
