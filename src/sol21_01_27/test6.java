package sol21_01_27;

interface Personn {

	String work();
}
class Worker implements Personn{
	public String work() {
		return "���Ѵ�";
	}
}

class Student implements Personn{
	public String work() {
		return "�����Ѵ�";
	}
}
public class test6 {

	static void pr(Personn p) {

		System.out.println(p.work());
	}

	public static void main(String[] args) {

		pr(new Worker()); // ���Ѵ�
		pr(new Student()); // �����Ѵ� ���

	}

}
