package exceptions;

public class ExceptionHandling2 {

	public static void division(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("Divisible by zero is not possible");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program execution Started");
		division(10, 0);
		System.out.println("Program execution Ended");
	}

}
