/* 
Class: CSE 1321L 
Section: 	Assignemnt 5 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class Insult {
	
	public static void fightingWords(String name) {
		
		Scanner reader = new Scanner(System.in);
		
		String localChoice = "yes";
		int count = -1;
		
		System.out.println(name + " I want you to know that you are a loser.");
		
		while (localChoice.equals("yes")) {
			
			System.out.println("Do you want me to stop hurting your feelings? [yes/no] ");
			localChoice = reader.next();
			//nested loops are kinda hot
			if (localChoice.equals("no")) {
				System.out.println("You're too clingy, like my ex-wife. BE GONE.");
				break;
			}
			count++;
			System.out.print(name);
			//calling another method to print more insults.
			listInsult(count);
		}
	}
	
	public static void listInsult(int count) {
		
		switch (count) {
		case 0: 
			System.out.println(" too bad! Your bottom lip should meet your upper lip, "
					+ "and you should sip it. You're stuck with me." );
			break;
		
		case 1: 
			System.out.println(" yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up.");
			break;
			
		case 2:
			System.out.println(" go to bed, or I'll sell all your toys.");
			break;
			
		case 3:
			System.out.println(" yo momma is so fat, I took a picture of her last Christmas and it's still printing.");
			break;	
			
		case 4:
			System.out.println(" you're probably wondering why I would program such a things, "
					+ "but who's the real loser here: the one who programed, or the one that still hits 'yes'? ");
			break;
			
		default: 
			System.out.println(" I have nothing to say to you. Reply no.");
			break;
		}
	}
	
	
	public static void main(String [] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String name = "";
		
		System.out.print("Enter your name: ");
		name = reader.next();
		
		fightingWords(name);
		
	}
}
