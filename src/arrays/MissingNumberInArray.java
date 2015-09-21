package arrays;
/**
 * Missing number in an Array
 * 
 * @author Radhika
 *
 */
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 3, 6, 5, 4, 7, 1, 2 };
		int length = arr.length;
		int result = arr.length + 1;

		for (int i = 0; i < length; i++) {
			result = result + i + 1 - arr[i];
		}

		System.out.println("Missing number is: " + result);
	}

}
