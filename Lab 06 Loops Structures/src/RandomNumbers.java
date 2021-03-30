/* 
Class: CSE 1321L 
Section: 	Lab 6         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		6
 */
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		
		
		
		int randomNum; 
		
		for (int i = 1; i <=10; i++) {
			Random rand = new Random();
			randomNum = rand.nextInt(50) + 1;
			
			System.out.println(randomNum);
		}	
	
	}
}
