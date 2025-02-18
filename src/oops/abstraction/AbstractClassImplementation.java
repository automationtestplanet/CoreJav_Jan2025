package oops.abstraction;

public class AbstractClassImplementation extends AbstractClass {

	public AbstractClassImplementation(int a, int b) {
		super(a, b);
	}

	@Override
	public int multiplication() {
		return a * b;
	}
	
	public static void main(String[] args) {
		AbstractClass absCls = new AbstractClassImplementation(100,200);
		
		System.out.println(absCls.addition());
		System.out.println(absCls.multiplication());
	}

}
