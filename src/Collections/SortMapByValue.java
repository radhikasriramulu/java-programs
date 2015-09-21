/*
 Write a program to sort a map by value.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map aMap = new TreeMap();
		aMap.put("firstName", "Radhika");
		aMap.put("lastName", "Griramulu");
		
//		Set<Entry<String, String>> set = aMap.entrySet();
//		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(set);
//		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//			public int compare(Map.Entry<String, String> o1,
//					Map.Entry<String, String> o2) {
//				return (o1.getValue()).compareTo(o2.getValue());
//			}
//		});
//		for (Map.Entry<String, String> entry : list) {
//			System.out.println(entry.getKey() + " ==== " + entry.getValue());
//		}
		
	
		
		// //Get all values only
		 Collection values = aMap.values();
		
		// // By default treeset is sorted
		 TreeSet set1 = new TreeSet();
		 set1.addAll(values);
		 Iterator iterator = set1.iterator();
		 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
		 }
	}

}
