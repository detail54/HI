package sol21_01_28;

class Book{
	String a;
	int b = 40000;
	Book(String a){
		this.a=a;
	}
	Book(String a, int b){
		this.a=a;
		this.b=b;
	}
	
	void title() {
		System.out.println(a+"는 "+b+"원");
	}
}

public class test5 {

	public static void main(String[] args) {
		Book b1=new Book("자바"); 
		b1.title();            //자바는 40000원

		Book b2=new Book("파이썬", 30000);
		b2.title();           //파이썬 30000원

	}

}
