package oops.abstraction;

public interface InterfaceExample {

	public static final int a = 100;

	public abstract int addition(int a, int b);

	public static int subtraction(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		System.out.println(subtraction(10,3));
		System.out.println(a);
	}
	
	public default int multiplication(int a, int b) { 
		return a*b;
	}

	
//	private default int division(int a, int b) {  //  private defaut methods we can not create
//		return a*b;
//	}

}
