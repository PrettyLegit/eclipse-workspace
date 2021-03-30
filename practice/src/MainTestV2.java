

import java.util.Scanner;

public class MainTestV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String firstName = "";
		String lastName = "";
		double[] testScores = new double[5];
		int count = 1;
		double userInput = 0; // this is to store a single grade which will then be used to validate it is
								// correct
		String[] userData = new String[10];

		// set this number to 2 if u want to test smaller student size
		while (count <= 10) {

			System.out.println("Enter in your first name");

			firstName = scan.nextLine();

			System.out.println("Enter in your last name");

			lastName = scan.nextLine();

			System.out.println("\nPlease proceed by entering the student's grades");

			for (int x = 0; x < testScores.length; x++) {

				do {

					System.out.print("Please enter score of test ");
					userInput = scan.nextDouble();

					testScores[x] = userInput;

				} while (validateInput(userInput) == false);

			}
			if (count == 1) {
				TestV2 s1 = new TestV2(firstName, lastName, testScores);
				s1.setAverage(testScores);
				userData[count] = s1.toString();

			} else if (count == 2) {
				TestV2 s2 = new TestV2(firstName, lastName, testScores);
				s2.setAverage(testScores);
				userData[count] = s2.toString();

			} else if (count == 3) {
				TestV2 s3 = new TestV2(firstName, lastName, testScores);
				s3.setAverage(testScores);
				userData[count] = s3.toString();

			} else if (count == 4) {
				TestV2 s4 = new TestV2(firstName, lastName, testScores);
				s4.setAverage(testScores);
				userData[count] = s4.toString();
			} else if (count == 5) {
				TestV2 s5 = new TestV2(firstName, lastName, testScores);
				s5.setAverage(testScores);
				userData[count] = s5.toString();
			} else if (count == 6) {
				TestV2 s6 = new TestV2(firstName, lastName, testScores);
				s6.setAverage(testScores);
				userData[count] = s6.toString();
			} else if (count == 7) {
				TestV2 s7 = new TestV2(firstName, lastName, testScores);
				s7.setAverage(testScores);
				userData[count] = s7.toString();
			} else if (count == 8) {
				TestV2 s8 = new TestV2(firstName, lastName, testScores);
				s8.setAverage(testScores);
				userData[count] = s8.toString();
			} else if (count == 9) {
				TestV2 s9 = new TestV2(firstName, lastName, testScores);
				s9.setAverage(testScores);
				userData[count] = s9.toString();
			} else if (count == 10) {
				TestV2 s10 = new TestV2(firstName, lastName, testScores);
				s10.setAverage(testScores);
				userData[count] = s10.toString();
			}
			count++;
		}

		System.out.println("First Name: \tLast Name: \tTest 1: \tTest 2:"
				+ " \tTest 3: \t Test 4: \tTest 5: \t Average: \tLetter Grade:");

		for (int index = 0; index < userData.length; index++) {
			System.out.println(userData[index]);
		}
		
	}

	public static boolean validateInput(double userInput) {
		System.out.println("Processing...");
		if (userInput >= 0 && userInput <= 100) {
			System.out.println("Succuess!");
			return true;
		}
		System.out.println("Sorry. Please check that the input is not negative or over 100.");
		return false;
	}

}
