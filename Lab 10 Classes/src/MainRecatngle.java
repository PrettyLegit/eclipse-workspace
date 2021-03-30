/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		10
 */
public class MainRecatngle {

	public static void main(String[] args) {
		
		System.out.println("First object: ");

		Rectangle rec1 = new Rectangle();

		System.out.println("Height: " + rec1.getHeight());
		System.out.println("Width: " + rec1.getWidth());
		System.out.println("Area: " + rec1.getArea());
		System.out.println("Perimeter: " + rec1.getPerimeter());
		// System.out.println(rec1.toString());

		System.out.print("\n");

		System.out.println("Second object: ");

		Rectangle rec2 = new Rectangle(5, 6);

		System.out.println("Height: " + rec2.getHeight());
		System.out.println("Width: " + rec2.getWidth());
		System.out.println("Area: " + rec2.getArea());
		System.out.println("Perimeter: " + rec2.getPerimeter());
		// System.out.println(rec2.toString());
	}
}