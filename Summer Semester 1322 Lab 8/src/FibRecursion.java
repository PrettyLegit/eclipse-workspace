//Jimmy Nguyen
//1322 Summer Lab
public class FibRecursion {
	
	String myFib = "";
	
	public int fib(int n) {
		if (n <= 1) {
			return n;
		}
		else
		return fib(n - 1) + fib(n - 2);
	}

	public int Calculate(int n) {
		myFib += fib(n);
		return fib(n);
	}

	@Override
	public String toString() {
		return myFib;

	}


}
