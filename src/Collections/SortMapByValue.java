/*
 Write a program to sort a map by value.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map aMap = new TreeMap();
		aMap.put("firstName", "Radhika");
		aMap.put("lastName", "Sriramulu");

		// //Get all values only
		Collection values = aMap.values();
		ArrayList list = new ArrayList(values);
		Collections.sort(list);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
