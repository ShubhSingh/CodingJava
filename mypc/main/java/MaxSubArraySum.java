package main.java;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = {-1, -2, -5, -8};
		System.out.println("Maximum Sub Array Sum: "+maxSubArraySum(arr));
	}

	public static int maxSubArraySum(int[] arr) {
		int max_sum = Integer.MIN_VALUE, max_extend_here=0, start=0, end=0, s=0;
		for(int i=0;i<arr.length;i++) {
			max_extend_here = max_extend_here + arr[i];
			if(max_sum < max_extend_here) {
				max_sum = max_extend_here;
				start = s;
				end = i;
			}
			else if(max_extend_here < 0) {
				max_extend_here = 0;
				s+=1;
			}
		}
		System.out.println("Start index: "+start);
		System.out.println("End index: "+end);
		return max_sum;
	}
}
