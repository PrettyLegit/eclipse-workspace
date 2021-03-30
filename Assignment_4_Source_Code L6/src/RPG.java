/* 
Class: CSE 1321L 
Section: 	Assignment 4 Source Code         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
import java.util.Random;

public class RPG {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		
		int heroHP;
		int heroATK;
		int monsterHP;
		int monsterATK;
		int count = 0;
		
		System.out.print("Enter the hero's starting hit points: ");
		heroHP = reader.nextInt();
		
		int HHP = heroHP;
		
		System.out.print("Enter the damage the hero's weapon does per strike: ");
		heroATK = reader.nextInt();
		
		int hATK = heroATK;
		
		System.out.print("Enter the monster's starting hit points: ");
		monsterHP = reader.nextInt();
		
		int MHP = monsterHP;
		
		System.out.print("Enter the monster's damage per strike: ");
		monsterATK = reader.nextInt();
			
		int mATK = monsterATK;
		
		while ( (HHP > 0) && (MHP > 0) ) { 
			
			count++;
			
			//hATK and mATK is made in order to update the attacks. After I notice that the hero attacks were not being updated properly.
			hATK = rand.nextInt(heroATK);
			MHP = MHP - hATK;
			
			mATK = rand.nextInt(monsterATK);
			HHP = HHP - mATK;
			
			if (MHP < 0) {
				System.out.println("====== ROUND " + count + " ======");
				System.out.println("Hero attacks for: " + hATK );
				System.out.println("Monster has " + MHP + " left");	
				System.out.println("The monster dies and you earn 5 XP\n" + 
						"Battle ends...\n");
				break;
			}
			
			if (HHP < 0) {
				System.out.println("====== ROUND " + count + " ======");
				System.out.println("Monster attacks you for: " + mATK);
				System.out.println("You have " + HHP + " left");
				System.out.println("You are killed by the monster and lose 10 gold.\n" + 
						"Battle ends...\n");
				break;
			}
			
			System.out.println("====== ROUND " + count + " ======");
			
			if (HHP > 0) {
				System.out.println("Hero attacks for: " + hATK );
				System.out.println("Monster has " + MHP + " left");	
			}
			
			if (MHP > 0) {
				System.out.println("Monster attacks you for: " + mATK);
				System.out.println("You have " + HHP + " left");
			}
			
			
			
		}
			
	}
}
