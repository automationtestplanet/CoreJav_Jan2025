package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(true);
		linkedHashSet.add(10);
		linkedHashSet.add(100);
		linkedHashSet.add('A');
		linkedHashSet.add(1000);
		linkedHashSet.add(10.5);
		linkedHashSet.add(10000L);
		linkedHashSet.add(10.453E45D);
		linkedHashSet.add("Hello");

		System.out.println(linkedHashSet);

//		hashSet.get(0);  // no get(index) available

		linkedHashSet.add(1000);
		System.out.println(linkedHashSet);

		for (Object eachObject : linkedHashSet) {
			System.out.println(eachObject);
		}
	}

}
