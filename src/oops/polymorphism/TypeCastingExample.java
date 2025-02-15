package oops.polymorphism;

public class TypeCastingExample {

	public static void main(String[] args) {

		byte byte1 = 100;
		OverridingExample overridingEx = new OverridingExample();		
		
		int int1 = byte1;  // Implicit Conversion		
		OverloadingExample overloadEx = overridingEx;  // up-casting
		
		byte1 = (byte)int1;  // Explicit Conversion
		overridingEx = (OverridingExample)overloadEx;   // down-casting
		
		
		System.out.println("---------------------Child Class methods Output---------------");
		OverridingExample overridingEx2 = new OverridingExample();			
		System.out.println(overridingEx2.multiplication(10, 20));
		System.out.println(overridingEx2.division(10, 3));
		System.out.println(overridingEx2.addition(10, 20));
		
		System.out.println(OverridingExample.addition("Hello", "Java"));
		
		
		System.out.println("---------------------Parent Class methods Output---------------");
		OverloadingExample overloadEx2 =  overridingEx2;
		System.out.println(overloadEx2.multiplication(10, 20)); // we can access only parent class methods
//		System.out.println(overloadEx2.division(10, 3));  // we can not access child class methods
		System.out.println(overloadEx2.addition(10, 20));   // overloading
		System.out.println(overloadEx2.addition("Hello", "Java"));

	}

}
