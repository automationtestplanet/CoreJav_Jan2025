package oops.inheritance;

public class NewCalculator extends Calculator {

	public int modDivision(int a, int b) {
		return a % b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int addition(int a, int b) {
		return a + b + 100;
	}
}
