package fundamentals;

public class TypesOfMethods {

	public static void addition() { // Method without parameters and without return
		int a = 100;
		int b = 200;
		System.out.println("Addition: " + (a + b));
	}

	public static int subtraction() { // Method without parameters and with return
		int a = 100;
		int b = 200;
		return a - b;
	}

	public static void mulplication(int a, int b) { // Method with parameters and without return
		System.out.println("Multiplication: " + (a * b));
	}

	public static int division(int a, int b) { // Method with parameters and with return
		return a / b;
	}

	public static void main(String[] args) {
		addition();
		mulplication(10, 20);

		int result = subtraction();
		System.out.println(result);
		mulplication(result, 1000);
		mulplication(subtraction(), 1000);

		int result2 = division(100, 5);
		System.out.println(result2);

		mulplication(result, result2);
		mulplication(subtraction(), division(100, 5));
		
		
//		byte result3 = division(10000, 1000);
		byte result3 = (byte)division(10000, 1000);
		System.out.println(result3);
		
		long result4 = division(10000, 1000);
		System.out.println(result4);
	}

}
