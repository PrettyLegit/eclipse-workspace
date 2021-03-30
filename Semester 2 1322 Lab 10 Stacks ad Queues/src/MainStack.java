
public class MainStack {
	public static void main(String[] args) {

		Stack myStack = new Stack();

		//pushing
		myStack.push("I");
		myStack.push("Want");
		myStack.push("It");
		myStack.push("That");
		
		//displaying
		System.out.print("Initial contents of the stack: ");
		myStack.display(myStack);
	
		System.out.println("\n");

		System.out.print("Contents before adding another item: ");
		myStack.display(myStack);
		
		//pushing
		myStack.push("Way");
		System.out.println("\n");
		System.out.println("Added: Way");
		
		
		//displaying
		System.out.println();
		System.out.print("Contents after adding another item: ");
		myStack.display(myStack);
		
		System.out.println("\n");
		
		System.out.print("Contents before removing another item: ");
		myStack.display(myStack);
		
		//removing 
		myStack.pop();
		System.out.println("\n");
		System.out.println("Removed: Way");
		
		//displaying
		System.out.print("\n");
		System.out.print("Contents after removing another item: ");
		myStack.display(myStack);
		
		//displaying
		System.out.println("\n");
		System.out.print("Contents before peeking a value from the stack: ");
		myStack.display(myStack);
		
		//peeking
		System.out.print("\n\nPeeked: " + myStack.peek());
		
		//displaying
		System.out.println("\n");
		System.out.print("Contents after peeking a value from the stack: ");
		myStack.display(myStack);
	}

}
