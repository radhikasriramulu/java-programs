/**
 * 1. Read the file line by line
 * 2. create the file for copy file.
 * 3. Create filewriter and write the step1.
 */
package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		File file = new File("c:\\Training\\hello.txt");
		File copyFile = new File("c:\\Training\\hello1.txt");
		FileWriter fileWriter = new FileWriter(copyFile);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			writer.write(line);
			writer.newLine();
		}
		writer.close();
		fileWriter.close();
	}

}
