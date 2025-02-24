package oops.abstraction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterafces {

	public static void main(String[] args) {
//		Function
//		BiFunction
//		Predicate
//		Consumer
//		Supplier

		System.out.println("----------------------------Function---------------------");

		Function<Integer, String> fun1 = new Function<Integer, String>() {
			@Override
			public String apply(Integer value) {
				return value + " times";
			}
		};
		System.out.println(fun1.apply(100));

		Function<Integer, String> fun2 = (value) -> value + " times";
		System.out.println(fun2.apply(200));

		System.out.println("-----------------------BiFunction------------------");
		BiFunction<Integer, Integer, Integer> biFun1 = new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer val1, Integer val2) {
				return val1 + val2;
			}
		};
		System.out.println(biFun1.apply(100, 200));

		BiFunction<Integer, Integer, Integer> biFun2 = (val1, val2) -> val1 + val2;
		System.out.println(biFun2.apply(1000, 2000));
		
		System.out.println("---------------------------Predicate-------------------");
		Predicate<Integer> predic1 = new Predicate<Integer>() {			
			@Override
			public boolean test(Integer val1) {				
				return val1 > 100;
			}
		};		
		System.out.println(predic1.test(99));
		System.out.println(predic1.test(101));
		
		Predicate<String> predic2 = (val1)-> val1.equalsIgnoreCase("Hello");
		System.out.println(predic2.test("Java"));
		System.out.println(predic2.test("hello"));
		
		System.out.println("---------------------------Consumer-------------------");
		
		Consumer<Integer> consum1 = new Consumer<Integer>() {			
			@Override
			public void accept(Integer val1) {
				System.out.println(val1);
			}
		};		
		consum1.accept(1000);
		
		Consumer<String> consum2 = (val1)->System.out.println(val1);
		consum2.accept("Hello Java");
		
		System.out.println("----------------------Supplier-----------------------");
		Supplier<String> supp1 = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello World";
			}
		};		
		System.out.println(supp1.get());
		
		Supplier<Integer> supp2 = () -> 10000;
		System.out.println(supp2.get());
		
		System.out.println("---------------------------BinaryOperator---------------------");
		BinaryOperator<Integer> binary1 = new BinaryOperator<Integer>() {			
			@Override
			public Integer apply(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		BinaryOperator<Integer> binary2 = (a,b)->a+b;
 
	}

}
