package Files;

import java.io.IOException;
import java.util.Scanner;

public class AddUsingScanner {

	public static void main(String args[]) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Numbers ");
		int firstNum = s.nextInt();
		int secondNum = s.nextInt();
		System.out.println("Sum of two numbers : "+ (firstNum + secondNum));

		
	}
}
