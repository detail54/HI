package interfaceee;

interface I1{
	//int i;			
	int i = 0;				//�������̽� ���ο��� ��������� ���� ������ ����. �׸��� �׺����� static final�� �ڵ�����ȴ�.	
	public void x();	//�������̽��� ��ü(����? {} �ȿ� ����) �� ���� �޼ҵ� ���� ������ �־����.
}
		//���� �����ڴ� �ݵ�� public �̾�� �Ѵ�.
interface I2{
	public void z();
}
		//implements - Ŭ������ �������̽� ����. (Ŭ���� A�� �������̽� I�� �����Ѵ�.)
class A implements I1, I2{
	public void x() {}
	public void z() {}
}
		//Ŭ������ ����Ҷ� �Ѱ��� ����Ŭ������ ��� �Ҽ� ������,
		//�������̽��� ������ ������ �� �ִ�. ��, ������ �������̽��� �޼ҵ带 �ݵ�� ������ �ؾ���.

interface I3{
	public void a();			
}

interface I4 extends I3{		//�������̽��� ��Ӱ���. ����� �������̽��� �Ѱ��� �������̽��� ��Ӱ���.
	public void b();			//��, ��ӹ��� ���� �������̽��� Ŭ������ ���� ��Ű�� ���� �������̽��� ���� �������̽��� �޼ҵ带 ��� �����ؾ���.
}

class B implements I4{
	public void a() {}
	public void b() {}
}