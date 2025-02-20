package oops.abstraction;

public class FunctionalInterfaces {

	public static void main(String[] args) {

		FunctionalInterface1 fun1 = (str) -> {
			System.out.println(str);
		};
		fun1.display("Hello");

		FunctionalInterface1 fun1_1 = str -> {
			System.out.println(str);
		};
		fun1_1.display("Java");

		FunctionalInterface1 fun1_2 = str -> System.out.println(str);
		fun1_2.display("World");

		FunctionalInterface2 fun2 = (a, b) -> {
			return a + b;
		};
		System.out.println(fun2.addition(100, 200));

		FunctionalInterface2 fun2_1 = (a, b) -> a + b;
		System.out.println(fun2_1.addition(1000, 2000));

		FunctionalInterface3 fun3 = a -> a;
		System.out.println(fun3.display("Hello this is Java"));

	}

}
