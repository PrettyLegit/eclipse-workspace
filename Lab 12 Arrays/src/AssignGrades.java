
/* 
Class: CSE 1321L 
Section: 	Module 7       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		12
 */
import java.util.Scanner;

public class AssignGrades {

	public static int[] createArrayGrades(int classSize) {
		Scanner reader = new Scanner(System.in);

		int input = 1;
		int gradesArray[] = new int[classSize];

		for (int i = 0; i < gradesArray.length;) {
			System.out.println("Enter in score.");
			input = reader.nextInt();

			if ((input > 0) && (input < 100)) {
				gradesArray[i] = input;

				// doing this will reprompt the user to enter a valid score in i array
				i++;
			} else {
				System.out.println("Enter a valid score.");
			}
		}

		return gradesArray;
	}

	public static void printGrade(int[] gradesArray) {

		for (int i = 0; i < gradesArray.length; i++) {
			/*there are many ways to do this but i decided to divide by 10
			 * we make this variable so we dont mess with the actual value in the array
			 * we went back to lab 4 to access this style of the grade processing
			 */
			int tempVal = gradesArray[i] / 10;
			String letterGrade = "";
			
			switch(tempVal) {
				case 1: letterGrade = "A";
				break;
				
				case 9: letterGrade = "A";
				break;
				
				case 8: letterGrade = "B";
				break;
				
				case 7: letterGrade = "C";
				break;
				
				case 6: letterGrade = "D";
				break;
				
				case 5: letterGrade = "F";
				break;
				
				default: letterGrade = "F";
			}
			
			System.out.print("Student " + i + " score is " + gradesArray[i]);
			System.out.println(" and grade is " + letterGrade);
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int classSize = 1;
		/*
		 * remember that this variable is only available to this method it just so
		 * happens they share the same name
		 */
		int gradesArray[];

		System.out.println("Enter class size.");
		classSize = reader.nextInt();

		gradesArray = createArrayGrades(classSize);
		
		printGrade(gradesArray);
	}
}
