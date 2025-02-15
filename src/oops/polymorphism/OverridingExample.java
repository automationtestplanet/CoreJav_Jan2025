package oops.polymorphism;

public class OverridingExample extends OverloadingExample {

	public float addition(float a, float b) {
		return a + b;
	}

	public int addition(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	
	public int addition(int a, int b) {  // overriding method
		return a + b + 100;
	}
	
	public int addition(int a, int b, int c) {
		return super.addition(a,b,c) + 200;
	}
	
	public float division(int a, int b) {
		return a/b;
	}
	
	public static String addition(String a, String b) {
		return a + b + "World";
	}
	
//	public String addition(char a, char b) {   // parent class final method can not be override. we can not create 
//		String str = "";
//		return str = str + a + b;
//	}

	public static void main(String[] args) {
		OverridingExample overrideEx = new OverridingExample();
		
		System.out.println(overrideEx.addition(130, 20));
		System.out.println(overrideEx.addition(10, 20, 30));
		System.out.println(overrideEx.addition(10, 20, 30, 40));
		System.out.println(overrideEx.addition(100.5F, 200.7F));		
		System.out.println(overrideEx.addition(10, 20, 30, 40, 50));
		
		System.out.println(overrideEx.addition(10, 20, 30));
		
		
		int a = 100;   // primitive
		
		OverridingExample overrideEx1 = new OverridingExample();   // non-primitive/referenced
		
		
		
	}
	
	

}
