package oops.abstraction;

class PartialAbstractionImplementation extends PartialAbstraction {

	@Override
	public int mulplication(int a, int b) {		
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public int modDivision(int a, int b) {
		return a%b;
	}

}
