package main.java;

/*
 * http://www.geeksforgeeks.org/array-rotation/
 */
public class RotateArray {
	
	static void leftRotate(int [] a, int d, int n) {
		for(int i=0;i<d;i++)
			leftRotateByOne(a,n);
	}
	
	static void leftRotateByOne(int [] a, int n) {
		int i,temp;
		temp=a[0];
		for(i=0;i<n-1;i++) {
			a[i]=a[i+1];
		}
		a[i]=temp;
	}
	
	static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4,5,6,7};
		leftRotate(a,2,a.length);
		printArray(a);
	}
}
