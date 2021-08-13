package array;

public class StringMethods {

	public static void main(String[] args) {

		// Length of String

		String s = "Welcome";
		System.out.println(s.length());

		// Concatenation

		String s1 = "Welcome To";
		String s2 = " Learning Java";

		System.out.println(s1 + s2);

		System.out.println(s1.concat(s2));

		System.out.println("Welcome To" + " Learning Java");
		System.out.println("Welcome To".concat(" Learning Java"));

		// Equals -Comparing two Strings

		String s3 = "Welcome";
		String s4 = "welcome";

		System.out.println(s3.equals(s4)); // false

		System.out.println(s3.equalsIgnoreCase(s4)); // true

		// contains

		System.out.println(s3.contains("come")); // true

		System.out.println(s3.contains("abc")); // false

		// substring

		String s5 = "LEARNING";

		System.out.println(s5.substring(0, 4));// LEAR
		System.out.println(s5.substring(5, 8));// ING
		System.out.println(s5.substring(3, 6));// RNI
 
		// Replace

		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come", "meoc"));

	}

}
