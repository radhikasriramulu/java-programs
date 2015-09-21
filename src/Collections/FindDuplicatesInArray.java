/**
 * Write a program to find duplicates in an array using set.
 */
package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,5,3,4,1,5,7,8,1,8};
		Set set = new HashSet();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
