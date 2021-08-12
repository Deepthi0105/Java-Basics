package array;

public class ArrayObject {

	public static void main(String[] args) {
		Object a[] = new Object[5];
		a[0] = 10;
		a[1] = 10.55;
		a[2] = 'A';
		a[3] = "Java";
		a[4] = true;

		for (Object i : a)
			System.out.println(i);

	}

}
