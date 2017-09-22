package main.java;

/*
 * http://www.geeksforgeeks.org/merge-two-sorted-arrays/ 
*/
public class Merge2SortedArrays {

	static void merge(int[] a, int[] b, int[] c) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}

		while (i < a.length) {
			c[k++] = a[i++];
		}

		while (j < b.length) {
			c[k++] = b[j++];
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7 };
		int b[] = { 2, 4, 6, 8, 10, 12 };
		int c[] = new int[a.length + b.length];

		merge(a, b, c);

		System.out.println("Array after merging: ");
		for (int i = 0; i < a.length + b.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
