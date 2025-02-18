package oops.abstraction;

public class UseInerface1 extends Class1 implements Interface1, Interface2 {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	@Override
	public int modDivision(int a, int b) {		
		return a%b;
	}

	public static void main(String[] args) {
		Interface1 inf1 = new UseInerface1();

		System.out.println(inf1.addition(100, 200));

		Interface2 inf2 = new UseInerface1();
		System.out.println(inf2.multiplication(100, 200));
		
		

		Class1 cls1 = new UseInerface1();
		System.out.println(cls1.subtration(100, 200));
		System.out.println(cls1.division(100, 200));
		
		System.out.println(inf1.modDivision(100, 200));
		System.out.println(inf2.modDivision(100, 200));
		
	}

	

}
