package arrays;
/**
 * 1. Compare each element of first array with every element of second array.
 * 2. Repeat step1 until first array's length
 * @author Radhi
 *
 */
public class CommonNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method s
	        int[] arr1 = {4,7,3,9,2};
	        int[] arr2 = {3,2,12,9,40,32,4};
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                    System.out.println(arr1[i]);
	                }
	            }
	        }
	}

}

