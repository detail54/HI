package quiz;

import java.util.Scanner;

public class ȭ�󰹼� {

	public static void main(String[] args) {

		/*
		[����1]65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
		money = 65430��
		���� = 6
		õ�� = 5
		��� = 4
		�ʿ� = 3
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ�: ");
		int a = sc.nextInt();
		
		int m5 = 50000;
		int m = 10000;
		int s = 1000;
		int h = 100;
		int t = 10;
		int o = 1;
		
		int one = a%m5;
		int two = one%m;
		int three = two%s;
		int four = three%h;
		int five = four%t;
		int six = five%o;
		
		int one1 = a/m5;
		int two1 = one/m;
		int three1 = two/s;
		int four1 = three/h;
		int five1 = four/t;
		int six1 = five/o;
		
		if(a>=50000) {
			System.out.println("5������: "+one1+"��");
			System.out.println("1������: "+two1+"��");
			System.out.println("1õ����: "+three1+"��");
			System.out.println("100�� ����: "+four1+"��");
			System.out.println("10�� ����:  "+five1+"��");
			System.out.println("1�� ����: "+six1+"��");
		} else if(a<50000) {
			System.out.println("1������: "+two1+"��");
			System.out.println("1õ����: "+three1+"��");
			System.out.println("100�� ����: "+four1+"��");
			System.out.println("10�� ����:  "+five1+"��");
			System.out.println("1�� ����: "+six1+"��");
		} else if(a<10000) {
			System.out.println("1õ����: "+three1+"��");
			System.out.println("100�� ����: "+four1+"��");
			System.out.println("10�� ����:  "+five1+"��");
			System.out.println("1�� ����: "+six1+"��");
		} else if(a<1000) {
			System.out.println("100�� ����: "+four1+"��");
			System.out.println("10�� ����:  "+five1+"��");
			System.out.println("1�� ����: "+six1+"��");
		} else if(a<100) {
			System.out.println("10�� ����:  "+five1+"��");
			System.out.println("1�� ����: "+six1+"��");
		} else if(a<10) {
			System.out.println("1�� ����: "+six1+"��");
		} else {
			System.out.println("1�� �̻��� �ݾ��� �Է��ϼ���.");
		}
		
		
		

	}
}
