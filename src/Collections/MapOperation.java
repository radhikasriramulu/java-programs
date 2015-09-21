/*
 packaWrite a program having below methods.
+  			--> To create a hashmap.
+  			--> To search for a key in the created map and then returns its value.;

 */
package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create hashMap
		Map aMap = new HashMap();
		aMap.put("firstName", "Radhika");
		aMap.put("lastName", "Sriramulu");
		
		//Search the key with return the value
		System.out.println(aMap.get("firstName"));
	}

}
