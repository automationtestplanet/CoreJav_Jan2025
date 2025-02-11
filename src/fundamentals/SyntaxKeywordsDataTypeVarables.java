package fundamentals;

public class SyntaxKeywordsDataTypeVarables {
	
	public static void main(String[] args) {
		byte byte1 = 100;		
//		byte byte2 = 128;
		
		short short1 = 32767;
//		short short2 = 32768;
		
		int int1 = 2121215;
		long long1 = 812833939293983L;
		long long2 = 812833939293983l;
		
		float float1= 100.05F;
		float float2= 100.05f;
		
		double double1 = 100.0567E234D;
		double double2 = 100.0567E234d;
		
		
		char char1 = 'A';
		char char2 = '1';
		char char3 = '#';		
//		char char4 = 'ABC';
		
		String string1 = "Hello";
		String string2 = "Hello123";
		String string3 = "Hello@123";
		
		boolean result1 = byte1 == short1; // true/false
		
		System.out.println(result1);
		System.out.println(byte1);
		System.out.println(char1);
	}

}
