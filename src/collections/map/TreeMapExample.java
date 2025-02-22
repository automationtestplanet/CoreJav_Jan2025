package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map treeMap = new TreeMap();

		treeMap.put("FirstName", "Raj");
		treeMap.put("LastName", "C");
		treeMap.put("Qualification", "MCA");
		treeMap.put("City", "Hyderabad");
//		treeMap.put(null, "SR Nagar");  // NullPointer exception
		treeMap.put("Organization", null);

		System.out.println(treeMap.get("FirstName"));

		System.out.println(treeMap.get("firstname"));

		System.out.println(treeMap); // each (k,v) pair is called Entry

		Set allEntries = treeMap.entrySet(); // for each Entry , type is Entry

		for (Object eachEntry : allEntries) {
			System.out.println(eachEntry);
		}

	}

}
