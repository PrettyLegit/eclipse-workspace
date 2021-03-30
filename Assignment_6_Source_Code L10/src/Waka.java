/* 
Class: CSE 1321L 
Section: 	Assignemnt 6 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
public class Waka {

	//attributes
	private int x = 5;
	private int y = 5;
	
	//constructor
	Waka(){
		
		x = 5;
		y = 5;
		
	}
	
	/*Waka(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}*/
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public void setUp(char userInput) {
		if(userInput == 'U') {
			if(y <= 0) {
				y = 9;
			} else {
				y -= 1;
			}
		}
	}
	
	public void setDown(char userInput) {
		if(userInput == 'D') {
			if(y >= 9) {
				y = 0;
			} else {
				y += 1;
			}
		}
	}
	
	public void setLeft(char userInput) {
		if(userInput == 'L') {
			if(x <= 0) {
				x = 9;
			} else {
				x -= 1;
			}
		}
	}
	
	public void setRight(char userInput) {
		if(userInput == 'R') {
			if(x >= 9) {
				x = 0;
			} else {
				x += 1;
			}
		}
	}

}
