package collections.Examples;

import java.util.*;
/*
 * Program to show how to use java api's LinkedList
 * */
public class LinkedListDemo 
{
	public static void main(String args[]) 
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Boolean");
	    list.add("FileInputStream");
	    list.addLast("System");
	    list.addFirst("ArrayList");
		System.out.println ("Original contents of list: " + list);
	    list.add(1, "Array");
	    System.out.println("After adding Contents of list: " + list);
	    System.out.println("Check if list contains System: "+list.contains("System"));
	    list.remove("FileInputStream");
	    list.remove(2);
	    System.out.println ("Contents after deletion: " + list);
	    list.removeFirst();
	    list.removeLast();
	    System.out.println ("After deleting first & last:" + list);
	}
}
