package sol21_01_26;

class Circle{
	int a;
	
	Circle(int a){
		this.a = a;
	}
	public String toString() {
		return a+" ";
	}
}

public class test2 {

	public static void main(String[] args) {
		Circle a = new Circle(30);
		Circle b = new Circle(30);

		System.out.println("������" + a);
		System.out.println("������" + b);

		if (a.equals(b)) {
			System.out.println("���� ��");
		} else {
			System.out.println("�ٸ� ��");
		}
	}

}
