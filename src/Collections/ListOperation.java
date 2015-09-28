/*
 * a. Write a program having different methods to perform below operations.
 *  			--> To create an arraylist and add elements to it.
 *  			--> To search for an element in the list.
 *  			--> To print the elements of the list using iterator.
 *  			--> To print the elements in the reverse order using ListIterator.
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOperation {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
		List aList = new ArrayList();
		aList.add("Hello");
		aList.add("World");

		// Search
		boolean contains = aList.contains("Hello");
		System.out.println(contains);

		// Iterator
		Iterator iterator = aList.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(element);

		}

		// Reverse Order using ListIterator
		ListIterator listIterator = aList.listIterator();
		while (listIterator.hasNext()) {
			String element = (String) listIterator.next();
			System.out.println(element);
		}

	}

}
