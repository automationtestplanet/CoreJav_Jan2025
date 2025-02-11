package fundamentals;

public class Arrays {

	public static void main(String[] args) {
		int a = 100;

		int[] intArr = { 10, 20, 30, 40, 50 };
		System.out.println(intArr);

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);

		System.out.println(intArr.length);

		for (int index = 0; index < intArr.length; index++) {
			System.out.println(intArr[index]);
		}

		for (int eachValue : intArr) { // enhanced for loop
			System.out.println(eachValue);
		}

		int b;
		b = 200;

		int[] intArr2 = new int[3];
		intArr2[0] = 100;
		intArr2[1] = 200;
		intArr2[2] = 300;

		for (int eachValue : intArr2) { // enhanced for loop
			System.out.println(eachValue);
		}

		int[][] intArr_2D = { { 10, 20, 30 }, { 100, 200, 300 }, { 1000, 2000, 3000 } };

		for (int i = 0; i < intArr_2D.length; i++) {
			for (int j = 0; j < intArr_2D[i].length; j++) {
				System.out.print(intArr_2D[i][j] + " ");
			}
			System.out.println("");
		}

		int[][] intArr2_2d = new int[2][3];
		intArr2_2d[0][0] = 10;
		intArr2_2d[0][1] = 20;
		intArr2_2d[0][2] = 30;
		intArr2_2d[1][0] = 100;
		intArr2_2d[1][1] = 200;
		intArr2_2d[1][2] = 300;

		for (int[] eachArray : intArr2_2d) {
			for (int eachVal : eachArray) {
				System.out.print(eachVal + " ");
			}
			System.out.println("");
		}

	}

}
