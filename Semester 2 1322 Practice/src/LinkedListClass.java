/*
 * 03.20.2020
 * 
 */
import java.util.Scanner;

public class LinkedListClass {

	private Node first;

	class Node {
		public int num;
		public Node next;
	}

	public LinkedListClass() {
		first = null;
	}

	public void addNode(int n) {
		Node newNode = new Node();

		newNode.num = n;
		newNode.next = first;
		first = newNode;
	}

	public void addBack(int n) {
		Node temp = new Node();

		temp.num = n;
	Node current = first;

		while (current.next != null) {
			current = current.next;
		}

		current.next = temp;
	}

	public void remove(int n) {
		Node curr = first;
		Node prev = curr;

		if (curr.num == n) {
			first = curr.next;
			return;
		}

		while (curr.num != n) {
			prev = curr;
			curr = curr.next;

			if (curr == null) {
				return;
			}
		}

		prev.next = curr.next;
		;
	}

	public String display() {
		Node current = first;
		String data = "";

		while (current.next != null) {
			data += " " + current.num + ", ";
			current = current.next;
		}

		data += " " + current.num + ", ";
		return data;
	}

	public void AddTen() {
		Node n = first;
		AddTen(n);
	}

	public void AddTen(Node n) {

		if (n != null) {
			n.num += 10;
			AddTen(n.next);
		}
	}
	
	/*
	 * 
	 * main method below
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		LinkedListClass LL = new LinkedListClass();
		
		System.out.println(LL);
		
		LL.addNode(7);
		LL.addNode(1);
		LL.addNode(4);
		
		System.out.println("Round 1 " + LL.display());
		
		LL.remove(5);
		
		System.out.println("Round 2 " + LL.display());
		
		LL.remove(9);
		
		System.out.println("Round 3 " + LL.display());
		
		LL.addNode(8);
		
		System.out.println("Round 4 " + LL.display());
		
		LL.addNode(3);
		
		System.out.println("Round 5 " + LL.display());
		
		LL.AddTen();
		
		System.out.println("Round 6 " + LL.display());
	}
}
