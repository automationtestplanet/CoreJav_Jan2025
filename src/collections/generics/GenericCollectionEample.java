package collections.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollectionEample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		//		arrayList.add(true);
		arrayList.add(100);
//		arrayList.add('A');
//		arrayList.add(10.5);
//		arrayList.add("Hello");

		System.out.println(arrayList.get(1));
//		int int1 = (int) arrayList.get(1);
		int int1 = arrayList.get(1);
		System.out.println(int1);

//		System.out.println(arrayList.get(4));
//		int int2 = (int) arrayList.get(4);  // ClassCastException

		Set<String> hashSet = new HashSet<String>();
//		hashSet.add(true);
//		hashSet.add(100);
//		hashSet.add('A');
//		hashSet.add(10.5);
		hashSet.add("Hello");

		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("FirstName", "Raj");
		hashMap.put("Qualification", "MCA");
		hashMap.put(null, "SR Nagar");
		hashMap.put("Organization", null);
//		hashMap.put("Age", 30);

		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet(); // Entry is child interface of Map interface
		
		for (Map.Entry<String, String> eachEntry : entrySet) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

	}

}
