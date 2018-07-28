package main.java;

// Renamed from Node to QueueNode because the package has other classes like LinkedList creating Node class
class QueueNode {
	int data;
	QueueNode next;
	QueueNode(int data) {
		this.data = data;
	}
}

public class Queue {
	private QueueNode head; // remove from head
	private QueueNode tail; // add things here
	
	public boolean isEmpty() {
		return head==null;
	}

	public int peek() {
		return head.data;
	}
	
	public void add(int data) {
		QueueNode node = new QueueNode(data);
		if(tail!=null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
	}

	public int remove() {
		int data = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return data;
	}

	public void printQueue() {
		QueueNode current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println("Check Queue is empty : "+q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.printQueue();
		System.out.println("Start element in queue : "+q.peek());
		System.out.println("Remove "+q.remove()+" from start of the queue");
		System.out.println("Remove "+q.remove()+" from start of the queue");
		System.out.println("Remaining elements in queue :");
		q.printQueue();
	}

}
