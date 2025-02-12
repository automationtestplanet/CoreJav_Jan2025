package fundamentals;

public class ConstructorExample2 {

	int a;
	boolean b;	
	char ch;
	float f;
	String str;
	

	ConstructorExample2() {

	}
	
	ConstructorExample2(int a, boolean b, char ch, float f, String str) {
		this.a = a;
		this.b = b;
		this.ch = ch;
		this.f = f;
		this.str = str;
		
//		int c = 100;
//		c = c;
	}
	
	void displayGlobalData() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample2 cons1 = new ConstructorExample2();		
		cons1.displayGlobalData();
		
		System.out.println("----------------------------------------");
		ConstructorExample2 paramCons  = new ConstructorExample2(100,true,'A', 5.0F, "Java");
		
		paramCons.displayGlobalData();
	}

}
