package fundamentals;

public class StringOperations {

	void display() {

	}

	public static void main(String[] args) {

		StringOperations stOp = new StringOperations();
		stOp.display();

		String string1 = "Welcome to Java";
		String string2 = new String("Welcome to Java");

		System.out.println(string1);
		System.out.println(string2);

		System.out.println(string1.toUpperCase());
		System.out.println(string1);

		String str1 = "Java";
		String str2 = "Java";

		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1.toUpperCase();
		System.out.println(str3);

		str3 = str1.toLowerCase();
		System.out.println(str3);

		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());

		System.out.println(string1.length());
		System.out.println(string1.charAt(0));
		System.out.println(string1.charAt(string1.length() - 1));
		System.out.println(string1.indexOf("W"));
		System.out.println(string1.indexOf("e"));
		System.out.println(string1.indexOf("x"));
		System.out.println(string1.indexOf("a"));
		System.out.println(string1.lastIndexOf("a"));

		char[] charArr = string1.toCharArray();
		for (char eachChar : charArr) {
			System.out.print(eachChar + " ");
		}
		System.out.println();

		String string3 = new String(charArr);
		System.out.println(string3);
		System.out.println(string1);

		String[] strArr = string1.split(" ");
		for (String eachStr : strArr) {
			System.out.println(eachStr);
		}

		System.out.println(string1.contains("Java"));
		System.out.println(string1.contains("Python"));

		System.out.println(string1.equals("Welcome to Java"));
		System.out.println(string1.equals("welcome to java"));
		System.out.println(string1.equalsIgnoreCase("welcome to java"));

		System.out.println(string1);

		System.out.println(string1.replace("Java", "Python"));

		System.out.println(string1.replace("a", "B"));
		System.out.println(string1.replaceFirst("a", "B"));

		System.out.println(string1.replaceAll("a", "B"));

		String string4 = "AbcD12@34$eFg#H67&8^";
		System.out.println(string4);
		
		String onlyChars = string4.replaceAll("[^a-zA-Z]", "");
		System.out.println(onlyChars);
		
		String onlySmallChars = string4.replaceAll("[^a-z]", "");
		System.out.println(onlySmallChars);
		
		String onlyBigChars = string4.replaceAll("[^A-Z]", "");
		System.out.println(onlyBigChars);
		
		String onlyCharsAndNums = string4.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(onlyCharsAndNums);
		
		String onlyNums = string4.replaceAll("[^0-9]", "");
		System.out.println(onlyNums);
		
		String onlySplChars = string4.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(onlySplChars);
		
		System.out.println(string1);
		System.out.println(string1.concat(" World"));
		
		System.out.println(string1.startsWith("Welcome"));

	}

}
