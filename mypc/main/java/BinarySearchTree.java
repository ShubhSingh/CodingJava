package main.java;

class BSTNode{
	BSTNode left,right;
	int data;
	BSTNode(int data) {
		this.data=data;
	}
	
	public void insert(int value) {
		if(value <= data) {
			if(left == null) {
				left = new BSTNode(value);
			}
			else {
				left.insert(value);
			}
		}
		else {
			if(right == null) {
				right = new BSTNode(value);
			}
			else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value==data) {
			return true;
		}
		else if(value<data) {
			if(left == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		else {
			if(right == null) {
				return false;
			}
			else {
				return right.contains(value);
			}
		}
	}
	
	public void printInOrder() {
		if(left!=null) {
			left.printInOrder();
		}
		System.out.println(data);
		if(right!=null) {
			right.printInOrder();
		}
	}
	
	public void printPreOrder() {
		System.out.println(data);
		if(left!=null) {
			left.printPreOrder();
		}
		if(right!=null) {
			right.printPreOrder();
		}
	}
	
	public void printPostOrder() {
		if(left!=null) {
			left.printPostOrder();
		}
		if(right!=null) {
			right.printPostOrder();
		}
		System.out.println(data);
	}
}

public class BinarySearchTree {

	BSTNode root;
	
	BinarySearchTree(int data) { 
        root = new BSTNode(data); 
    }
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(20);
		tree.root.insert(10);
		tree.root.insert(30);
		tree.root.insert(25);
		tree.root.insert(5);
		tree.root.insert(8);
		tree.root.insert(15);
		System.out.println("InOrder:");
		tree.root.printInOrder();
		System.out.println("PreOrder:");
		tree.root.printPreOrder();
		System.out.println("PostOrder:");
		tree.root.printPostOrder();
		System.out.println("Check tree contains 8: "+tree.root.contains(8));
		System.out.println("Check tree contains 40: "+tree.root.contains(40));
	}

}
