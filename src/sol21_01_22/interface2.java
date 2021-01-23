package sol21_01_22;

class Tv{
	public void on() {
		System.out.println("티비 켬");
	}
}  

interface Computer{
	public void m();
}
class Com{
	public void m() {
		System.out.println("컴");
	}
}
class Ipad extends Tv implements Computer{
	
	Com c = new Com();
	public void m() {	//Computer m 함수.
		c.m();	//Com m 함수
	}
	public void ip() {
		m();
		on();
	}
	
}
public class interface2 {

	public static void main(String[] args) {

		Ipad i = new Ipad();
		
		i.ip();
		

	}

}
