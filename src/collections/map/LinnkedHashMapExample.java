package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinnkedHashMapExample {

	public static void main(String[] args) {

		Map linkedHashMap = new LinkedHashMap();
		
		linkedHashMap.put("FirstName", "Raj");
		linkedHashMap.put("LastName", "C");
		linkedHashMap.put("Qualification", "MCA");
		linkedHashMap.put("City", "Hyderabad");
		linkedHashMap.put(null, "SR Nagar");
		linkedHashMap.put("Organization", null);
		
		System.out.println(linkedHashMap.get("FirstName"));
		
		System.out.println(linkedHashMap.get("firstname"));
		
		System.out.println(linkedHashMap);  // each (k,v) pair is called Entry
		
		 Set allEntries = linkedHashMap.entrySet();  // for each Entry , type is Entry
		 
		 for(Object eachEntry :allEntries) {
			 System.out.println(eachEntry);
		 }

	}

}
