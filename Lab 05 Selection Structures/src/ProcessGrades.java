
/* 
Class: CSE 1321L 
Section: 	Lab 5         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		5
 */
import java.util.Scanner;

public class ProcessGrades {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// declare
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		double average;
		int highest = 100;
		int lowest = 0;

		// read
		System.out.println("Enter your first grade.");
		grade1 = reader.nextInt();

		System.out.println("Enter your second grade.");
		grade2 = reader.nextInt();

		System.out.println("Enter your third grade.");
		grade3 = reader.nextInt();

		System.out.println("Enter your fourth grade.");
		grade4 = reader.nextInt();

		// check for highest
		if ((grade1 >= grade2) && (grade1 >= grade3) && (grade1 >= grade4)) {
			highest = grade1;
		} else if ((grade2 >= grade1) && (grade2 >= grade3) && (grade2 >= grade4)) {
			highest = grade2;
		} else if ((grade3 >= grade1) && (grade3 >= grade2) && (grade3 >= grade4)) {
			highest = grade3;
		} else if ((grade4 >= grade1) && (grade4 >= grade2) && (grade4 >= grade3)) {
			highest = grade4;
		}

		// check for lowest
		if ((grade1 <= grade2) && (grade1 <= grade3) && (grade1 <= grade4)) {
			lowest = grade1;
		} else if ((grade2 <= grade1) && (grade2 <= grade3) && (grade2 <= grade4)) {
			lowest = grade2;
		} else if ((grade3 <= grade1) && (grade3 <= grade2) && (grade3 <= grade4)) {
			lowest = grade3;
		} else if ((grade4 <= grade1) && (grade4 <= grade2) && (grade4 <= grade3)) {
			lowest = grade4;

		}

		// math
		average = ((grade1 + grade2 + grade3 + grade4) / 4.00);

		// print
		System.out.println("You entered: " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4);
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
		System.out.println("Average grade: " + average);
	}
}
