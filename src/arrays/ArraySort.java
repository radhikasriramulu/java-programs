/**
 * Sort the array in ascending order.
 * 
 */
package arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 15, 12, 77, 8, 4 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// Print
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}

	}
}
