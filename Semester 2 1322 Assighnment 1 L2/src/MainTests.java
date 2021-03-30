//jimmy nguyen

import java.util.Scanner;

public class MainTests {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double userInput = 0;
		String[] firstName = new String[10];
		String[] lastName = new String[10];
		double classAverage = 0;
		Tests[] students = new Tests[10];

		for (int i = 0; i <= 9; i++) {
			System.out.println("Enter first name");
			firstName[i] = scan.nextLine();

			System.out.println("Enter last name");
			lastName[i] = scan.nextLine();

			students[i] = new Tests(firstName[i], lastName[i]);
			students[i].setTestGrades();
			students[i].setAverage();
			classAverage += students[i].getAverage();
		}

		System.out.println("First Name: \tLast Name: \tTest 1: \tTest 2:"
				+ " \tTest 3: \t Test 4: \tTest 5: \t Average: \tLetter Grade:");

		for (int i = 0; i <= 9; i++) {
			System.out.println(students[i].toString());
		}

		/*
		 * now that we will print the class average by dividing it by 10 since we have
		 * finished adding all the averages together
		 */
		
		classAverage /= 10;
		
		System.out.println("Class average = " + classAverage);

	}
}
