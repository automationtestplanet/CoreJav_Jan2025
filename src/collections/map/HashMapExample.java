package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map hashMap = new HashMap();
		
		hashMap.put("FirstName", "Raj");
		hashMap.put("LastName", "C");
		hashMap.put("Qualification", "MCA");
		hashMap.put("City", "Hyderabad");
		hashMap.put(null, "SR Nagar");
		hashMap.put("Organization", null);
		
		System.out.println(hashMap.get("FirstName"));
		
		System.out.println(hashMap.get("firstname"));
		
		System.out.println(hashMap);  // each (k,v) pair is called Entry
		
		 Set allEntries = hashMap.entrySet();  // for each Entry , type is Entry
		 
		 for(Object eachEntry :allEntries) {
			 System.out.println(eachEntry);
		 }

	}

}


