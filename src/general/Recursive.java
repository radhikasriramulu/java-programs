/**
 * Write a program to print 1 to 10 numbers without using loops and 
 * you should not have more than 1 print statement.
 */
package general;

public class Recursive {
	int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive recursive = new Recursive();
		recursive.print();

	}
	
	private void print() {
		if(i<=10) {
			System.out.println(" Hello " +i);
			i++;
			print();
		}
	}

}
