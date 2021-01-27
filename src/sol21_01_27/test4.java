package sol21_01_27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String a;
	String b;
	int c;
	int d;
	
	Person(String a, String b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	void show(){
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
public class test4 {

	public static void main(String[] args) {

		try {
			ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream("a.txt"));
			oi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("a.txt"));
			oi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Person p=new Person("Jack", "computer", 20, 123); 

		p.show(); 
		
	}

}
