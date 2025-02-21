package exceptions;

public class HandlingExceptionTypes {

	boolean b = true;

	public static void main(String[] args) {
		int a = 100;
		String str = "Hello";
		int[] intArr = { 10, 20, 30 };
		HandlingExceptionTypes hndEx = null;

		try {
//			System.out.println(a / 0);
			System.out.println(a / 1);
//			System.out.println(str.charAt(6));
			System.out.println(str.charAt(3));	
//			System.out.println(intArr[4]);
			System.out.println(intArr[2]);
			System.out.println(hndEx.b);
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}catch (StringIndexOutOfBoundsException sIndEx) {
			sIndEx.printStackTrace();	
		}catch (ArrayIndexOutOfBoundsException arrEx) {
			arrEx.printStackTrace();	
		}catch (NullPointerException ne) {
			ne.printStackTrace();	
		}
		
		
		System.out.println("Program execution ended");
		
		System.out.println("Next Program STarted");
		try {
//			System.out.println(a / 0);
			System.out.println(a / 1);
//			System.out.println(str.charAt(6));
			System.out.println(str.charAt(3));	
//			System.out.println(intArr[4]);
			System.out.println(intArr[2]);
			System.out.println(hndEx.b);
			
		} catch (ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("Next Program ended");
		
		
		System.out.println("New Program STarted");
		try {
//			System.out.println(a / 0);
			System.out.println(a / 1);
//			System.out.println(str.charAt(6));
			System.out.println(str.charAt(3));	
//			System.out.println(intArr[4]);
			System.out.println(intArr[2]);
			System.out.println(hndEx.b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("New Program ended");

	}

}
