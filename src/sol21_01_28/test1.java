package sol21_01_28;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("�Է�: ");
			int a = sc.nextInt();
			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.print("¦");
				if (a / 10 == 3 || a / 10 == 6 || a / 10 == 9) {
					System.out.print("¦");
				}
				System.out.println();
			} else if(a / 10 == 3 || a / 10 == 6 || a / 10 == 9){
				System.out.print("¦");
				System.out.println();
			} else {
				System.out.print("��");
				System.out.println();
			}
		}
	}
}
//3. 1~100���� �������Է¹޾� 3,6,9 �� �ϳ��� �ִ� ��� ��¦��, �� �� �ִ� ��� ��¦¦��,
//�ϳ��� ������ ������������ض�. 
//(�������� 39��� �� ��, n/10=3, n%10=9 �� ���´�.   (/, % ������ Ȱ��))
//���� ���) �Է�:39                
//¦¦