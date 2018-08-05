package main.java;

/**
 * Cracking the Coding Interview 10.1 Sorted Merge: You are given two sorted
 * arrays, A and B, where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 * 
 * <p>
 * Since we know that A has enough buffer at the end, we won't need to allocate
 * additional space. Our logic should involve simply comparing elements of A and
 * B and inserting them in order, until we've exhausted all elements in A and in
 * B. The only issue with this is that if we insert an element into the front of
 * A, then we'll have to shift the existing elements backwards to make room for
 * it. It's better to insert elements into the back of the array, where there's
 * empty space. The code below does just that. It works from the back of A and
 * B, moving the largest elements to the back of A.
 * </p>
 * 
 * Note that you don't need to copy the contents of A after running out of
 * elements in B. They are already in place.
 **/
public class Merge2SortedArrayInOne {

	private static void merge(int[] a, int[] b, int lastA, int lastB) {
		int indexA = lastA - 1; /* Index of last element in array a */
		int indexB = lastB - 1; /* Index of last element in array b */
		int indexMerged = lastB + lastA - 1; /* end of merged array */
		/* Merge a and b, starting from the last element in each */
		while (indexB >= 0) {
			/* end of a is > than end of b */
			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA]; // copy element
				indexA--;
			} else {
				a[indexMerged] = b[indexB]; // copy element
				indexB--;
			}
			indexMerged--; // move indices
		}
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arrOne = {2,5,7,9,12,-1,-1,-1,-1};
		int[] arrTwo = {8,10,11,13};
		int lastArrOne = 5;
		merge(arrOne, arrTwo, lastArrOne, arrTwo.length);
		printArray(arrOne);
	}

}
