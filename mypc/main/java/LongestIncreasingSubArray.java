package main.java;

public class LongestIncreasingSubArray {

	public static void main(String[] args) {
		int[] a = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
		int max = longest(a);
		System.out.println(max); // Output is: 5
	}

	static int longest(int[] a) {
		int max = 1;
		int len = 1;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1])
				len++;
			else {
				if (max < len)
					max = len;
				len = 1;
			}
		}
		if (max < len)
			max = len;

		return max;
	}
}
