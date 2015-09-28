/**
 * Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn 
 * and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortedSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		int n = 10;
		for(int i=1;i<10;i++) {
			list.add("a"+i);
		}
		for(int i=1;i<10;i++) {
			list.add("b"+i);
		}
		
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String o1,String o2) {
//				return (o1.getValue()).compareTo(o2.getValue());
//			}
//		});
	

		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
