package array;

public class TwoDimensionalArrayExercise {

	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 100, 110, 120 } };

		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
