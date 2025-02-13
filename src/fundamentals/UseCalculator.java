package fundamentals;

import access.modifiers.Calculator;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.addition(100, 200)); // public can be accessed across all the packages

//		System.out.println(calc.subtraction(100, 200)); // default method can not be access outside the package

//		System.out.println(calc.mulplication(100, 200)); // protected method can not be access outside the package but
															// it can be accessed when inheriting it

//		System.out.println(calc.division(100, 200));  // private method can be access with in the class only

	}

}
