package fundamentals;

public class OuterClass {

	class InstanceInnerClass {
		void method1() {
			System.out.println("This is Instance Inner calss Method1");
		}
	}

	static class StaticInnerClass {
		void method2() {
			System.out.println("This is Static Inner calss Method2");
		}
	}

	{ // Anonymous class  -> It will be executed while creation on object of a outer calss
		int a = 100;
		int b = 200;
		System.out.println("This is Anonymous Class : " + (a + b));
	}

	static { // static block - static block is always executed before the main method content
		int c = 300;
		int d = 400;
		System.out.println("This is Static Block : " + (c + d));
	}

	public static void main(String[] args) {
		System.out.println("This is Main method");
		
		OuterClass outerCls = new OuterClass();
		
		OuterClass.InstanceInnerClass insInnerCls =  outerCls.new InstanceInnerClass();
		insInnerCls.method1();
		
		OuterClass.StaticInnerClass statInnerCls = new StaticInnerClass();
		statInnerCls.method2();
	}
}
