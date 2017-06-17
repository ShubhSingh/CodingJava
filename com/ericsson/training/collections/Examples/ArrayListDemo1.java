package collections.Examples;

import java.util.*;
class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList  list = new ArrayList();
		list.add("J2SE");
		list.add("J2ME");
		list.add("J2EE");
		System.out.println("Size of the arraylist : " +list.size());
		for(int i=0 ; i<list.size() ; ++i)
		{
			String str = (String) list.get(i);
			System.out.println(str);
		}
		System.out.println("Adding one more element to the arraylist");
		list.add("The Java Platform");
		System.out.println("Element 4 : " + list.get(3));
		System.out.println("Size of arraylist now : " +list.size());
	}
}
