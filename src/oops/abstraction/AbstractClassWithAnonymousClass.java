package oops.abstraction;

abstract public class AbstractClassWithAnonymousClass {

	abstract void addition(int a, int b);

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		
		AbstractClassWithAnonymousClass absCls = new AbstractClassWithAnonymousClass() {
			@Override
			void addition(int a, int b) {
				System.out.println(a+b);
			}			
		};
		
		absCls.addition(100, 200);		
		absCls.multiplication(10, 3);
	}

}
