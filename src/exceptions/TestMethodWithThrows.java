package exceptions;

public class TestMethodWithThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethodWithThrows test = null;
//		= new TestMethodWithThrows();
		try {
			test.callPrint(test);
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerTest is null, you can't access the object or call method.");
		}
		finally {
			System.out.println("Hi I am finally");
		}
		

	}
	
	
	public void callPrint(TestMethodWithThrows test) throws NullPointerException{
		test.print();
	}
	public void print() {
	
		System.out.println("Hello World");
	}

	
	
}
