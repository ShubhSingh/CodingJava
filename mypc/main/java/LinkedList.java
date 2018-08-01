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

	/* deletes the entire linked list */
    void deleteList()
    {
        head = null;
    }
    
    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node current = head;
        int count = 0;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }

    /* Checks whether the value x is present in linked list */
    public boolean search(int x)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }

    /* Takes index as argument and return data at index*/
    public int getNth(int index)
    {
        Node current = head;
        int count = 0;
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
 
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert(false);
        return 0;
    }
    
    /* Function to get the nth node from the last of a linked list */
    public void printNthFromLast(int n)
	 {
    	int len = getCount();
	
	     if (len < n)
	         return;
	
	     Node temp = head;
	
	     // 2) get the (len-n+1)th node from the begining
	     for (int i = 1; i < len-n+1; i++)
	         temp = temp.next;
	
	     System.out.println(temp.data);
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
        
        System.out.println("Count of nodes is: " +llist.getCount());
        
        System.out.println("Check list contains 4: "+llist.search(4));
        
        System.out.println("Element at index 3 is "+llist.getNth(2));
        
        System.out.print("3rd node from last: ");
        llist.printNthFromLast(3);
	}

}
