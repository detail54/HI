package Collection_Framework;

class Fo<T>{
	T t;
	
	void in(T t){
		this.t=t;
	}
	T out() {
		return t;
	}
}

class Food{
	
	void show() {
		System.out.println("음식");
	}
}
class Pizza extends Food{
	
	void show() {
		super.show();
		System.out.println("피자");
	}
}

public class generic5 {
					//제너릭 클래스 제한.		<? extends Food> Food의 자식만 pr의 매개변수로 들어오게.
	static void pr(Fo <? extends Food> f){
		Food fo = f.out();
		fo.show();
	}
	
	public static void main(String[] args) {

		Fo<Food> f = new Fo<Food>();
		f.in(new Food());
		pr(f);

		Fo<Pizza> f1 = new Fo<Pizza>();
		f1.in(new Pizza());
		pr(f1);

	}

}
