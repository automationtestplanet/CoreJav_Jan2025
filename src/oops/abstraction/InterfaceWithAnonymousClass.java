package oops.abstraction;

public interface InterfaceWithAnonymousClass {

	
	void addition(int a, int b);
	
	public static void main(String[] args) {
		InterfaceWithAnonymousClass insEx = new InterfaceWithAnonymousClass() {
			public void addition(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		insEx.addition(1000, 2000);
	}
}
