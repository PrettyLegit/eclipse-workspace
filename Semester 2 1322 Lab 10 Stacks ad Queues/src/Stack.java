//import LinkedListClass.Node;
import java.util.*;
public class Stack {

	StackNode root;

	static class StackNode {
		String data;
		StackNode next;

		StackNode(String data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	public void push(String data) {
		StackNode newNode = new StackNode(data);
		// that will make a new StackNode object using the constructor

		if (root == null) {
			root = newNode;
		} else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}

		
	}

	public String pop() {
		String popped = "";

		if (root == null) {
			System.out.println("Stack is empty");
		} else {
			popped = root.data;
			root = root.next;
		}

		return popped;
	}

	public String peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return root.data;
		}
	}
	
	public void display(Stack s) {
		// If stack is empty then return
		if (s.isEmpty())
			return;

		String x = s.peek();

		// Pop the top element of the stack
		s.pop();

		// Recursively call the function PrintStack
		display(s);

		// Print the stack element starting
		// from the bottom
		System.out.print(x + ", ");

		// Push the same element onto the stack
		// to preserve the order
		s.push(x);
	}
	
}
