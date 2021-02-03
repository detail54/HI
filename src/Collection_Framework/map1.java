package Collection_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {

		Map<Integer, Double> m = new HashMap<Integer, Double>();

		m.put(2, 3.5);
		m.put(3, 5.5);
		m.put(4, 6.5);

		Set<Map.Entry<Integer, Double>> s = m.entrySet();

		for (Map.Entry<Integer, Double> m1 : s) {
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
	}

}
