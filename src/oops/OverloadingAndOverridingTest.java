/**
 Write a program to depict the behavior of method overloading and overriding.
 */
package oops;

public class OverloadingAndOverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower = new Flower();
		flower.color();

		flower = new Jasmine();
		flower.color();
		
		//Overloading test
		Jasmine jasmine = new Jasmine();
		jasmine.smell();
		jasmine.smell("Fragrants");
	}

}
