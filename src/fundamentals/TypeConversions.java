package fundamentals;

public class TypeConversions {

	public static void main(String[] args) {

		byte byte1 = 100; // 1 byte

		short short1 = byte1; // 2 bytes // smaller size datatype -> bigger size datatype // Implicit
								// Conversion

		short short2 = 100;
		System.out.println(short2);

		byte byte2 = (byte) short2; // bigger size datatype -> small size datatype //explicit Conversion
		System.out.println(byte2);

		short short3 = 200;
		System.out.println(short3);

//		byte byte3 = 200;
		byte byte3 = (byte) short3;
		System.out.println(byte3); // -128 to +127 // Here it prints recycled value

		byte byte4 = (byte) 130;
		System.out.println(byte4);

		int int1 = 500; // 4 bytes
		float float1 = int1; // 4 bytes

		float float2 = 500.5F;
		System.out.println(float2);
		int int2 = (int) float2; // same size datatype -> same size datatype
		System.out.println(int2);

		long long1 = 10000L;
		double double1 = long1;

		System.out.println(long1);
		System.out.println(double1);

		System.out.println("---------------------");
		String string1 = "100";
		System.out.println(string1);

//		byte byte5 = string1;  // Implicit conversion is not working
//		byte byte5 = (byte)string1; // Explicit conversion also not working
//		byte byte5 =   // non-primitive to primitive type

//		
		int int3 = 200;
//		String string2 = int3;
//		String string2 = (String)int3;
		String string2 = String.valueOf(int3); // primitive to non-primitive

	}

	
}
