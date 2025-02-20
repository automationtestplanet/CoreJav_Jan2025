package oops.abstraction;

public class UseFunctionalInterface { // implements FunctionalInterfaceExample {

//	@Override
//	public void addition(int a, int b) {
//		System.out.println("this is UseFunctionalInterface addition method: "+(a+b));
//
//	}

	public static void main(String[] args) {

//		FunctionalInterfaceExample funEx = new UseFunctionalInterface();
//		funEx.addition(100, 200);
		
//		FunctionalInterfaceExample funEx2 = new FunctionalInterfaceExample() {
//			@Override
//			public void addition(int a, int b) {
//				System.out.println("This is anonymous class addition methods: "+(a+b));		
//			}
//		};
//		
//		funEx2.addition(100, 200);
		
		FunctionalInterfaceExample funex3 = (a,b)->{System.out.println("This is lambda expression addition method: "+(a+b));};   // lambda expression
		funex3.addition(100, 200);
		
	}

}
