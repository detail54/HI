package sol21_01_25;

class Fruit {
	void fruit() {
		System.out.println("과일");
	}
}

class Apple extends Fruit {
	void apple() {
		System.out.println("사과");
	}
}

class PineApple extends Apple {
	void pineapple() {
		System.out.println("파인애플");
	}
}

public class test7 {

	static void pr(Fruit f) {

		if (f instanceof PineApple) {
			((PineApple) f).pineapple(); // 다운 캐스팅 부모-> 자식으로 형변환 하여 접근.
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
