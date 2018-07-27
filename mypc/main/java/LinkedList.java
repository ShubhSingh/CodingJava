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
		// If list is empty
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
		//If list is empty
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		// If list is empty
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

	public void deleteAtPosition(int position) {
		// If list is empty
		if(head == null) return;
		Node current = head;

		// If head needs to be removed
        if (position == 0)
        {
            head = current.next;   // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i=0; current!=null && i<position-1; i++)
            current = current.next;
 
        // If position is more than number of n does
        if (current == null || current.next == null)
            return;
 
        Node next = current.next.next;
 
        current.next = next;  // Unlink the deleted node from list
	}

	public void insertAfter(Node prevNode, int data)
	{
	    if (prevNode == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    Node node = new Node(data);
	 
	    node.next = prevNode.next;
	    prevNode.next = node;
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
        
        llist.deleteAtPosition(2); // Delete Node at position 2
        llist.printList();
        
        llist.insertAfter(llist.head.next, 6); // Insert after second node
        llist.printList();
        
        llist.insertAfter(llist.head.next.next.next.next, 8); // Insert after fifth node
        llist.printList();
        
        llist.insertAfter(llist.head.next.next.next, 8); // Insert after fourth node
        llist.printList();
	}

}
