package caveofprogramming.collections;

import java.util.ArrayList;
import java.util.List;

/* CaveOfProgramming.com tutorial 1. ArrayList_Collection Tutorial
 * Create an ArrayList, add some elements, print the ArrayList using for loop.
 * Remove element from start and end.
 * Iterate and print the ArrayList using for each loop.
 * Store ArrayList in List.
 */ 
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer> ();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(74);
		num.add(55);
		
		System.out.println(num.get(0));

		System.out.println("\nIteration #1:");
		for(int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));
		}
		
		num.remove(num.size()-1);
		num.remove(0); // very slow

		System.out.println("\nIteration #2:");
		for(Integer value: num) {
			System.out.println(value);
		}
		
		// List interface
		List<String> value = new ArrayList<String>();
	}
}