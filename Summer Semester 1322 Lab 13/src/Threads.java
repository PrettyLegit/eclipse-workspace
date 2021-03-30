//Jimmy Ngugen
//1322L
import java.util.Random;

public class Threads implements Runnable {

	int time;
	String name;
	Random randomTimer = new Random();

	public Threads(String name) {
		this.name = name;
		
		//putting 1000 ranges from 0-999 so we add 1 to get the full range
		time = randomTimer.nextInt(1000) + 1;
	}

	@Override
	public void run() {
		try {
			System.out.println("My name is " + name + ", I am going to sleep after: " + time + " ms");
			Thread.sleep(time);
			System.out.println("My name is " + name + ", I am going awake now");
		}catch (InterruptedException ignored) {
			
		}

	}
}
