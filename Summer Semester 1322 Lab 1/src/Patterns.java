
public class Patterns {

	public static void patternA() {

		System.out.println("Pattern A:");

		char[][] arr = new char[10][10];
		int starCount = 10;
		// traverse and fill the array
		for (int i = 0; i < arr.length; i++) {
			// print every row by gradually decreasing stars
			for (int j = 0; j < starCount; j++) {
				arr[i][j] = '*';
			}

			for (int k = starCount; k < arr[i].length; k++) {
				arr[i][k] = '_';
			}
			starCount--;
		}

		// traverse and print the array
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
	}

	public static void patternB() {

		System.out.println("Pattern B:");

		char[][] arr = new char[10][10];
		int starCount = 9;// changing this results in pattern
		// traverse and fill the array
		for (int i = 0; i < arr.length; i++) {
			// print every row by gradually decreasing stars
			for (int j = 0; j < starCount; j++) {
				arr[i][j] = '_';
			}

			for (int k = starCount; k < arr[i].length; k++) {
				arr[i][k] = '*';
			}
			starCount--;
		}

		// traverse and print the array
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
	}

	public static void patternC() {

		System.out.println("Pattern C:");

		char[][] arr = new char[10][10];

		// dash count
		int dashCount = 0;
		// int starCount = 9;// changing this results in pattern
		// traverse and fill the array
		for (int i = 0; i < arr.length - 1; i++) {
			// print every row by gradually decreasing stars
			for (int j = 0; j < dashCount; j++) {
				arr[i][j] = '-';
			}

			for (int k = dashCount; k < arr[i].length - 1; k++) {
				arr[i][k] = '*';
			}
			dashCount++;
		}

		// traverse and print the array
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
	}

	public static void patternD() {

		System.out.println("Pattern D:");

		char[][] arr = new char[10][10];
		int dashNum = 4;
		int starNum = 1;
		// TopHalf
		for (int i = 0; i < arr.length / 2; i++) {
			// set Dashes
			for (int j = 0; j < dashNum; j++) {
				arr[i][j] = '-';
			}
			// set stars
			for (int k = dashNum; k < starNum + dashNum; k++) {
				arr[i][k] = '*';
			}

			// dashes go down one each time
			dashNum--;
			// stars go up by two each time
			starNum += 2;

		}
		dashNum = 0;
		starNum = 9;

		// bottom Half
		for (int i = (arr.length / 2) + 1; i < arr.length; i++) {
			// set Dashes
			for (int j = 0; j < dashNum; j++) {
				arr[i][j] = '-';
			}
			// set stars
			for (int k = dashNum; k < starNum + dashNum; k++) {
				arr[i][k] = '*';
			}
			// dashes go down one each time
			dashNum++;
			// stars go up by two each time
			starNum -= 2;
		}

		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		patternA();
		System.out.println();
		patternB();
		System.out.println();
		patternC();
		System.out.println();
		patternD();
	}
}
