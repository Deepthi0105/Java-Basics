package methodoverloading;

public class MethodOverloadingExample {

	int a;
	int b;

	// Rule #1: Number of parameters different
	void sum() {
		a = 10;
		b = 20;
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		a = x;
		b = y;
		System.out.println(a + b);
	}

	void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	// Rule #2: Data Types of Parameter different
	void sum(int x, double y) {
		System.out.println(x + y);
	}

	// Rule #3: Order of Parameter different
	void sum(double y, int x) {
		System.out.println(y + x);
	}

	public static void main(String[] args) {
		MethodOverloadingExample mo = new MethodOverloadingExample();
		mo.sum();
		mo.sum(100, 200);
		mo.sum(100, 200, 300);
		mo.sum(100, 20.5);
		mo.sum(20.5, 20);

	}

}
