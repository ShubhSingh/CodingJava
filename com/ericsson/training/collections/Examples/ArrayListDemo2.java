package collections.Examples;

import java.util.*;
public class ArrayListDemo2 
{
	public static void main(String args[]) 
	{
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());
	    al.add("C");
	    al.add("A");
	    al.add("E");
	    al.add("B");
	    al.add("D");
	    al.add("F");
	    al.add(1, "A2");
	    System.out.println("Size after additions:"+al.size());
	    System.out.println("Contents of al: " + al);
	    al.remove("F"); 
		al.remove(2);
	    System.out.println("Size after deletions: "+al.size());
	    System.out.println("Contents of al: " + al);
	}
}
