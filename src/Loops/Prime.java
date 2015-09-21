package Loops;
/**
 * 
 * Prime number is whole number which is divisible by 1 and itself.
 * 
 * @author Radhika
 *
 */
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 19;
		boolean primeNumber = isPrimeNumber(i);
		if (primeNumber) {
			System.out.println("The Number " + i + " is a prime number");
		} else {
			System.out.println("The Number " + i + " is not a prime number");
		}

	}

	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
