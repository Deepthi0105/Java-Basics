package inheritance;

class P {
	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}

class Q extends P {
	int x;
	int y;

	public void show() {
		System.out.println(x + y);
	}
}

class R extends Q {
	int p;
	int q;

	public void addition() {
		System.out.println(p + q);
	}
}

public class Example2 {

	public static void main(String[] args) {
		R robj = new R();
		robj.a = 10;
		robj.b = 20;
		robj.x = 30;
		robj.y = 40;
		robj.p = 50;
		robj.q = 60;
		robj.display();
		robj.show();
		robj.addition();

	}
}
