import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListTest {
	public static void main(String[] args) {
		/*ArrayList internally manages array internally 
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
	
	// let's say I want to pass these lists to a function then I'll create a method
	private static void doTimings(String type, List<Integer> list) {
		for(int  i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		// Add items at end of list
		/*for(int  i=0; i<1E5; i++) {
			list.add(i);
		}*/
		
		// Add items anywhere else in the list
		/*for(int  i=0; i<1E5; i++) {
			list.add(0, i);
		}*/
		
		// Add items at the end of list
		/*for(int  i=0; i<1E5; i++) {
			list.add(list.size(), i);
		}*/
		
		// Add items at the 100th position from the end of list
		for(int  i=0; i<1E5; i++) {
			list.add(list.size(), i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+ (end - start) + "ms for "+ type);
	}
}