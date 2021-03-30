//Jimmy Nguyen
//1322 L
public class MainStackLab10 {
	public static void main(String[] args) {

		ClothingArray myStack = new ClothingArray();

		// adding clothes to as a string array
		String[] clothesArr0 = { "Shirt ", "Blue ", "Warm Wash " };
		String[] clothesArr1 = { "Pants ", "White ", "Cold Wash " };
		String[] clothesArr2 = { "Sweater ", "White ", "Cold Wash " };
		// pushing
		myStack.push(clothesArr0);
		myStack.push(clothesArr1);
		myStack.push(clothesArr2);

		// displaying
		System.out.println("Contents of stack:");

		myStack.display(myStack);

		System.out.println("\n");

		System.out.println("Displaying clothes that are hot wash:");

		myStack.displayHot(myStack);

		System.out.println("\n");
		
		System.out.println("Displaying clothes that are white:");
		myStack.displayWhite(myStack);
	}
}
