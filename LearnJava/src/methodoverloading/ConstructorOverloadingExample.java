package methodoverloading;

public class ConstructorOverloadingExample {

	int a = 0;
	int b = 0;
	double c = 0;

	ConstructorOverloadingExample() {
		a = 10;
		b = 20;
		c = 20.5;
	}

	ConstructorOverloadingExample(int x, int y) {
		a = x;
		b = y;
	}

	ConstructorOverloadingExample(int x, double y) {
		a = x;
		c = y;
	}

	ConstructorOverloadingExample(int x, int y, double z) {
		a = x;
		b = y;
		c = z;
	}

	ConstructorOverloadingExample(int x, double y, int z) {
		a = x;
		c = y;
		b = z;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		ConstructorOverloadingExample co = new ConstructorOverloadingExample();
		co.display();

		ConstructorOverloadingExample co1 = new ConstructorOverloadingExample(10, 20);
		co1.display();

		ConstructorOverloadingExample co2 = new ConstructorOverloadingExample(10, 20.5);
		co2.display();

		ConstructorOverloadingExample co3 = new ConstructorOverloadingExample(10, 20, 20.5);
		co3.display();

		ConstructorOverloadingExample co4 = new ConstructorOverloadingExample(10, 20.5, 20);
		co4.display();

	}

}
