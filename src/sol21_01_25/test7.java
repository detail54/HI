package sol21_01_25;

class Fruit {
	void fruit() {
		System.out.println("����");
	}
}

class Apple extends Fruit {
	void apple() {
		System.out.println("���");
	}
}

class PineApple extends Apple {
	void pineapple() {
		System.out.println("���ξ���");
	}
}

public class test7 {

	static void pr(Fruit f) {

		if (f instanceof PineApple) {
			((PineApple) f).pineapple(); // �ٿ� ĳ���� �θ�-> �ڽ����� ����ȯ �Ͽ� ����.
		} else if(f instanceof Apple){
			((Apple) f).apple();
		} else {
			f.fruit();
		}

	}

	public static void main(String[] args) {

		Fruit f = new Fruit();
		Apple a = new Apple();
		PineApple p = new PineApple();

		pr(f);
		pr(a);
		pr(p);

	}

}
