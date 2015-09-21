package Loops;
/**
 * Armstrong number is a9 number which is equal to sum of digits raise to the
 * power total number of digits in the number. 
 * 1. Get the input as an number
 * 2. Check the number of digit on the given number
 * 3. find the power of each number 
 * 4. Add the step3 
 * 5. Repeat the step3 and 4 for all digits
 * 6. check the sum is equal to step1.
 * 
 * @author Radhika
 *
 */
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 371;
		boolean result = isArmStrong(num);
		if(result) {
			System.out.println("The Give number "+ num + " is ArmStrong");
		}
		else {
			System.out.println("The Give number "+ num + "is not ArmStrong");
		}
		
	}

	public static boolean isArmStrong(int num) {
		int temp = 0;
		int sum = 0;
		int digit = 0;
		int reminder = 0;
		// identify the number digit
		temp = num;
		while(temp !=0) {
			digit++;
			temp = temp/10;
		}
		
		// find the sum of the power of digit
		temp = num;
		while(temp !=0) {
			reminder = temp%10;
			sum = sum + power(reminder,digit);
			temp = temp/10;
		}
		
		// check is armstrong
		if(num == sum) {
			return true;
		}

		return false;
	}

	private static int power(int reminder, int digit) {
		// TODO Auto-generated method stub
		int result = 1;
		for(int i = 1;i<= digit;i++) {
			result = result*reminder;
		}
	
		return result;
	}

}
