package arrays;
/**
 * largest number in a given array
 * 
 * 1. Assign first element from array into a variable.
 * 2. compare step1 variable with next element of an array. if the element is greater than the step1 
 * then assign the element into that variable. otherwise igore.
 * 3. repeat 2 until the length of array/
 * 4. finally, the variable value is the largest.
 * 
 * @author Radhika
 *
 */

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] a = { 10, -4, 45, 12 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum number is :" + max);
	}

}
