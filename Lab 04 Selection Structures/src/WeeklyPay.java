
/* 
Class:	CSE 1321L 
Section: 	Lab 4          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		4
 */
import java.util.Scanner;

public class WeeklyPay {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the hours you worked.");
		double hours;
		double rate = 10.00;
		double overtime = (rate * 0.5);
		double overGross;
		double gross;

		hours = reader.nextDouble();
		System.out.println("You entered " + hours + ".");
		if (hours > 40) {
			gross = hours * rate;
			hours = hours - 40;
			overGross = hours * overtime;
			gross = gross + overGross;
		} else {
			gross = hours * rate;
		}
		System.out.println("Gross earnings is: " + "$" + gross + ".");
	}
}
