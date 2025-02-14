package oops.inheritance;

public class UseCalculator {

	public static void main(String[] args) {
		NewCalculator newCalc = new NewCalculator();

		System.out.println(newCalc.addition(100, 200));

		System.out.println(newCalc.subtraction(100, 200));

		System.out.println(newCalc.mulplication(100, 200)); 
		
		System.out.println(newCalc.division(100, 200)); 
		
		System.out.println(newCalc.modDivision(100, 200)); 
		
		Calculator calc = new Calculator();
//		System.out.println(calc.modDivision(100, 200));   // can not access child class methods with parent class reference/object
		

		
		byte b = 100;
		
		short s = b;
		
		int i = b;
		
		long l = b;
		
		float f = b;
		
		double d = b;
		
		
		NewCalculator newCalc1 = new NewCalculator();
		
		Calculator calc1  = newCalc1;   // Type Casting
		
		Calculator calc2  = new NewCalculator();
		
	
	}

}
