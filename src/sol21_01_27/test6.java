package sol21_01_27;

interface Personn {

	String work();
}
class Worker implements Personn{
	public String work() {
		return "일한다";
	}
}

class Student implements Personn{
	public String work() {
		return "공부한다";
	}
}
public class test6 {

	static void pr(Personn p) {

		System.out.println(p.work());
	}

	public static void main(String[] args) {

		pr(new Worker()); // 일한다
		pr(new Student()); // 공부한다 출력

	}

}
