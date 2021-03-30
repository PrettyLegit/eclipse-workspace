//Jimmy Nguyen
//1322 Summer Lab
public class FibIteration implements FindFib {

	String myFib = "";
	
	public int fib(int n) {
		
		int fib[] = new int[n + 2]; //handles n = 0 special case
		int i;

		fib[0] = 0;
		fib[1] = 1;

		for (i = 2; i <= n; i++) {

			fib[i] = fib[i - 1] + fib[i - 2];//sums the last two numbers to get the next
		}
		myFib += fib[n];
		return fib[n];
	}

	public int Calculate(int n) {
		
		return fib(n);
	}

	@Override
	public String toString() {
		return myFib;
		
	}

}
