//Jimmy Nguyen
//1322 L
public class ClothingArray {
	StackNode root;

	static class StackNode {
		String[] data;
		StackNode next;

		StackNode(String[] clothesArr0) {
			this.data = clothesArr0;
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	public void push(String[] clothesArr0) {
		StackNode newNode = new StackNode(clothesArr0);
		// that will make a new StackNode object using the constructor

		if (root == null) {
			root = newNode;
		} else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}

	}

	public String[] pop() {
		String[] popped = null;

		if (root == null) {
			System.out.println("Stack is empty");
		} else {
			popped = root.data;
			root = root.next;
		}

		return popped;
	}

	public String[] peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return root.data;
		}
	}

	public void display(ClothingArray s) {
		// If stack is empty then return
		if (s.isEmpty())
			return;

		String[] x = s.peek();

		// Pop the top element of the stack
		s.pop();

		// Recursively call the function PrintStack
		display(s);

		// Print the stack element starting
		// from the bottom
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}

		System.out.println();
		// Push the same element onto the stack
		// to preserve the order
		s.push(x);
	}

	public void displayHot(ClothingArray s) {
		// If stack is empty then return
		if (s.isEmpty())
			return;

		String[] x = s.peek();
		int hotCount = 0;
		// Pop the top element of the stack
		s.pop();

		// Recursively call the function PrintStack
		displayHot(s);

		// Print the stack element starting
		// from the bottom

		if (x[2].contains("Warm Wash ")) {
			hotCount++;
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i]);
			}
			System.out.println("Clothes that can be washed with hot water: " + hotCount);
		}

		// Push the same element onto the stack
		// to preserve the order
		s.push(x);
	}

	public void displayWhite(ClothingArray s) {
		// If stack is empty then return
		if (s.isEmpty())
			return;

		String[] x = s.peek();

		// Pop the top element of the stack
		s.pop();

		// Recursively call the function PrintStack
		displayWhite(s);

		// Print the stack element starting
		// from the bottom

		for (int i = 0; i < x.length; i++) {

			if (x[1].contains("White ")) {
				System.out.print(x[i]);
			}

		}
		System.out.println();
		// Push the same element onto the stack
		// to preserve the order
		s.push(x);
	}
}
