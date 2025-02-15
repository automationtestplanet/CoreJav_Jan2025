package oops.polymorphism;

public class VarArgsExample {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public void addition(int... a) {   //varargs
		int sum = 0;
		for (int eachVal : a) {
			sum = sum + eachVal;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		VarArgsExample varArgs = new VarArgsExample();

		varArgs.addition(10, 20);
		varArgs.addition(10, 20, 30);
		varArgs.addition(10, 20, 30, 40);
		varArgs.addition(10, 20, 30, 40, 50);
		varArgs.addition(10, 20, 30, 40, 50, 60);
		varArgs.addition(10, 20, 30, 40, 50, 60, 70);
		varArgs.addition(10, 20, 30, 40, 50, 60, 70, 80);
		varArgs.addition(10, 20, 30, 40, 50, 60, 70, 80, 90);

	}

}
