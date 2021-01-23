package interfaceee;

interface I1{
	//int i;			
	int i = 0;				//인터페이스 내부에는 상수용으로 변수 선언이 가능. 그리고 그변수는 static final로 자동선언된다.	
	public void x();	//인터페이스는 본체(로직? {} 안에 내용) 이 없는 메소드 만을 가지고 있어야함.
}
		//접근 제어자는 반드시 public 이어야 한다.
interface I2{
	public void z();
}
		//implements - 클래스와 인터페이스 결합. (클래스 A는 인터페이스 I를 구현한다.)
class A implements I1, I2{
	public void x() {}
	public void z() {}
}
		//클래스가 상속할땐 한개의 상위클래스를 상속 할수 있지만,
		//인터페이스는 여러개 결합할 수 있다. 단, 결합한 인터페이스의 메소드를 반드시 구현을 해야함.

interface I3{
	public void a();			
}

interface I4 extends I3{		//인터페이스도 상속가능. 상속은 인터페이스도 한개의 인터페이스만 상속가능.
	public void b();			//단, 상속받은 하위 인터페이스를 클래스에 결합 시키면 상위 인터페이스와 하위 인터페이스의 메소드를 모두 구현해야함.
}

class B implements I4{
	public void a() {}
	public void b() {}
}