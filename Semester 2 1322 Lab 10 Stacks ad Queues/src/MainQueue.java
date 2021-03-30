
public class MainQueue {
	public static void main(String[] args) {

		Queue myQueue = new Queue();

		// enqueue
		myQueue.enqueue("Tell");
		myQueue.enqueue("Me");
		myQueue.enqueue("Why");
		myQueue.enqueue("Ain't");
		myQueue.enqueue("Nothing");
		myQueue.enqueue("But");
		myQueue.enqueue("A");

		// displaying
		System.out.print("Initial contents of the queue: " + myQueue.display());

		System.out.println("\n");

		System.out.print("Contents before adding another item: " + myQueue.display());

		// pushing
		myQueue.enqueue("Heartbreak");

		System.out.println("\n");
		System.out.println("Added: Heartbreak");

		// displaying
		System.out.println();
		System.out.print("Contents after adding another item: " + myQueue.display());

		System.out.println("\n");

		System.out.print("Contents before removing another item: " + myQueue.display());

		// removing
		myQueue.dequeue();
		System.out.println("\n");
		System.out.println("Removed: Tell");

		// displaying
		System.out.print("\n");
		System.out.print("Contents after removing another item: " + myQueue.display());

		//displaying
		System.out.println("\n");
		System.out.print("Contents before peeking a value from the stack: " + myQueue.display());
		
		
		//peeking
		System.out.print("\n\nPeeked: " + myQueue.peek());
		
		//displaying
		System.out.println("\n");
		System.out.print("Contents after peeking a value from the stack: " + myQueue.display());
		
		
	}

}
