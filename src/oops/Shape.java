/*
 * Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
 * and methods(calculateArea,calculatePerimeter,setSides).
 * 1. We can't instantiate the abstract class
 * 2. we could define method with abstract keyword.
 * 
 */
package oops;

public abstract class Shape {
	
	public int noOfSides;
	public int area;
	public int perimeter;

	public  abstract void setSides();
	
	public abstract void calculateArea();

	public abstract void calculatePerimeter();

}
