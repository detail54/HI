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
		System.out.println("����");
	}
}
class Pizza extends Food{
	
	void show() {
		super.show();
		System.out.println("����");
	}
}

public class generic5 {
					//���ʸ� Ŭ���� ����.		<? extends Food> Food�� �ڽĸ� pr�� �Ű������� ������.
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
