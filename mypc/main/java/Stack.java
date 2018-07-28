package main.java;

// Renamed from Node to StackNode because the package has other classes like LinkedList creating Node class
class StackNode {
	int data;
	StackNode next;
	StackNode(int data) {
		this.data = data;
	}
}

public class Stack {

	private StackNode top;
	
	public boolean isEmpty() {
		return top==null;
	}

	public int peek() {
		return top.data;
	}
	
	public void push(int data) {
		StackNode node = new StackNode(data);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}

	public void printStack() {
		StackNode current = top;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Check Stack is empty : "+stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println("Top most element in stack : "+stack.peek());
		System.out.println("Pop "+stack.pop()+" from top of the stack");
		System.out.println("Pop "+stack.pop()+" from top of the stack");
		System.out.println("Remaining element in stack :");
		stack.printStack();
	}

}
