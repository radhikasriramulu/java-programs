/**
 * a string like "This is nice" and converts it to a string like "This1 is2 nice3".
 */
package Strings;

public class WordModifier {

	public static void main(String args[]) {
		String name = "This is nice";
		String[] split = name.split(" ");
		String name2="";
		int count = 1;
		for(int i=0;i<split.length;i++) {
			name2 = name2+ split[i]+count +" ";
			count++;
		}
		System.out.println(name2);
	}
	
	
	
}
