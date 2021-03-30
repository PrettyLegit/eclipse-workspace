
/* 
Class: CSE 1321L 
Section: 	Assignment 3 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
public class Story {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String firstInput;
		String secondInput;
		
		System.out.println("It is a dark and stormy night.  Do you want to take an umbrella?  (Y/N): ");
		
		
		firstInput = reader.nextLine();
		
		if (firstInput.equals("Y")) {
			System.out.println("Good - you have an umbrella.");
			
			if (firstInput.equals("Y")) {
				System.out.println("You start to walk down a path and hear a scream.  You realize that the person screaming is YOU because you see a wolf!  Do you fight with your umbrella or run? ((F)ight/(R)un): ");
				secondInput = reader.nextLine();
				
				if (secondInput.contentEquals("F")) {
					System.out.println("“You take out your umbrella and jab it into the wolf's paw!  It runs away and you live another day.”");
				}else { 
					System.out.println("You begin running so fast, the umbrella opens and you fly away like Mary Poppins.  You're a little embarrassed, but you see the wolf fading off in the distance.");
			}
			}
		}
		else if (firstInput.equals("N")) {
			System.out.println("You decide not to take an umbrella.");
			
			if (firstInput.equals("N")) {
				System.out.println("You start to walk down a path and hear a scream.  You realize that the person screaming is YOU because you see a wolf!  Do you fight with your umbrella or run? ((F)ight/(R)un): ");
				secondInput = reader.nextLine();
				
				if (secondInput.contentEquals("F")) {
					System.out.println("You begin fighting the wolf only to realize you had just eaten a McGrease® meal earlier.  You fall dead from rigorous exercise, having had a heart attack.");
			}
			else 
			{
				System.out.println("Are you serious? You can't outrun a wolf!  The wolf catches you and you are somewhat relieved because you don't have to worry about that Calculus exam…");
			}
			}
		}	
				
	}
}