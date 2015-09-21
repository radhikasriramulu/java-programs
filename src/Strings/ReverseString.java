/**
 * Using CharAt method, parse the string in reverse order.
 */
package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Radhika";
		String reverse = "";
		for (int i = name.length()-1; i > -1; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}

}
