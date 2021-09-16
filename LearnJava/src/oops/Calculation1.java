package oops;

public class Calculation1 {

	int a;
	int b;

	// Method takes parameters

	void sum(int x, int y) {
		a = x;
		b = y;
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Calculation1 cal = new Calculation1();

		cal.sum(100, 200);

	}

}
