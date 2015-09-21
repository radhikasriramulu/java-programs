/**
 * 1. Read the file
 * 2. Read line by line using buffered reader
 * 3. Check the searching word contains or not.
 * 4. if contains, split word by word and compare with search word.if equals, add the counter.
 * 5. repeat 2 to 4 until line is null.
 * 6. print the counter.
 */
package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringCount {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		File file = new File("c:\\Training\\hello.txt");
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line = bufferReader.readLine();
		int wordCount = 0;
		String searchWord = "radhika";
		while (line != null) {
			if (line.contains(searchWord)) {
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					String newWord = words[i];
					if (searchWord.equalsIgnoreCase(newWord)) {
						wordCount = wordCount + 1;
					}
				}

			}
			line = bufferReader.readLine();
		}
		System.out.println("No of times in the file is :" + wordCount);
	}

}
