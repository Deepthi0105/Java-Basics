package array;

public class TwoDimentionsalForEach {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		for (int i[] : arr)

		{
			for (int j : i) {
				System.out.println(j);
			}
		}
	}

}
