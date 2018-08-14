package collections.Examples;

import java.util.*;

class CollectionsDemo 
{
	public static void main(String[] args) 
	{ 
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(4.56);
		list.add(3.22);
		list.add(14.77);
		list.add(14.79);
		list.add(20.0);
		list.add(8.55);
	
		for (double d : list)
	         	System.out.println(d);
		
		Collections.sort(list);
		
		System.out.println("\nSorted list of double values");
		for (double d : list)
	         	System.out.println(d);
		
		//int pos = Collections.binarySearch(list,20);
		//System.out.println("20 is found at position " +pos + " in the list");
		
		ArrayList<Double> a = new ArrayList<Double>();
		for(int i=0;i<6;i++)
			a.add(0.0);

		Collections.copy(a,list);
		Collections.reverse(a);
		System.out.println("\nElements of copied ArrayList a in reverse order ");
		for (double d : a)
	         	System.out.println(d);
	}
}
