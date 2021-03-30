import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void updateField(char[][] hiddenField, char[][] visibleField, int x, int y) {

		char temp = ' ';

		temp = hiddenField[x][y];

		visibleField[x][y] = temp;
	}

	public static boolean checkCollision(char[][] hiddenField, char[][] visibleField, int x, int y) {
		if (hiddenField[x][y] == 'B') {
			return true;
		}
		return false;
	}

	public static boolean validateInput(int x, int y) {
		if ((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
			return true;
		}
		System.out.println("\n>>>Please go back and make sure you are in bounds!<<<\n");
		return false;
	}

	public static void showVisibleField(char[][] visibleField) {

		int count = 0;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(visibleField[r][c] + " ");
				count++;
				if (count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

	public static void showHiddenField(char[][] hiddenField) {

		System.out.println("The actual field is: ");

		int count = 0;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(hiddenField[r][c] + " ");
				count++;
				if (count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

	public static char[][] characterSwap(char[][] hiddenField, int bombs) {

		if (bombs == 0) {
			return hiddenField;
		} else {

			Random rand = new Random();
			int row = rand.nextInt(4 + 1);
			int column = rand.nextInt(4 + 1);

//			System.out.println(row);
//			System.out.println(column);

			hiddenField[row][column] = 'B';

			return characterSwap(hiddenField, bombs - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] visibleField = new char[5][5];
		char[][] hiddenField = new char[5][5];
		int bombs = 5;
		int lives = 3;
		int points = 0;
		int currentRound = 1;
		int x = 0;
		int y = 0;

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				visibleField[r][c] = '_';
			}
		}

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				hiddenField[r][c] = 'S';
			}
		}

		characterSwap(hiddenField, bombs);

		while (lives != 0) {
			//uncomment for cheat codes
			showHiddenField(hiddenField);
			System.out.println("Round " + currentRound);
			currentRound++;

			showVisibleField(visibleField);

			System.out.println("Please enter a x position to sweep for mines: ");
			x = scan.nextInt();

			System.out.println("Please enter a y position to sweep for mines: ");
			y = scan.nextInt();

			while (!validateInput(x, y)) {
				System.out.println("Please enter a x position to sweep for mines: ");
				x = scan.nextInt();

				System.out.println("Please enter a y position to sweep for mines: ");
				y = scan.nextInt();
			}

			if (checkCollision(hiddenField, visibleField, x, y)) {
				lives--;
			} else {
				points++;
			}

			updateField(hiddenField, visibleField, x, y);
			
			showVisibleField(visibleField);
		}

		if (lives == 0) {

			System.out.println("Game over. You stepped on 3 bombs");
			System.out.println("You survuved " + currentRound + " rounds");
			System.out.println("You collected " + points + " points");
			showHiddenField(hiddenField);

		}
		showHiddenField(hiddenField);
	}

}
