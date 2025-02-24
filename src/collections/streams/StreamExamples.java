package collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		for(int eachVal :list1)
			System.out.println(eachVal);
		
		list1.forEach((val1)->System.out.println(val1));
		list1.forEach(System.out::println);
		
		System.out.println("---------------------Filter------------------------------------");
		// map, filter, reduce
		
		list1.stream().filter(val1-> val1%2!=0).forEach(System.out::println);
		List<Integer> newList = list1.stream().filter(val1-> val1%2!=0).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println("---------------------Map------------------------------------");
		List<Integer> mapList =  list1.stream().map((value) -> value * 5).collect(Collectors.toList());
		System.out.println(mapList);
		
		System.out.println("---------------------Reduce------------------------------------");
		int sum = list1.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}

}
