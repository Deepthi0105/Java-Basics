package inheritance;

class A {
	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}

class B extends A {
	int x;
	int y;

	public void show() {
		System.out.println(x + y);
	}
}

public class Example {

	public static void main(String[] args) {

		/*
		 * A aobj=new A(); 
		 * aobj.a=100; 
		 * aobj.b=200; 
		 * aobj.display();
		 */

		B bobj = new B();
		bobj.x = 300;
		bobj.y = 400;
		bobj.show();

		bobj.a = 150;
		bobj.b = 250;
		bobj.display();

	}
}
