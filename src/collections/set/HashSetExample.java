package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collections.list.ArrayListExample;

public class HashSetExample {

	public static void main(String[] args) {
		Set hashSet = new HashSet();

		hashSet.add(true);
		hashSet.add(10);
		hashSet.add(100);
		hashSet.add('A');
		hashSet.add(1000);
		hashSet.add(10.5);
		hashSet.add(10000L);
		hashSet.add(10.453E45D);
		hashSet.add("Hello");

		System.out.println(hashSet);

//		hashSet.get(0);  // no get(index) available

		hashSet.add(1000);
		System.out.println(hashSet);

		for (Object eachObject : hashSet) {
			System.out.println(eachObject);
		}

	}

}
