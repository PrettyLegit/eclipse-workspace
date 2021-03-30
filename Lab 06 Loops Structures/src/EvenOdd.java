/* 
Class: CSE 1321L 
Section: 	Lab 6         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		6
 */

public class EvenOdd {
	public static void main(String[] args) {
		
		int even = 50;
		int odd = 51;
			
			System.out.print("Even numbers between 50 and 100: ");

			while (even < 100) {
				System.out.print(even + ", ");
				even += 2;
				if (even == 100) {
					System.out.println("and " + even + ".");
				}
			}

			System.out.print("Odd numbers between 50 and 100: ");
					
			while (odd < 99) {
				System.out.print(odd + ", ");
				odd += 2;
				if (odd == 99) {
					System.out.print("and " + odd + ".");
				}
			}
			
	}
}
