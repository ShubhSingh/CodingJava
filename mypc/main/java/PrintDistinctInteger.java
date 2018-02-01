package main.java;

import java.util.HashSet;

/*
 * http://www.geeksforgeeks.org/print-distinct-elements-given-integer-array/
 * Given an integer array, print all distinct elements in array. 
The given array may contain duplicates and the output should print every element only once.*/

public class PrintDistinctInteger {
	public static void main(String[] args) {

		int A[] = { 89, 4, 7, 7, 23, 4, 45 };
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (!set.contains(A[i])) {
				set.add(A[i]);
				System.out.print(A[i] + " ");
			}
		}
	}
	/*Output is: 89 4 7 23 45*/ 
}
