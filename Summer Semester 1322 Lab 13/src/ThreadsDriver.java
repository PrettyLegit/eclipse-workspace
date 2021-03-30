//Jimmy Ngugen
//1322L
public class ThreadsDriver {
	public static void main(String[] args) {
		
		System.out.println("Program will Now Start: ");
		Thread threadOne = new Thread(new Threads("Thread 1"));
		Thread threadTwo = new Thread(new Threads("Thread 2"));
		
		threadOne.start();
		threadTwo.start();
	}
}
