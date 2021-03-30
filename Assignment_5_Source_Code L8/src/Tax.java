/* 
Class: CSE 1321L 
Section: 	Assignemnt 5 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class Tax {
	
	public static float saleryCalc(float wage, float weeklyHours) {
		//just realized i made local variables called localWage, when float wage is already an existing local variable to this method
		float localAnnual = 0;
		
		localAnnual = wage * weeklyHours * 52;
		
		return localAnnual;
	}
	
	public static float socialCalc(float salery) {
		
		float localSocialSecurityTax;
		float localTaxRate = (float) (6.2/100.0);
		
		localSocialSecurityTax = salery * localTaxRate;
		
		return localSocialSecurityTax;
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		float wage;
		float weeklyHours;
		
		System.out.println("Enter hourly wage: ");
		wage = reader.nextFloat();
		
		System.out.println("Enter your hours per week: ");
		weeklyHours = reader.nextFloat();
		
		float salery = saleryCalc(wage, weeklyHours);
		
		System.out.println("You will earn: " + salery);
		
		float socialTax = socialCalc(salery);
		
		System.out.println("You will pay " + socialTax + " in Social Security tax");
	}
}
