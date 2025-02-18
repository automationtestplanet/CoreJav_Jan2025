package oops.abstraction;

public interface Interface1 extends Interface3{

	public static final int a = 100; // by default all the global variables inside the interface are public static
	// and final

	int addition(int a, int b);
	

	public static void main(String[] args) {
		System.out.println(a); // static
		System.out.println(Interface1.a);

//		a = 200;  // final variable you can not change
	}

}
