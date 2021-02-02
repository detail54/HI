package sol21_02_02;

public class test5 {

	static int[] make() {
		int ary[] = new int[5];
		for (int i = 0; i < 5; i++) {
			ary[i] = i;
		}
		return ary;
	}

	public static void main(String[] args) {

		int ary[];
		ary = make();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}

}

//실행결과) 0 1 2 3 4 출력