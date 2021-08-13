package array;

public class ArrayUsingString {

	public static void main(String[] args) {

		String s[] = new String[5];
		s[0] = "Welcome";
		s[1] = "To";
		s[2] = "Java";
		s[3] = "Learning";

		System.out.println(s.length);

		for (String i : s) {
			System.out.println(i);
		}
	}
}
