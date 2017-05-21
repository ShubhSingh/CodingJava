package caveofprogramming.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* CaveOfProgramming.com tutorial 2. LinkedList and List Interface Tutorial
 * Comparing LinkedList and ArrayList.
 * Create an ArrayList and LinkedList and pass them to a method doTmmings.
 * This method calculates time taken to add items in lists based on position of items.
 * 
 * Run this class after enabling each for loop one by one to see correct output.
 * Don't enable all the for loops at same time.
 */ 
public class LinkedListTest {
	public static void main(String[] args) {
		/* ArrayList internally manages array internally 
		 * [0][1][2][3][4][5]...
		 * */
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/*LinkedList consists of elements where each element has a reference to previous and next element
		 * [0]->[1]->[2]->[3]...
		 *    <-   <-   <-
		 * */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {
		for(int  i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		// Add items at end of list: ArrayList is faster
		/*for(int  i=0; i<1E5; i++) {
			list.add(i);
		}*/
		
		// Add items at start of list: LinkedList is faster
		/*for(int  i=0; i<1E5; i++) {
			list.add(0, i);
		}*/
		
		// Add items at end of list: ArrayList is faster
		/*for(int  i=0; i<1E5; i++) {
			list.add(list.size(), i);
		}*/
		
		// Add items at 100th position from end of list: ArrayList is faster
		for(int  i=0; i<1E5; i++) {
			list.add(list.size(), i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+ (end - start) + "ms for "+ type);
	}
}