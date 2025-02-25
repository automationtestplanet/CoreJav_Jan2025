package iostreams;

import java.util.Scanner;

public class ScannerClassExample {

	public static void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int int1 = sc.nextInt();

		System.out.println("Enter Number2 : ");
		int int2 = sc.nextInt();

		addition(int1, int2);

		System.out.println("Enter String value: ");
		String str1 = sc.next();

		System.out.println("Hello this is: " + str1);

	}

}
