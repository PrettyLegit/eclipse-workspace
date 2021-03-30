//Jimmy Nguyen
//1322 Summer Lab
public class MainFib {
	
	public static void main(String args[]) {
		int n = 10;
		
		FibIteration f1 = new FibIteration();
		f1.Calculate(n);
		
		FibFormula f2 = new FibFormula();
		f2.Calculate(n);
		
		FibRecursion f3 = new FibRecursion();
		f3.Calculate(n);
		
		
		System.out.println("For n = " + n);
		System.out.println("FibIteration returns: " + f1.toString());
		System.out.println("FibFormula returns: " + f2.toString());
		System.out.println("FibRecursion returns: " + f3.toString());
	}
}
