package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractUsingBufferedReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers with space :");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(inputStreamReader);
		String readLine = bf.readLine();
		String[] split = readLine.split(" ");
		
		int firstNum = Integer.parseInt(split[0]);
		int secondNum = Integer.parseInt(split[1]);
		System.out.println("After substraction :" + (firstNum - secondNum));
	}

}
