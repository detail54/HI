package sol21_01_25;

import java.util.Scanner;

//2. �߻� Ŭ���� Calc�� �ۼ��ض�. 
abstract class Calc {

//	2.1 �ʵ�� double�� op1, op2�� �ְ�, �� ���� �ǿ����ڴ�. 
	double op1;
	double op2;

//	2.2 void set(double op1, double op2); �޼���� �ʵ尪�� �����Ѵ�.(�ʱ�ȭ) 
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

//2.3 double calculate()�� �߻� �޼���� Calc�� ��ӹ޾� ����ϴ� 		Ŭ������ ������ �´� ���� �����ϰ� ����� ��ȯ�Ѵ�. 
	abstract double calculate();
}

//B. 	Add, Sub, Mul, DivŬ������ Calc�� ��ӹ޾� Ŭ���� �̸��� �´� ������ 	�ϵ��� �����ض�. 
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
			System.out.print("�� �ǿ����ڿ� ������ �Է�:");
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
				
			case "��":
				break;
			}
		}
	}
}

public class test9 {

	public static void main(String[] args) {
//		C. ���� �޼ҵ忡�� ���� �������� ���� �� ���� ������ �����ڸ� �Է¹��� �� Add, Sub, Mul, Div �� �����ڸ� ó���� �� �ִ� ��ü�� �����ϰ� 
//		set()�� 	calculate()�� ȣ���Ͽ� ������� ȭ�鿡 ����ض�.(switch-case) 
//		������) �� �ǿ����ڿ� ������ �Է�: 10 5 / 
//		��: 2.0 

		Scanner sc = new Scanner(System.in);

		Sca sss = new Sca();
		Sca.sca();

	}

}
