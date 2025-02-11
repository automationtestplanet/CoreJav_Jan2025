package fundamentals;

public class FinalVariable {
	
	static int a = 100;
	final static int b = 200;
	
	public static void addition(final int c, final int d) {
		
//		c = 300;  // final parameter value can not change
//		d = 400; // final parameter value can not change
		final int e = 700;
		System.out.println(e);
//		e = 800; // final local variable can not change
	}

	public static void main(String[] args) {
		System.out.println(a);		
		a = 500;
		System.out.println(a);
		
		System.out.println(b);		
//		b = 600;  // final variable value can not change
		System.out.println(b);
	}

}
