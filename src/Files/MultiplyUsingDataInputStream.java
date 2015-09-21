package Files;

import java.io.DataInputStream;
import java.io.IOException;

public class MultiplyUsingDataInputStream {
	public static void main(String args[]) throws IOException {
		DataInputStream dataInputStream = new DataInputStream(System.in);
		String firstNum = dataInputStream.readLine();
		System.out.println("FirstNum" +firstNum);
		String secondNum = dataInputStream.readLine();
		System.out.println("secondNum" +secondNum);
		System.out.println("After multiplication" + (Integer.parseInt(firstNum)*Integer.parseInt(secondNum)));
	}
}
