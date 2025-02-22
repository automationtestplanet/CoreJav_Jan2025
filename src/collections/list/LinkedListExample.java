package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List linkedList = new LinkedList();
		linkedList.add(true);
		linkedList.add(10);
		linkedList.add(100);
		linkedList.add('A');
		linkedList.add(1000);
		linkedList.add(10.5);
		linkedList.add(10000L);
		linkedList.add(10.453E45D);
		linkedList.add("Hello");
		linkedList.add(new ArrayListExample());

		System.out.println(linkedList);
		System.out.println(linkedList.size());
		System.out.println(linkedList.get(0));

		boolean bool1 = (boolean) linkedList.get(0);

		linkedList.add("Hello");
		System.out.println(linkedList);

		System.out.println(linkedList.contains(10.5));

		System.out.println(linkedList.remove("Hello"));
		System.out.println(linkedList);

		linkedList.clear();
		System.out.println(linkedList);
		System.out.println(linkedList.isEmpty());

		List linkedList2 = new LinkedList();
		linkedList2.add(14);
		linkedList2.add(11);
		linkedList2.add(15);
		linkedList2.add(13);
		linkedList2.add(10);
		linkedList2.add(12);
		
		System.out.println(linkedList2);
		Collections.sort(linkedList2);
		System.out.println(linkedList2);
		
		for(Object eachObj:linkedList2) {
			System.out.println(eachObj);
		}

	}

}
