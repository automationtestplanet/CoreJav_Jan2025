package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

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
		arrayList.add(new ArrayListExample());
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(0));
		
		boolean bool1 = (boolean)arrayList.get(0);
		
		arrayList.add("Hello");
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains(10.5));
		
		System.out.println(arrayList.remove("Hello"));
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
	}

}
