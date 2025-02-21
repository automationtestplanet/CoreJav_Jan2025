package exceptions;

public class ExceptionHandlingWithTryCatchFinally {

	static String getDataFromStatbase(String str) {
		return str.toUpperCase();
	}

	public static void main(String[] args) {
		try {
			System.out.println("Database Opened");
//			System.out.println(getDataFromStatbase("Java"));
			System.out.println(getDataFromStatbase(null));
		} catch (Exception e) {

		} finally {
			System.out.println("Database Closed");
		}

	}

}
