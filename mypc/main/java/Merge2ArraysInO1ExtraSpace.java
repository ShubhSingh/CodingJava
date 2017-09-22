package main.java;

import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
*/
public class Merge2ArraysInO1ExtraSpace {

	static int arr1[] = { 1, 5, 9, 10, 15, 20 };
	static int arr2[] = { 2, 3, 8, 13 };

	static void merge(int m, int n) {
		for (int i = n - 1; i >= 0; i--) {
			int j, last = arr1[m - 1];
			for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--)
				arr1[j + 1] = arr1[j];

			if (j != m - 2) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}
		}
	}

	public static void main(String[] args) {
		merge(arr1.length, arr2.length);
		System.out.println("After merging first array:");
		System.out.print(Arrays.toString(arr1));
		System.out.println();
		System.out.println("And second array:");
		System.out.print(Arrays.toString(arr2));
	}
}
