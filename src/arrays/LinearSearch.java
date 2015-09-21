/**
 * 1. Define array with set of numbers
 * 2. Get the number to be searched from the array.
 * 3. Loop thru the array sequentially. check given number is equal to the element of an array
 * 4. if true, print the position of the element in an array.
 * 
 */
package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10,20,30,45,11,88,77};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=0;i<a.length-1;i++) {
			if(a[i] == number) {
				System.out.println(" the linear searched number " + number + " is at the position "+ i+1);		
			}
		}
	}

}
