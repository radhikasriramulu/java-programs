/**
 * Merge two arrays
 */
package arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int first[] = { 11, 66, 3, 4 };
		int second[] = { 27, 18, 9, 122, 66 };

		int mergeResult[] = merge(first, second);

		for (int i = 0; i < first.length + second.length; i++) {
			System.out.println(mergeResult[i]);
		}
			
	}

	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			answer[k] = a[i];
			k++;
		}
		for (int j = 0; j < b.length; j++) {
			answer[k] = b[j];
			k++;
		}
		return answer;

	}

}
