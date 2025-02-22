package fundamentals;

public class Datatypes {

//	void display(int a) {
//		System.out.println(a);
//	}

	void display(Object a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		// Primitive
		boolean bool1 = true;
		byte byte1 = 10;
		short short1 = 100;
		char ch1 = 'A';
		int int1 = 1000;
		float float1 = 100.53F;
		long long1 = 10000L;
		double double1 = 1029.377E8D;

		// Non-Primitive -- All the Predefined and UserDefined Class/Interface/Enum
		// names are non-primitive datatypes
		Datatypes dataTypes = new Datatypes();
		String str1 = new String();
		Boolean bool2 = false;
		Byte byte2 = 100;
		Short short2 = 1000;
		Character ch2 = 'B';
		Integer int2 = 10000;
		Float float2 = 10.55F;
		Long long2 = 10000000L;
		Double double2 = 10098.2453E45D;

		// str1 = byte1; // error
		// str1 = byte2; // error
//		ch1 = str1; // error
//		str1 = ch1; // error

		Object obj1 = bool1;
		Object obj2 = byte1;
		Object obj3 = short1;
		Object obj4 = ch1;
		Object obj5 = int1;
		Object obj6 = float1;
		Object obj7 = long1;
		Object obj8 = double1;
		Object obj9 = str1;
		Object obj10 = dataTypes;

		System.out.println(obj1);

		boolean bool3 = (boolean) obj1;

//		dataTypes.display(true);

		dataTypes.display(100);
		dataTypes.display(true);
		dataTypes.display("Stirng");
		dataTypes.display('C');
		dataTypes.display(dataTypes);

		Object[] objArr = { true, 10, 100, 'A', 1000, 100.5F, 100000L, 10098.35E45D, "Hello" };
		
		// Type Conversion is not required		
		var var1 = true;
		var var2 = 10;
		var var3 = 100;
		var var4 = 'A';
		var var5 = 1000;
		var var6 = 100.5F;
		var var7 = 10000L;
		var var8 = 100.34E56D;
		var var9 = "Java";
		var var10 = new Datatypes();

	}

}
