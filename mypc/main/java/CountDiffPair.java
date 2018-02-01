package main.java;

import java.util.HashMap;

public class CountDiffPair {

	public static void main(String[] args) {
		int[] arr =  {1,7,5,9,2,12,3};
		int k = 2;
		int sol = countPairsWithDiffK(arr, arr.length, k);
		System.out.println(sol); // Output is: 4
	}

	static int countPairsWithDiffK(int arr[], int n, int k)
	{
	    int count = 0;

	    HashMap<Integer, Boolean> m = new HashMap<>();
	    
	    for (int i = 0; i < n; i++)
	        m.put(arr[i], true);
	 
	    for (int i = 0; i < n; i++)
	    {
	        int x = arr[i];
	        if (x + k >= 0 && m.containsKey(x + k))
	            count++;
	    }
	    return count;
	}
}
