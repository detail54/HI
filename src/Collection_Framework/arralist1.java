package Collection_Framework;

import java.util.ArrayList;

public class arralist1 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		a.add("태현");
		a.add("대현");
		a.add("형록");
		
		for (int i = 0; i < a.size(); i++) {
			String zz = a.get(i);
			System.out.println(zz);
		}

	}

}
