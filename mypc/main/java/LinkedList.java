package main.java;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

	Node head;

	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
    	Node current = head;
    	while(current.next!=null) {
    		current = current.next;
    	}
    	current.next = new Node(data);
    }

	public void prepend(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		if(head == null) return;
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next!=null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		 
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.printList();
        
        llist.append(4); // Add 4 at last
        llist.printList();
        
        llist.prepend(5); // Add 5 at start
        llist.printList();
        
        llist.deleteWithValue(2); // Delete Node with value 2
        llist.printList();
	}

}
