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
		System.out.println(a+"�� "+b+"��");
	}
}

public class test5 {

	public static void main(String[] args) {
		Book b1=new Book("�ڹ�"); 
		b1.title();            //�ڹٴ� 40000��

		Book b2=new Book("���̽�", 30000);
		b2.title();           //���̽� 30000��

	}

}
