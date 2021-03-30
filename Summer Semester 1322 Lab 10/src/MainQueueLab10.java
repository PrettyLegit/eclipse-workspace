//Jimmy Nguyen
//1322 L
public class MainQueueLab10 {

	public static void main(String[] args) {

		Queue myQueue = new Queue();

		//food array
		String[] foodArr0 = { "Apples ", "350 "};
		String[] foodArr1 = { "Oranges ", "450 "};
		String[] foodArr2 = { "Bannanas ", "550 "};
		
		// enqueue
		myQueue.enqueue(foodArr0);
		myQueue.enqueue(foodArr1);
		myQueue.enqueue(foodArr2);
	
		// displaying
		System.out.print("Initial contents of the queue: ");

		myQueue.display(myQueue);
		System.out.println("\n");

		

		
	}

}
