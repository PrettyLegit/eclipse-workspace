
public class FibFormula {
	//Jimmy Nguyen
	//1322 Summer Lab
	String myFib = "";
	
	public int fib(int n) {

		double fib = 0;
		
		double mathSqrt = Math.sqrt(5);
		
		//(((1+sqrt(5))/2)^n  
		double firstHalf =  (Math.pow( ( (1 + mathSqrt) / 2), n));
		//((1-sqrt(5))/2)^n) / sqrt(5)
		double secondHalf = (Math.pow( ( (1 - mathSqrt) / 2), n));
		
		fib = (firstHalf - secondHalf) / mathSqrt;
		myFib += fib;// i could cast to int but idk 
		return (int)fib;
	}
	
	public int Calculate(int n) {

		return fib(n);
	}

	@Override
	public String toString() {
		return myFib;

	}
}
