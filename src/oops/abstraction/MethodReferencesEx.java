package oops.abstraction;

public class MethodReferencesEx {

	void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println(a - b);
	};

	public static void main(String[] args) {

//		FunctionalInterface4 fun4 = (a,b)->System.out.println(a*b);
//		fun4.multiplication(10, 20);

		// static reference
		FunctionalInterface4 fun4_1 = MethodReferencesEx::subtraction;
		fun4_1.multiplication(10, 20);

		// instance reference
		MethodReferencesEx methodRef = new MethodReferencesEx();
		FunctionalInterface4 fun4_2 = methodRef::addition;
		fun4_2.multiplication(10, 20);

	}

}
