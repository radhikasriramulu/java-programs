
/**
 * 1. Read the file
 * 2. Pass the file to file reader
 * 3. Pass the fileReader to Buffered Reader for line by line reading
 * 4. split the each line by words using space. 
 * 5. find the number of words in step4 and add to the counter
 * 6. repeat 4 and 5 until end of file.
 * 
 */
package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCounts {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		File file = new File("c:\\Training\\hello.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line = bufferReader.readLine();
		int wordCount = 0;
		while(line !=null) {
			String[] words = line.split(" ");
			wordCount = wordCount + words.length;
			line =  bufferReader.readLine();
		}
		System.out.println("No of words in the file is :" + wordCount);

	}

}
