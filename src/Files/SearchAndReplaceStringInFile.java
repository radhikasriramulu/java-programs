/**
 * 1. Read the file line by line
 * 2. replace  with new string and print
 */
package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchAndReplaceStringInFile {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File file = new File("c:\\Training\\hello.txt");
		
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String nextLine = scan.nextLine();
			String replace = nextLine.replace("gururaj", "GG");
			System.out.println(replace);
		}
	}

}
