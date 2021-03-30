import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String fullTextFile = ""; // Will hold the contents of the file.

		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processor cores is " + cores);

		// First step is to get the text from a file.
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("alice.txt.txt"));

			String oneLine = "";

			while (oneLine != null) {
				fullTextFile += oneLine;
				oneLine = bufferedReader.readLine();
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File was not found.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		// Second step is to have the cores find "the" in some subsection of the full
		// text.
		// Using data parallelism to break up the full text.

		// This should use 0 - 1/4 of the text.
		MyThread myThread = new MyThread(fullTextFile.substring(0, fullTextFile.length() / 4));
		// Thread is similar to Callable and Runnable classes.

		// This should use 1/4 - 1/2 of the text.
		MyThread myThread1 = new MyThread(
				fullTextFile.substring(fullTextFile.length() / 4, (fullTextFile.length() / 4) * 2));

		// This should use 1/2 - 3/4 of the text.
		MyThread myThread2 = new MyThread(
				fullTextFile.substring((fullTextFile.length() / 4) * 2, (fullTextFile.length() / 4) * 3));

		// This should use 3/4 - 1 (or the end) of the text.
		MyThread myThread3 = new MyThread(fullTextFile.substring((fullTextFile.length() / 4) * 3));

		//System.out.println("Number of times the appeared: " + myThread.count);

		// Will let us use the run method from our thread class,
		// without having our main method wait for it.
		myThread.start();
		myThread1.start();
		myThread2.start();
		myThread3.start();

		// Once we are all done making threads,
		// we need to wait until all the threads are done so that we can get an accurate
		// count.
		try {
			myThread3.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		int count = myThread.count + myThread1.count + myThread2.count + myThread3.count;
		System.out.println("Number of times the appeared: " + count);
	}
}
