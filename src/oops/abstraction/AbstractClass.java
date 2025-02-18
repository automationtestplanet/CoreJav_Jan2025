package oops.abstraction;

abstract public class AbstractClass {

	int a;
	int b;

	public AbstractClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int addition() {
		return this.a + this.b;
	}
	
	abstract public int multiplication();
	
	public static void main(String[] args) {
//		AbstractClass absCls = new AbstractClass(100,200);
	}

}
