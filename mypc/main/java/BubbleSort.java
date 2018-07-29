package main.java;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		boolean isSorted = false;
		int lastUnsorted = array.length -1; // For optimization purpose
		while(!isSorted) {
			isSorted = true;
			for(int i=0;i<lastUnsorted;i++) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					isSorted = false;
				}
			}
			lastUnsorted--; // Skip last element in each iteration of while because last element gets sorted one by one
		}
	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] =  tmp;
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = {33,22,25, 11,15,8, 2, 5};
		sort.bubbleSort(arr);
		System.out.println("After sorting:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
