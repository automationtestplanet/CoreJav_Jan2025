package demo;

import calculator.Calculator;
import calculator.UseCalculator;

public class ArithematicOperations {

	public static void main(String[] args) {
		Calculator calc = new UseCalculator();
		System.out.println(calc.mulplication(10, 20));
	}

}
