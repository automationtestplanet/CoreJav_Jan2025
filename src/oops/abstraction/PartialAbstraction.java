package oops.abstraction;

abstract public class PartialAbstraction {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	abstract public int mulplication(int a, int b); // non-concrete methods or abstract methods or unimplemented methods

	abstract public int division(int a, int b);

	abstract public int modDivision(int a, int b);
	
	public static void main(String[] args) {
//		PartialAbstraction partialBasCls = new PartialAbstraction();  // can not create the object
	}

}
