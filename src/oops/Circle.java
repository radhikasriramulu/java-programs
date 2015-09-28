/**
  Write a program that creates a class Circle extending Shape abstract class and
  implementing ShapeConstants interface and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents
 */
package oops;

public class Circle extends Shape implements ShapeConstants{
	public int radius;
	
	public Circle(int numberOfSides) {
		super.noOfSides = numberOfSides;
	}

	@Override
	public void setSides() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
		
	}
	
	// overloading
	public void calculateArea(int radius) {
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

}
