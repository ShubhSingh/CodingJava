package collections.Examples;

import java.util.*;

class GenericsDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
//		list.add("Adding a string"); // compilation error.
		list.add(3);
		list.add(4);
		Integer[] arr = new Integer[list.size()];
		for(int i=0 ; i<list.size() ; ++i)
		{
			arr[i] = list.get(i);
			System.out.println(arr[i]);
		}
		
	}
}
