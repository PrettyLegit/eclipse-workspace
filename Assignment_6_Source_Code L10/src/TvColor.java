/* 
Class: CSE 1321L 
Section: 	Assignemnt 6 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
public class TvColor {

	//attributes
	int r = 0;
	int g = 0;
	int b = 0;
	
	//constructor
	TvColor(int r, int g, int b) {
		
		this.r = r;
		this.g = g;
		this.b = b;
		
	}
	
	public void setUpRed(int input) {
		if(input == 1) {
			if(r < 255) {
				r += 1;
			} 
		}
	}
	
	public void setDownRed(int input) {
		if(input == 2) {
			if(r > 0) {
				r -= 1;
			} 
		}
	}
	
	public void setUpGreen(int input) {
		if(input == 3) {
			if(g < 255) {
				g += 1;
			}
		}
	}
	
	public void setDownGreen(int input) {
		if(input == 4) {
			if(g > 0) {
				g -= 1;
			} 
		}
	}
	
	public void setUpBlue(int input) {
		if(input == 5) {
			if(b < 255) {
				b += 1;
			} 
		}
	}
	
	public void setDownBlue(int input) {
		if(input == 6) {
			if(b > 0) {
				b -= 1;
			} 
		}
	}	
	
	public String toString() {
		return "R: " + this.r + " G: " + this.g + " B: " + this.b + " L: " + this.luminance(); 
	}
		
	public double luminance() {
		double luminance = (0.2126 * this.r) + (0.7152 * this.g) + (0.0722 * b);
		
		return luminance;
	}
	
	public int inverseRed() {
		int inverseRed = (255 - this.r);
		
		return inverseRed;
	}
	
	public int inverseGreen() {
		int inverseGreen = (255 - this.g);
		
		return inverseGreen;
	}
	
	public int inverseBlue() {
		int inverseBlue = (255 - this.b);
		
		return inverseBlue;
	}
	
}
