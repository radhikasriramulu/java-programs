package Loops;
/**
 * 
 * @author Radhilka
 * 
 *         first we need to innitialize i and j we need to set the maximum
 *         number then we need to use second loop
 *
 */

public class PrintStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
