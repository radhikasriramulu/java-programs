/*
 * Write a program that is expected to throw a null pointer exception 
 * and in turn handles it using try catch and finally.
 */
package exceptions;

public class NullPointerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerTest test = null;
//		new NullPointerTest();
		try {
			test.print();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerTest is null, you can't access the object or call method.");
		}
		finally {
			System.out.println("Hi I am finally");
		}
		

	}
	
	public void print() {
		System.out.println("Hello World");
	}

}
