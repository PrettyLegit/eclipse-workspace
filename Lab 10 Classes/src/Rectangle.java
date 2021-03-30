/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		10
 */
public class Rectangle {
	
	//declare variables
	private double height = 1.0; 
	private double width = 1.0;
	
	Rectangle()
	{
		height = 1.0;
		width = 1.0;
	}
	
	//constructor
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
		
	}
	
	//methods
	public double getArea() {
		double tempArea = height * width;
		
		return tempArea;
	}
	
	public double getPerimeter() {
		double tempPerimeter = (height * 2.0) + (width * 2.0);
		
		return tempPerimeter;
	}
	
	public double getHeight() {
		double tempHeight = height;
		
		return tempHeight;
	}
	
	public double getWidth() {
		double tempWidth = width;

		return tempWidth;
	}
	
}
