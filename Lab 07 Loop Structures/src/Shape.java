/* 
Class: CSE 1321L 
Section: 	Lab 7        
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		7
 */
public class Shape {
	public static void main(String[] args) {
		
		int maxRows = 8;
		int space = 7;
		int stars = 1;
	
		for (int x = 1; x <= maxRows; x++) {
			System.out.println();
			for (int y = 1; y <= space; y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= stars; z++) {
				System.out.print("*");
			}
		space -= 1;
		stars += 2;
		}
		
			
			

			  
	}
}


