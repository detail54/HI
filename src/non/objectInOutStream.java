package non;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class sol implements Serializable {
	String a;
	int b;

	sol(String a, int b) {
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
}

public class objectInOutStream {

	public static void main(String[] args) {
/*
		FileOutputStream fo = null;
		ObjectOutputStream oos = null;

		try {
			fo = new FileOutputStream("hi.dat");
			oos = new ObjectOutputStream(fo);

			sol s = new sol("안뇽", 11);
			sol s1 = new sol("하이", 22);
			sol s2 = new sol("하하", 33);
			
			oos.writeObject(s);
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			fo.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/

		FileInputStream fi = null;
		ObjectInputStream ois = null;
		
		try {
			fi = new FileInputStream("hi.dat");
			ois = new ObjectInputStream(fi);
			
			sol s = (sol)ois.readObject();
			sol s1 = (sol)ois.readObject();
			sol s2 = (sol)ois.readObject();

			s.show();
			s1.show();
			s2.show();

			fi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
