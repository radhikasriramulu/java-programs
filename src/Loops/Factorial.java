package Loops;
/**
 * The product of an integer and all the integers below it; e.g., factorial four
 * ( 4! ) is equal to 24.
 * 
 * @author Radhika
 *
 */
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		Factorial factorial = new Factorial();

		int fact = factorial.withoutRecursion(number);
		System.out.println("Factorial of " + number + " is " + fact);

		int factWithRecursion = factorial.fact(number);
		System.out.println("Factorial of " + number + " is " + factWithRecursion);
	}

	public int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}

	
	public int withoutRecursion(int number) {
		int fact = 1;
		for (int i = 2; i <= number; i++) {
			fact = fact * i;
			;
		}
		return fact;
	}

}
