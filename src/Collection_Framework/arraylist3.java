package Collection_Framework;

import java.util.ArrayList;

class Profile {
	String id;
	int age;

	Profile(String i, int a) {
		id = i;
		age = a;
	}
}

public class arraylist3 {

	public static void main(String[] args) {

		ArrayList<Profile> a = new ArrayList<>();

		a.add(new Profile("aa", 12));
		a.add(new Profile("bb", 16));
		a.add(new Profile("cc", 15));

		for (int i = 0; i < a.size(); i++) {
			Profile p = a.get(i);
			System.out.println(p.age+ " " +p.id);
		}

	}

}
