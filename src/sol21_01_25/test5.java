package sol21_01_25;

interface Re {

	default void show() {
		System.out.println("�簢��!");
	}
	abstract int area();
}

class Rec implements Re{
	int a;
	int b;
	Rec(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int area() {
		return a*b;
	}
}

public class test5 {

	public static void main(String[] args) {

		Re r = new Rec(10, 20);
		r.show(); // "�簢��!!" ���
		System.out.println("����" + r.area());
	}

}
