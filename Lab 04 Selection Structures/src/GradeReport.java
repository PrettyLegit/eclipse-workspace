
/* 
Class:	CSE 1321L 
Section: 	Lab 4          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		4
 */
import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		int grade;
		int covertedGrade;
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a grade.");
		grade = reader.nextInt();
		System.out.println("You entered " + grade + ".");
		
		covertedGrade = grade/10;
		
		switch (covertedGrade) {
		case 10 : System.out.println("That grade is a perfect score. Well done.");
		break;
		
		case 9 : System.out.println("That grade is well above average. Excellent work.");
		break;
		
		case 8 : System.out.println("That grade is above average. Nice job.");
		break;
		
		case 7 : System.out.println("That grade is average work.");
		break;
		
		case 6 : System.out.println("That grade is not grade, you should seek help!");
		break;
		
		case 5 : System.out.println("That grade is not passing.");
		break;
		
		default: System.out.println("That grade is not passing.");
		}
	
	}
}
