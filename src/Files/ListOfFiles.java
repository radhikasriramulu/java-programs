/**
 * 1. Create the file object with directory
 * 2. Get the list of files using list method.
 * 3. Print the each file name from step2.
 */
package Files;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C://Training");
		String[] list = file.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}

	}

}
