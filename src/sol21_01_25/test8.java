package sol21_01_25;

//1. 클래스 Grade 
class Grade {
//	1.1 필드는 int형 english, math, science로 모두 private으로 선언하라. 이 필드들은 영어, 수학, 과학 점수를 저장하는 데 사용한다. 
	private int english;
	private int math;
	private int science;

//	1.2 생성자는 기본 생성자와 세 필드를 초기화하는 생성자 두가지를 구현해라. 생성자 구현에 적어도 한가지 이상의 this()사용을 포함시켜라. 
	Grade() {
		this.english = (int)(Math.random()*101);
		this.math = (int)(Math.random()*101);
		this.science = (int)(Math.random()*101);
	}

	Grade(int english, int math, int science) {
		this();
		this.english = english;
		this.math = math;
		this.science = science;
	}
//	1.3 메소드는 필요한 함수들을 임의로 구현하고, 세 과목의 평균을 구하는 avg메서드를 구현해라. avg메서드는 double형을 반환한다. 
	double avg() {

		return (english + math + science) / (double)3;
	}
}

public class test8 {

	public static void main(String[] args) {

		int aa = (int)(Math.random()*101);
		int bb = (int)(Math.random()*101);
		int cc = (int)(Math.random()*101);
		
//		1.4 main메서드에서 Grade의 기본생성자와 각 과목의 점수를 초기화하는 생성자(파라미터 포함)를 사용하여 Grade 객체 두 개를 생성해라. 
		Grade g = new Grade();
		Grade g1 = new Grade(aa,bb,cc);
		
//		각 과목의 점수는 적당한 값을 프로그램(임의의 값을 주기)에서 지정해라. 두 객체에 대해서 english, math, science점수와 세 과목의 평균값을 화면에 출력해라. 	
		System.out.println(g.avg());
		System.out.println(g1.avg());
		

	}

}
