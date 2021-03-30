
class QueueNode {
	String key;
	QueueNode next;

	// making a constructor for a linked list node
	public QueueNode(String key) {
		this.key = key;
		this.next = null;
	}
}

public class Queue {

	QueueNode front;
	QueueNode rear;

	public Queue() {
		this.front = this.rear = null;
	}

	// this method will add a key to the queue
	public void enqueue(String key) {

		// we will make a new linklist node
		QueueNode temp = new QueueNode(key);

		// if the queue is empty then new node is front and rear too
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// now add the new node at the end of queue and change rear
		this.rear.next = temp;
		this.rear = temp;
	}

	// method to remove a key from queue
	public void dequeue() {

		// if the queue is empty, return null
		if (this.front == null) {
			return;
		}

		// now store previous front and move front one node ahead
		//QueueNode temp = this.front;
		this.front = this.front.next;

		// if front becomes null, then change rear also as null
		if (this.front == null) {
			this.rear = null;
		}
	}

	public String peek() {
		if (front == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return front.key;
		}
	}

	public String display() {
		QueueNode current = front;
		String data = "";

		while (current.next != null) {
			data += " " + current.key + ", ";
			current = current.next;
		}

		data += " " + current.key + ", ";
		return data;
	}

}
