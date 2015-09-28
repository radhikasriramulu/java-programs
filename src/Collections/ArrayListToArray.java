/**
 * Write a program to copy arraylist to an array.
 */
package Collections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("radhika");
		list.add("guru");
		
		
		String[] arrayStr = new String[list.size()];
		int i = 0;
		for(String str: list) {
			arrayStr[i] = str;
			i++;
		}
		
		//Test the array
		for(int j=0;j<arrayStr.length;j++) {
			System.out.println(arrayStr[j]);
		}
		
	}

}
