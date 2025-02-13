package access.modifiers;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.addition(100, 200)); // public can access across all the classes with in the package

		System.out.println(calc.subtraction(100, 200)); // default can access across all the classes with in the package

		System.out.println(calc.mulplication(100, 200)); // protected can access across all the classes with in the package
		
//		System.out.println(calc.division(100, 200));  // private method can be access with in the class only 

	}

}
