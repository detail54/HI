package quiz;

import java.util.Scanner;

public class �ﰢ������ {

	public static void main(String[] args) {

		/*
		 (�ﰢ������ = (�غ� * ����)/2)  
		--�Է�--
		�غ� :  �Է�  
		���� :   �Է�
		���� :   XX.XX  <--- �Ҽ� 2�ڸ���������Ͻÿ�
		*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�غ�: ");
		int bot = s.nextInt();
		
		System.out.println("����");
		int hei = s.nextInt();
		
		System.out.println((bot*hei)/2);
		
		
	}

}
