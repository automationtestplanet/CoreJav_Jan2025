package oops.polymorphism;

public class OverloadingExample {

	public int addition(int a, int b) {
		System.out.println("addition int , int method is called");
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static String addition(String a, String b) {
		return a + b;
	}

	public int addition(short a, int b) {
		System.out.println("addition short , int method is called");
		return a + b;
	}

	public int addition(int a, short b) {
		System.out.println("addition int , short method is called");
		return a + b;
	}

	public int addition(byte a, short b) {
		System.out.println("addition byte , short method is called");
		return a + b;
	}

	final public String addition(char a, char b) {
		String str = "";
		return str = str + a + b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		OverloadingExample overLoadEx = new OverloadingExample();
		System.out.println(overLoadEx.addition(130, 20));
		System.out.println(overLoadEx.addition(10, 20, 30));
		System.out.println(overLoadEx.addition(10, 20, 30, 40));
		System.out.println(overLoadEx.addition(10, 20));

		System.out.println(overLoadEx.addition("Hello", "Java"));
		System.out.println(overLoadEx.addition('A', 'B'));
	}

}
