package exceptions;

import javax.naming.StringRefAddr;

import calculator.Calculator;
import calculator.UseCalculator;

public class ExceptionHandling3 {

	public static void main(String[] args) throws Exception{
		Calculator clcInf = new UseCalculator();
		
		Exception ex1 = new ArithmeticException();
		Exception ex2 = new NullPointerException();
		Exception ex3 = new ArrayIndexOutOfBoundsException();
		Exception ex4 = new StringIndexOutOfBoundsException();
		Exception ex5 = new ClassCastException();
		
		System.out.println("Program execution Started");
		try {			
			System.out.println(100/0);
		}catch(Exception e) {
			
		}
		
		Thread.sleep(10000);
		
		System.out.println("Program execution Ended");

	}

}
