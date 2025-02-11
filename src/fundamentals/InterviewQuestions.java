package fundamentals;

public class InterviewQuestions {

	public static void printNonRepeatingCharsFromString(String str) {
		while (str.length() > 0) {
			if (str.indexOf(str.charAt(0)) == str.lastIndexOf(str.charAt(0))) {
				System.out.println(str.charAt(0));
			}
			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}
	}

	public static void printNonRepeatingCharsCountFromString(String str) {

		int count = 0;
		while (str.length() > 0) {
			if (str.indexOf(str.charAt(0)) == str.lastIndexOf(str.charAt(0))) {
				count++;
			}
			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}

		System.out.println(count);
	}

	public static void printRepeatingCharsFromString(String str) {
		while (str.length() > 0) {
			if (str.indexOf(str.charAt(0)) != str.lastIndexOf(str.charAt(0))) {
				System.out.println(str.charAt(0));
			}

			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}
	}

	public static void printRepeatingCharsCountFromString(String str) {
		int count = 0;
		while (str.length() > 0) {
			if (str.indexOf(str.charAt(0)) != str.lastIndexOf(str.charAt(0))) {
				count++;
			}

			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}
		System.out.println(count);
	}

	public static void printEachCharsCountFromString(String str) {

		while (str.length() > 0) {
			int count = 0;
			char ch = str.charAt(0);

			for (char eachChar : str.toCharArray()) {
				if (eachChar == ch) {
					count++;
				}
			}

			System.out.println(ch + " : " + count);

			str = str.replaceAll(String.valueOf(ch), "");
		}

	}

	public static void printEachWordCountFromString(String str) {

		while (str.length() > 0) {
			int count = 0;
			String firstStr = str.split(" ")[0];

			for (String eachstr : str.split(" ")) {
				if (eachstr.equals(firstStr)) {
					count++;
				}
			}

			System.out.println(firstStr + " : " + count);

			str = str.replaceAll(firstStr, "").trim();
		}

	}

	public static void main(String[] args) {
		System.out.println("------------------Print Non Repeating charscters from \"Welcome to Java\"--------------");
		printNonRepeatingCharsFromString("Welcome to Java");

		System.out.println("------------------Print Repeating charscters from \"Welcome to Java\"--------------");
		printRepeatingCharsFromString("Welcome to Java");

		System.out.println(
				"------------------Print Non Repeating charscters count from \"Welcome to Java\"--------------");
		printNonRepeatingCharsCountFromString("Welcome to Java");

		System.out.println("------------------Print Repeating charscters count from \"Welcome to Java\"--------------");
		printRepeatingCharsCountFromString("Welcome to Java");

		System.out.println("------------------Print each character occurance from \"Welcome to Java\"--------------");
		printEachCharsCountFromString("Welcome to Java");

		System.out.println("------------------Print each Word occurance from \"Welcome to Java\"--------------");
		printEachWordCountFromString("Welcome to Java Welcome to Java Java Welcome Java ");

	}

}
