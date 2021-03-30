
public class exponetial_recursion {
	
	static int power(int x, int y) {
		if(y==1) {
			return x;
		}
		else {
			return x * power(x,y-1);
		}
	}
	
	//public void 
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		System.out.println("The " + x + " to the power " + y + " is: " + power(x,y));
		
	}
	
}
