package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {  //throws InterruptedException {

//		a int  = 100;  // syntax error

//		Thread.sleep(10000);  // Speculation errors

//		System.out.println(100/0);  // unchecked exception

		System.out.println("Program execution Started");

		try {
			System.out.println(100 / 0); // run time error - program execution terminating abnormally
			throw new ArithmeticException();
		} catch (ArithmeticException aeEx) {
			System.out.println(100 / 1);
			aeEx.printStackTrace();
			System.out.println(aeEx.getMessage());
		}
		System.out.println("Program execution Ended");
		
		try {		
			Thread.sleep(10000);
		}catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println("Waited 10 seconds");

	}

}
