/* 
Class: CSE 1321L 
Section: 	Lab 7        
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		7
 */
import java.util.Scanner;
public class SumEven {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		
		int numInput;
		int sumNum = 0;
		int oddCheck;
		
		System.out.println("Enter a number between 20 and 60");
		numInput = reader.nextInt();
		
		System.out.println("Number entered: " + numInput);
		
		if ( (numInput >= 20) && (numInput <= 60) ) {
			
			oddCheck = numInput % 10;
			
			if ( (oddCheck == 3) || (oddCheck == 5) || (oddCheck == 7) || (oddCheck == 9) ) {
					numInput -= 1;
				}
				
			while (numInput > 0) {
				sumNum = sumNum + numInput;
				numInput -= 2;
				
			}
			System.out.println("Sum of even numbers is: " + sumNum);
		}else {
			System.out.println("TRY AGAIN");
		}
		
		
	}
}
