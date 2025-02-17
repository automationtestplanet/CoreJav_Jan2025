package fundamentals;

import oops.abstraction.Calculator;
import oops.abstraction.UseCalculator;
//import oops.abstraction.CalculatorImplementation;

public class UseCalculatorInterface {

	public static void main(String[] args) {
//		Calculator calc = new Calculator(); // we can not create the object of any interface
		
		Calculator useCalc = new UseCalculator();
		
		System.out.println(useCalc.addition(10, 20));

	}

}
