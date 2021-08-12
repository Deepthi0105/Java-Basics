package array;

public class ArrayExample4 {

	public static void main(String[] args) {

		int arr[] = { 100, 200, 300, 400, 500 };
		int sum = 0;

		for (int i : arr) {
			sum = sum + i;
			System.out.println("sum::>>" + sum + " after element::>>" + i);
		}
	}

}
