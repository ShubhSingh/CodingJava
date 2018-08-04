package main.java;

/*
 * Rutime of quicksort: O(nlogn) average, O(n2) worst case
 * Memory: O(logn)
 * */
public class QuickSort {

	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length-1);
	}
	
	public static void quicksort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = array[(left + right)/2]; // pick pivot point
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index-1);
		quicksort(array, index, right);
			
	}

	public static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			// find element on left that should be on right
			while(array[left] < pivot) {
				left++;
			}
			// find element on right that should be on left
			while(array[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void swap(int[] array, int left, int right) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] =  tmp;
	}

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String[] args) {
		int[] arr = {7,22,18,25,10,5,6,2};
		System.out.println("Before sorting array:");
		printArray(arr);
		quicksort(arr);
		System.out.println("\nAfter sorting array:");
		printArray(arr);
	}

}
