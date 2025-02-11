package fundamentals;

public class Operators {

	public static void main(String[] args) {

		System.out.println("--------------------Arithematic Operators------------");
		int a = 100;
		int b = 200;

		System.out.println("Addition: " + (a + b));
		System.out.println("Sbtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modular Division: " + (a % b));
		System.out.println("Modular Division: " + (10 % 3));

		System.out.println("--------------------Incremental Operators------------");
		int c = 10;
		System.out.println(c);

		c += 5; // c = c+5;
		System.out.println(c);

		c -= 5; // c = c-5;
		System.out.println(c);

		c *= 5; // c = c*5;
		System.out.println(c);

		c /= 5; // c = c/5;
		System.out.println(c);

		c %= 5; // c = c%5;
		System.out.println(c);

		c = 10;
		System.out.println(c);
		System.out.println(c++); // c +=1; //c=c+1 // 1 // post Increment
		System.out.println(c);
		System.out.println(c--); // post decrement
		System.out.println(c);
		System.out.println(--c); // pre-decrement
		System.out.println(++c);

		System.out.println("--------------------Comparision Operators------------");
		a = 10;
		b = 20;

		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a != b);
		System.out.println(a <= b); // < , == -> if any one condition is true, it will be true -> T F -> T
		System.out.println(a >= b); // F F -> F
		boolean result1 = a >= b;

		System.out.println("--------------------Logical Operators------------");
		a = 100;
		b = 200;

		System.out.println(a < b && a == b); // if both conditions are true ,it will be true -> T F -> F
		System.out.println(a < b || a == b); // if any one condition is true, it will be true -> T F -> T
		System.out.println(a < b || a == b && a != b); // T F -> T T -> T
		System.out.println(!(a < b || a == b && a != b)); // T F -> T T -> T -> F

		System.out.println("--------------------Ternary Operators------------");
		a = 1000;
		b = 2000;

		System.out.println((a < b) ? 10000 : 20000);
		System.out.println((a > b) ? 10000 : 20000);
		System.out.println((a > b) ? true : false);
		System.out.println((a > b) ? a : b);
		System.out.println((a > b) ? 'A' : 'B');
		System.out.println((a > b) ? "A is bigger than B" : "B is bigger than A");

	}

}
