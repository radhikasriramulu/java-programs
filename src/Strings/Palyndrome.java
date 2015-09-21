/**
 * 1. Read the string
 * 2. Reverse the String
 * 3. Compare with equals or equalsIgoreCase method. if equals then true otherwise false.
 */
package Strings;

public class Palyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String reverse = "";
		for (int i = name.length()-1; i > -1; i--) {
			reverse = reverse + name.charAt(i);
		}
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println(""+name+ " is the polyndrome");
		}
		else  {
			System.out.println(""+name+ " is not the polyndrome");
		}
	}

}
