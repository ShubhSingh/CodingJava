package collections.Examples;

import java.util.*;

public class ForEachDemo
{
	public static void main(String args[])
	{
		List<String> list = new	ArrayList<String>();
		list.add("Collection");
		list.add("List");
		list.add("ArrayList");
		list.add ("LinkedList");
 		System.out.println("Contents of the List");
		for(String str : list)
			System.out.println(str);		
	}
}
