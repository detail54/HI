package sol21_01_22;

class Person {}
class Student extends Person {}
class Worker extends Student {}
class ITWorker extends Worker {}
  
public class interface1 {
	static void show(Person p) {
				// 진짜 Person의 자식 클래스가 맞는지 비교하는 연산자.
		if (p instanceof Person) {
			System.out.println("사람");
		}
		if (p instanceof Student) {
			System.out.println("학생");
		}
		if (p instanceof Worker) {
			System.out.println("직장인");
		}
		if (p instanceof ITWorker) {
			System.out.println("IT직장인");
		}
	}

	public static void main(String[] args) {

		// Person p = new Student();
		// Person p = Worker();
		// Person p = ITWorker();

		show(new Student());
		show(new Worker());
		show(new ITWorker());

	}

}
