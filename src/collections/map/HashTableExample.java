package collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Map hashTable = new Hashtable();

		hashTable.put("FirstName", "Raj");
		hashTable.put("LastName", "C");
		hashTable.put("Qualification", "MCA");
		hashTable.put("City", "Hyderabad");
//		hashTable.put(null, "SR Nagar");// NullPointerException
//		hashTable.put("Organization", null);  // NullPointerException

		System.out.println(hashTable.get("FirstName"));

		System.out.println(hashTable.get("firstname"));

		System.out.println(hashTable); // each (k,v) pair is called Entry

		Set allEntries = hashTable.entrySet(); // for each Entry , type is Entry

		for (Object eachEntry : allEntries) {
			System.out.println(eachEntry);
		}

	}

}
