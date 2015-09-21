package Loops;
/**
 * Swaps 2 given numbers
 * 
 * @author Radhika
 *
 */

public class SwapTwoNumbers {

	public SwapTwoNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.withoutVariable();
		swap.withNewVariable(5, 6);

	}

	/**
	 * swap the numbers without any third new variable
	 */
	public void withoutVariable() {
		int a = 5;
		int b = 6;
		System.out.println(" Before Swap the value of a is : " + a);
		System.out.println(" Before Swap the value of b is : " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" After Swap the value of a is : " + a);
		System.out.println(" After Swap the value of b is : " + b);
	}

	/**
	 * swap the numbers using a third variable
	 * 
	 * @param first
	 * @param second
	 */
	public void withNewVariable(int first, int second) {
		int a, b, c;
		a = first;
		b = second;
		System.out.println("Before swaping\na=" + a + "\nb=" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swaping\na=" + a + "\nb=" + b);
	}

}
