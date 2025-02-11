package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {

		String string1 = "100";
		String string2 = "false";

		byte byte1 = 100;
		Byte byte2 = 100;
		byte2 = byte1;
		byte1 = byte2;
//		byte byte3 = (byte)string1;
		byte byte3 = Byte.parseByte(string1);

		short short1 = 200;
		Short short2 = 200;
		short short3 = Short.parseShort(string1);

		int int1 = 300;
		Integer int2 = 300;
		int int3 = Integer.parseInt(string1);

		long long1 = 400L;
		Long long2 = 400L;
		long long3 = Long.parseLong(string1);

		float float1 = 100.5F;
		Float float2 = 100.5F;
		float float3 = Float.parseFloat(string1);

		double double1 = 100.065E23D;
		Double double2 = 100.065E23D;
		double double3 = Double.parseDouble(string1);

		boolean bool1 = true;
		Boolean bool2 = true;
		boolean boole3 = Boolean.parseBoolean(string2);

		char ch1 = 'A';
		Character ch2 = 'A';
		char char3 = string2.charAt(0);

	}

}
