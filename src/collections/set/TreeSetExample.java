package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set treeSet = new TreeSet();

		treeSet.add(30);
//		treeSet.add("Hello");
//		treeSet.add(10.5);
		treeSet.add(50);
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(20);

		System.out.println(treeSet);

		Set treeSet2 = new TreeSet();
		treeSet2.add('E');
		treeSet2.add('A');
		treeSet2.add('C');
		treeSet2.add('D');
		treeSet2.add('B');

		System.out.println(treeSet2);

		Set treeSet3 = new TreeSet();

		treeSet3.add("Banana");
		treeSet3.add("Dragon");
		treeSet3.add("Apple");
		treeSet3.add("Cherry");

		System.out.println(treeSet3);

	}

}
