package fundamentals;

public class TypesOfVariables {

	static int a = 100; // Global variables
	static int b = 200; // Global variables

	int c = 300;
	int d = 400;

	static int e;
	
//	int a = 300;  // duplicate variable name with in Global variables we can not write

	public static void addition() {
		int a = 100; // local variables
		int b = 200; // local variables
		System.out.println("Addition: " + (a + b));
		int c;
		
//		int a = 300;  // duplicate variable name with in local variables we can not write

//		System.out.println(c);  // before using the local variable,it must be initialized

		System.out.println(e); // no need to initialize the value for global variables, by default it contains
								// default value.
	}
	
	static void addition(int f, int g) {
//		int a = 100; // parameters also considered as local variables only, we can write duplicate names for local variables.
//		int b = 200; // parameters also considered as local variables only, we can write duplicate names for local variables.
		System.out.println(f);
		System.out.println(g);
	}
	

	public static void subtraction() {
		System.out.println("Subtraction: " + (a - b));
		
//		System.out.println(f);   // parameters also local variables can not access out side the method
//		System.out.println(g);  // parameters also local variables can not access out side the method
	}

	public static void multiplication() {		
		int a = 1000; // local variables
		int b = 2000; // local variables
		System.out.println("Multiplication: " + (a * b));
	}
	
	public static void multiplication(int a, int b) {		
		System.out.println("Multiplication: " + (a * b));
	}

	public void division() {
		System.out.println("Division: " + (a / b));
	}

	public static void modularDivision() {
//		System.out.println("Modular Division: " + (c % d));  // non-statc variables
	}

	public static void main(String[] args) {
		multiplication();
		
		multiplication(10,20);
		System.out.println(a);
		System.out.println(b);
		
		
//		division();  //non-static method, memory will be allocated by JVM, we can not access
//		System.out.println(c); //non-static variable, memory will be allocated by JVM, we can not access
//		System.out.println(d); //non-static variable, memory will be allocated by JVM, we can not access
	}

}
