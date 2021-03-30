
public class LinkedList1<ListType> {
	
	Node<ListType> first, second;
	
	public LinkedList1() {
		
	}
	
	public void AddLast(ListType data) {
		//Case 0: List is empty
		if(this.first == null) {
			this.first = new Node<ListType>(data);
			return;
		}
		//Case 1: List is not empty, add to the end 
		Node<ListType> temp = this.first;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = new Node<ListType>(data);
		
		
	}
	
	public void RemoveLast() {
		//Case 0: the list is empty, do nothing
		if(this.first == null) {
			return;
		}
		//Case 1: at least 1 thing in the list, remove last one.
		Node<ListType> temp = this.first;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
	}
	public int Length() {
		int counter = 0;
		Node<ListType> temp = this.first;
		
		while(temp != null) {
			temp = temp.next;
			counter++;
		}
		return counter;
	}
	
	public ListType Get(int index) {
		Node<ListType> temp = this.first;
		
		int counter = 0;
		
		while(counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp.data;
	}
	
	//AnyType refers to any type of data is allowed to be stored
	class Node <AnyType> {
		AnyType data;
		Node<AnyType> next;
		
		public Node(AnyType data) {
			this.data = data;
			this.next = null;
		}
		
	}

	
}
