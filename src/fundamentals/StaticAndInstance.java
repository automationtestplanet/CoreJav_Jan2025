package fundamentals;

public class StaticAndInstance {

	int a;
	static String str;

	public void display1() {
		System.out.println(a); // instance to instance allowed
		System.out.println(str); // static to instance is allowed
	}

	public static void display2() {
//		System.out.println(a);  // instance to static is not allowed
		System.out.println(str); // static to static is allowed

	}

	public static void main(String[] args) {
		System.out.println("---------------------Static Data------------------");
		System.out.println(StaticAndInstance.str);    // static we can access with the class name
		StaticAndInstance.display2(); // static we can access with the class name

//		System.out.println(StaticAndInstance.a); // instance we can not access with class name
//		StaticAndInstance.display1(); // instance we can not access with class name
		System.out.println("-----------------Instance Data1----------------------");
		StaticAndInstance instance1 = new StaticAndInstance();
		instance1.a = 100;
		System.out.println(instance1.a);
		instance1.display1();
		instance1.str = "Java";
		instance1.display2();
		

		System.out.println("-----------------Instance Data2----------------------");
		StaticAndInstance instance2 = new StaticAndInstance();
		System.out.println(instance2.a);
		instance2.display1();

	}

}
