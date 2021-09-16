package oops;

public class Calculation2 {

	int a;
	int b;

//Method returns some value

	int sum() {
		return (a + b);
	}

	public static void main(String[] args) {
		Calculation2 cal = new Calculation2();

		cal.a = 100;
		cal.b = 200;
		int result = cal.sum();
		System.out.println(result);

	}

}
