
//jimmy nguyen 
import java.util.Scanner;

public class Tests {
	Scanner scan = new Scanner(System.in);

	private String firstName = "";
	private String lastName = "";
	private double[] testScores = new double[5];
	private double average = 0.00;
	private String letterGrade = "";
	private double classAverage = 0.00;

	Tests(String firstName, String lastName) {
		this.firstName = firstName;

		this.lastName = lastName;
	}

	public void setTestGrades() {
		double userInput = 0;

		System.out.println("Please proceed by entering the student's grades");

		for (int x = 0; x < testScores.length; x++) {

			do {

				System.out.print("Please enter score of test ");
				userInput = scan.nextDouble();

				testScores[x] = userInput;

			} while (validateInput(userInput) == false);

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

	// find the average of all 5 tests
	public void setAverage() {
		double[] testScoresLocal = testScores.clone();
		double average = 0;

		for (int row = 0; row < testScoresLocal.length; row++) {
			average += testScoresLocal[row];
		}
		average = (average / 5.000);
		this.average = average;
	}

	// prints the 5 tests
	public void printScores(double[] testScores) {
		double score = 0;
		double[] testScoresLocal = testScores.clone();

		for (int row = 0; row < testScoresLocal.length; row++) {

			score = testScoresLocal[row];
			System.out.print(score + "\t\t");

		}

	}

	public void setLetterGrade() {
		int letterGrade = (int) (average / 10);

		if (letterGrade == 10 || letterGrade == 9) {
			this.letterGrade = "A";
		}
		if (letterGrade == 8) {
			this.letterGrade = "B";
		}
		if (letterGrade == 7) {
			this.letterGrade = "C";
		}
		if (letterGrade == 6) {
			this.letterGrade = "D";
		}
		if (letterGrade == 5 || letterGrade == 0) {
			this.letterGrade = "F";
		}
	}
	
	public double getAverage() {
		return average;
	}

	@Override
	public String toString() {

		System.out.print(firstName + "\t\t" + lastName + "\t\t");

		printScores(testScores);
		setLetterGrade();
		return average + "\t\t" + letterGrade;
	}
	
	
}
