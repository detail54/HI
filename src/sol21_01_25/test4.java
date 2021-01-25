package sol21_01_25;

class XY {

	private int x, y;

	XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getx() {
		return x;
	}

	int gety() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class XYZ extends XY {
	String str;
	int x;
	int y;
	
	XYZ(int a, int b, String srt){
		super(a,b);
		this.str = str;
	}
	void setxy(int a, int b){
		move(a,b);
	}
	void setcolor(String str) {
		this.str = str;
	}
	void show(){
		System.out.println(getx()+","+gety()+"ÀÎ "+str+"»ö");
	}

}

public class test4 {

	public static void main(String[] args) {

		XYZ xyz = new XYZ(10, 10, "red");

		xyz.setxy(20, 30);
		xyz.setcolor("blue");
		xyz.show();

	}

}
