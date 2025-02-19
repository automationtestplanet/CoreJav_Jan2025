package oops.abstraction;

public class InterfaceExamplementation implements InterfaceExample {


	@Override
	public int addition(int a, int b) {
		
		return a+b;
	}
	
	@Override
	public int multiplication(int a, int b) {
		return a*b*5;
	}
	
	public static void main(String[] args) {
		System.out.println(InterfaceExample.subtraction(10, 3));
		System.out.println(a);
		
		InterfaceExample infEx = new InterfaceExamplementation();
		System.out.println(infEx.multiplication(10, 3));
		System.out.println(infEx.addition(10, 3));
		

	}

}
