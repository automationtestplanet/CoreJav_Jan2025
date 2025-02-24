package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add(true);
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add('A');
		arrayList.add(1000);
		arrayList.add(10.5);
		arrayList.add(10000L);
		arrayList.add(10.453E45D);
		arrayList.add("Hello");
		
		System.out.println(arrayList.get(0));
		
		for(Object eachObject : arrayList) {
			System.out.print(eachObject+" ");
		}
		
		System.out.println();
		
		Iterator itr= arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		
		
		 ListIterator listItr = arrayList.listIterator();
		 
		 System.out.println(listItr.next());
		 System.out.println(listItr.next());
		 System.out.println(listItr.previous());
		 System.out.println(listItr.previous());

	}

}
