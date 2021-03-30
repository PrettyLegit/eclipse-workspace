
public class LinkedList {

	private Node first;
	public int position = -1;
	
	class Node {
		// now the node can store an object, neat.
		public Object data;
		public Node next;
		public int count;
		
	}

	public LinkedList() {
		first = null;
	}

//	public void addNode(Object BirdSpecies) {
//		Node newNode = new Node();
//
//		newNode.data = BirdSpecies;
//		newNode.next = first;
//		first = newNode;
//	}

	// adds a node to the back
	public void push(Object BirdSpecies) {
		Node newNode = new Node();

		if (!(isSame(BirdSpecies))) {

			if(first == null) {
				//first = newNode;
			}else {
				Node temp = first;
				first = newNode;
				newNode.next = temp;
			}
			
		}

		position++;
		
	}

	public void remove(String d) {
		Node curr = first;
		Node prev = curr;

		if (curr.data == d) {
			first = curr.next;
			return;
		}

		while (curr.data != d) {
			prev = curr;
			curr = curr.next;

			if (curr == null) {
				return;
			}
		}

		prev.next = curr.next;
		
	}

	public String display() {
		Node current = first;
		String data = "";

		while (current.next != null) {
			data += " " + current.data + ", ";
			current = current.next;
		}

		data += " " + current.data + ", ";
		return data;
	}

	public boolean isSame(Object BirdSpecies) {
		Node temp1 = null;
		Node temp2 = null;
		Node duplicate = null;

		temp1 = first;

		/* Pick elements one by one */
		while (temp1 != null && temp1.next != null) {

			temp2 = temp1;

			/* Compare the picked elements with the rest of the elements */
			while(temp2.next != null) {
				/*If duplicate then we will not add it and we will update count*/
				if(temp1.data == temp2.next.data) {
					first.count++;
					System.out.println("derr");
					return true;
				}
			}
		}
//		if (first.data == BirdSpecies) {
//			
//
//		}
		return false;

	}
	
	public int getPosition(LinkedList myList) {
		return myList.position;
	}

	public int getCount(Node first) {

		return first.count;
	}
}
