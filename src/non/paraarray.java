package non;

import java.util.Scanner;

class Song {
	String a;
	String b;

	Song(String a, String b) {
		this.a = a;
		this.b = b;
	}

}
//��ü�迭
public class paraarray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Song so[] = new Song[2];

		for (int i = 0; i < so.length; i++) {
			System.out.print("����: ");
			String singer = s.next();

			System.out.print("Ÿ��Ʋ: ");
			String title = s.next();

			so[i] = new Song(singer, title);
		}
		
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i].a + " " + so[i].b);
		}

	}

}
