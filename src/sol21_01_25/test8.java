package sol21_01_25;

//1. Ŭ���� Grade 
class Grade {
//	1.1 �ʵ�� int�� english, math, science�� ��� private���� �����϶�. �� �ʵ���� ����, ����, ���� ������ �����ϴ� �� ����Ѵ�. 
	private int english;
	private int math;
	private int science;

//	1.2 �����ڴ� �⺻ �����ڿ� �� �ʵ带 �ʱ�ȭ�ϴ� ������ �ΰ����� �����ض�. ������ ������ ��� �Ѱ��� �̻��� this()����� ���Խ��Ѷ�. 
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
//	1.3 �޼ҵ�� �ʿ��� �Լ����� ���Ƿ� �����ϰ�, �� ������ ����� ���ϴ� avg�޼��带 �����ض�. avg�޼���� double���� ��ȯ�Ѵ�. 
	double avg() {

		return (english + math + science) / (double)3;
	}
}

public class test8 {

	public static void main(String[] args) {

		int aa = (int)(Math.random()*101);
		int bb = (int)(Math.random()*101);
		int cc = (int)(Math.random()*101);
		
//		1.4 main�޼��忡�� Grade�� �⺻�����ڿ� �� ������ ������ �ʱ�ȭ�ϴ� ������(�Ķ���� ����)�� ����Ͽ� Grade ��ü �� ���� �����ض�. 
		Grade g = new Grade();
		Grade g1 = new Grade(aa,bb,cc);
		
//		�� ������ ������ ������ ���� ���α׷�(������ ���� �ֱ�)���� �����ض�. �� ��ü�� ���ؼ� english, math, science������ �� ������ ��հ��� ȭ�鿡 ����ض�. 	
		System.out.println(g.avg());
		System.out.println(g1.avg());
		

	}

}
