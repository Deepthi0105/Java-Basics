package statickeyword;

public class StaticExample {

	int a;
	static int b;

	static void m1() {
		System.out.println(("This is m1 - Static Method"));
	}

	void m2() {
		System.out.println("This is m2 - Non static method");
	}

	// Non static method can access everything
	void m3() {
		a = 500;
		b = 1000;
		m1();
		m2();
	}

	public static void main(String[] args) {

		// static methods can access static stuff only

		b = 200;//static variable 
		m1(); //static method 

		// static method can also access non static stuff but through object

		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);
		se.m2();

		System.out.println("Non static method can access everything");
	}

}
