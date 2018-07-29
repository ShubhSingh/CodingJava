package main.java;

class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
    }
}

public class MyDoublyLinkedList {

	DNode head;

	public void append(int data) {
		DNode newNode = new DNode(data);
		// If list is empty
		if(head == null) {
			head = newNode;
			return;
		}
    	DNode current = head;
    	while(current.next!=null) {
    		current = current.next;
    	}
    	current.next = newNode;
    	newNode.prev = current;
    }

	public void prepend(int data) {
		//If list is empty
		if(head == null) {
			head = new DNode(data);
			return;
		}
		DNode newHead = new DNode(data);
		newHead.next = head;
		if (head != null)
	        head.prev = newHead;
		head = newHead;
	}
	
	/*public void deleteWithValue(int data) {
		// If list is empty
		if(head == null) return;
		if(head.data == data) {
			head = head.next;
			return;
		}
		DNode current = head;
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
		DNode current = head;

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
 
        DNode next = current.next.next;
 
        current.next = next;  // Unlink the deleted node from list
	}*/

	void deleteNode(DNode del) {

		/* base case */
		if (head == null || del == null) {
			return;
		}

		/* If node to be deleted is head node */
		if (head == del) {
			head = del.next;
		}

		/* Change next only if node to be deleted is NOT the last node */
		if (del.next != null) {
			del.next.prev = del.prev;
		}

		/* Change prev only if node to be deleted is NOT the first node */
		if (del.prev != null) {
			del.prev.next = del.next;
		}

		/* Finally, free the memory occupied by del*/
		return;
	}
	
	public void insertAfter(DNode prevNode, int data)
	{
	    if (prevNode == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    DNode newNode = new DNode(data);
	 
	    newNode.next = prevNode.next;
	    prevNode.next = newNode;
	    newNode.prev = prevNode;
	    
	    if (newNode.next != null)
	    	newNode.next.prev = newNode;
	}
	
	public void printList(DNode node)
    {
		DNode last = null;
	        System.out.print("Traversal in forward Direction: ");
	        while (node != null) {
	            System.out.print(node.data + " ");
	            last = node;
	            node = node.next;
	        }
	        System.out.println();
	        System.out.print("Traversal in reverse direction: ");
	        while (last != null) {
	            System.out.print(last.data + " ");
	            last = last.prev;
	        }
	        System.out.println();
	        System.out.println();
    }
	
	public static void main(String[] args) {

		MyDoublyLinkedList llist = new MyDoublyLinkedList();
		 
        llist.append(4); // Add 4 at last
        llist.prepend(5); // Add 5 at start
        llist.printList(llist.head);
       
        System.out.println("Delete last node");
        llist.deleteNode(llist.head.next); // Delete Node at last
        llist.printList(llist.head);
        
        llist.insertAfter(llist.head, 6); // Insert after head node
        
        llist.insertAfter(llist.head.next, 8); // Insert after second node
        
        llist.insertAfter(llist.head.next.next, 10); // Insert after third node
        llist.printList(llist.head);
        
        System.out.println("Delete head node");
        llist.deleteNode(llist.head); // Delete Node at head
        llist.printList(llist.head);

        System.out.println("Delete middle node");
        llist.deleteNode(llist.head.next); // Delete Node at middle
        llist.printList(llist.head);
	}

}
