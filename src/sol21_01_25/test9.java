package sol21_01_25;

import java.util.Scanner;

//2. 추상 클래스 Calc를 작성해라. 
abstract class Calc {

//	2.1 필드는 double형 op1, op2가 있고, 두 개는 피연산자다. 
	double op1;
	double op2;

//	2.2 void set(double op1, double op2); 메서드는 필드값을 설정한다.(초기화) 
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

//2.3 double calculate()는 추상 메서드로 Calc를 상속받아 사용하는 		클래스의 목적에 맞는 연산 실행하고 결과를 반환한다. 
	abstract double calculate();
}

//B. 	Add, Sub, Mul, Div클래스는 Calc를 상속받아 클래스 이름에 맞는 연산을 	하도록 구현해라. 
class Add extends Calc {

	double calculate() {
		return op1 + op2;
	}
}

class Sub extends Calc {

	double calculate() {
		return op1 - op2;
	}
}

class Mul extends Calc {

	double calculate() {
		return op1 * op2;
	}
}

class Div extends Calc {

	double calculate() {
		return op1 / op2;
	}
}
class Sca extends Calc{
	
	double calculate() {
		return 0.0;
	}
	static void sca() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("두 피연산자와 연산자 입력:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			String s = sc.next();
			
			switch (s) {
			case "+":
				Calc ad = new Add();
				ad.set(a, b);
				System.out.println(ad.calculate());
				sc.nextLine();
				continue;
			case "-":
				Calc su = new Sub();
				su.set(a, b);
				System.out.println(su.calculate());
				sc.nextLine();
				continue;
			case "*":
				Calc mu = new Mul();
				mu.set(a, b);
				System.out.println(mu.calculate());
				sc.nextLine();
				continue;
			case "/":
				Calc di = new Div();
				di.set(a, b);
				System.out.println(di.calculate());
				sc.nextLine();
				continue;
				
			case "끝":
				break;
			}
		}
	}
}

public class test9 {

	public static void main(String[] args) {
//		C. 메인 메소드에서 다음 실행결과와 같이 두 개의 정수와 연산자를 입력받은 후 Add, Sub, Mul, Div 중 연산자를 처리할 수 있는 객체를 생성하고 
//		set()와 	calculate()를 호출하여 결과값을 화면에 출력해라.(switch-case) 
//		실행결과) 두 피연산자와 연산자 입력: 10 5 / 
//		답: 2.0 

		Scanner sc = new Scanner(System.in);

		Sca sss = new Sca();
		Sca.sca();

	}

}
