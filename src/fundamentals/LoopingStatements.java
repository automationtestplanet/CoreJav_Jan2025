package fundamentals;

public class LoopingStatements {

	public static void printTable(int tableVal) {
		for (int i = 1; i < 11; i++) {
			System.out.println(tableVal + " X " + i + " = " + (i * tableVal));
		}
	}

	public static void main(String[] args) {

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		printTable(90909);

		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		int b = 10;
		do {
			System.out.println(b);
			b++;
		} while (b <= 10);

		for (int i = 1; i < 11; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i < 11; i++) {
			if (i == 4 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
