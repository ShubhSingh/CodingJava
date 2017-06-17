package collections.Examples;

import java.util.*;
class A {
	private int a;
	public A(int a) { this.a = a; }
	public int getA() { return a;}

	public int compareTo(A a) {
		Integer i1 = this.a;
		Integer i2 = a.getA();
		return i1.compareTo(i2);
	}
	public String toString()
	{
		Integer i = a;
		return i.toString();
	}
}

class MyComparator implements Comparator<A>
{
	public int compare(A a1 , A a2)
	{
		Integer i1 = a1.getA();
		Integer i2 = a2.getA();
		return i1.compareTo(i2);
	}
}
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		MyComparator  comp = new MyComparator();
		TreeSet<A> set = new TreeSet<A>(comp);
		
		set.add(new A(4));
		set.add(new A(2));
		set.add(new A(3));
		set.add(new A(4));
		set.add(new A(1));
		for(A a : set)
			System.out.println(a);
	}
}