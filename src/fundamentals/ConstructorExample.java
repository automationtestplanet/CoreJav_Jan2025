package fundamentals;

public class ConstructorExample {

	static int a = 100; // Global variables
	static int b = 200; // Global variables

	int c = 300;
	int d = 400;
	
	static int e;
	int f;

	public static void addition() {
		int a = 100; // local variables
		int b = 200; // local variables
		System.out.println("Addition: " + (a + b));
		int c; 
//		System.out.println(c);  // there are no default value for local variables, must initialize before using it.
	}
	
	public static void subtraction() {
		System.out.println("Subtraction: " + (a - b));
	}

	public void division() {
		System.out.println("Division: " + (a / b));
	}

	public ConstructorExample() {

	}
	
	public static void main(String[] args) {
		
		subtraction();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("e: "+e);
		
		ConstructorExample cons = new ConstructorExample(); // creation of instance of a class or object
		ConstructorExample cons1 = new ConstructorExample();
		ConstructorExample cons3 = new ConstructorExample();
		
		cons.division();  //non-static method, memory will be allocated by JVM, we can not access
		System.out.println("c: "+cons.c); //non-static variable, memory will be allocated by JVM, we can not access
		System.out.println("d: "+cons.d); //non-static variable, memory will be allocated by JVM, we can not access
		System.out.println("f: "+cons.f);
		System.out.println("a: "+ cons.a);
	}

}
