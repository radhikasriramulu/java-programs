package oops;

public class Jasmine extends Flower {
	public void color() {
		System.out.println("White");
	}
	
	public void smell() {
		System.out.println ("Pleasant");
	}
	
	public void smell(String perfume) {
		smell();
		System.out.print(" with " + perfume);
	}
}
