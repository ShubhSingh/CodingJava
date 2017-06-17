package collections.Examples;

import java.util.*;

public class IteratorDemo
{
	public static void main(String args[])
	{
		List<String> list = new	ArrayList<String>();
		list.add("Collection");
		list.add("List");
		list.add("ArrayList");
		list.add ("LinkedList");
 		System.out.println("Contents of the List");
		for(Iterator<String> i = list.iterator() ; i.hasNext() ; )
			System.out.println(i.next());		
	}
}
