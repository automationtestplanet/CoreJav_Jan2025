package oops.abstraction;

class CalculatorImplementation implements Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int mulplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	public int modDivision(int a, int b) {
		return a % b;
	}
}
