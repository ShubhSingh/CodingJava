package collections.Examples;

import java.util.*;

class ArraysDemo 
{
	public static void main(String[] args) 
	{	
		int[] intArray = new int[5];
		int[] intArray2 = new int[5];
		Double[] wrapperArray = new Double[5];
		Double dbl = new Double(7.65);
		java.util.Arrays.fill(intArray,6);
		java.util.Arrays.fill(wrapperArray,dbl);
		
		for(int i=0 ; i<intArray2.length ; i++)
			intArray2[i] = new Random().nextInt(20);
		
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		
		for(int j=0;j<wrapperArray.length;j++)
			System.out.println(wrapperArray[j]);
		
		for(int k=0;k<intArray2.length;k++)
			System.out.println(intArray2[k]);
		
		Arrays.sort(intArray2);
		
		System.out.println("Sorted intArray2");
		for(int k=0;k<intArray2.length;k++)
			System.out.println(intArray2[k]);
		
		int pos = Arrays.binarySearch(intArray2,12);
		
		if(pos > 0)
			System.out.println("Number 12 appears at location " + pos);
		else
			System.out.println("Number 12 does not appear in the array");
	}
}
