/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		11
 */
public class Circle {

	private double radius = 1;

	Circle() {

		radius = 1;

	}

	Circle(double input) {
		this.radius = input;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double input) {
		this.radius = input;
	}

	public double getArea() {
		double area = Math.PI * (radius * radius);
		area *= 100;
		area = (int) area;
		area /= 100.0;

		return area;
	}

	public double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		perimeter *= 100;
		perimeter = (int) perimeter;
		perimeter /= 100.0;
		return perimeter;
	}

	@Override
	public String toString() {

		/*
		 * by default this string is set to the "user input" statement, but i put this
		 * IF statement here to determine save lines of code. there are other ways to do
		 * this
		 */
		String outputRadius = "Set radius to " + this.radius + " and print the object:\n";

		outputRadius = "Print radius:\n \tThe radius is " + this.radius + "\n";

		String outputArea = "Print area:\n \tThe area is " + getArea() + "\n";
		String outputPerimeter = "Print perimeter:\n \tThe perimeter is " + getPerimeter();

		return outputRadius + outputArea + outputPerimeter;
	}
}
