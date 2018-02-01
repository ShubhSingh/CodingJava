package main.java;

import java.util.Scanner;

public class TransformArray {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] arr = null;
		int n = 0;
		for(int a_0=0;a_0<t;a_0++) {
		    n = in.nextInt();
		    arr = new int[n];
		    for(int b=0;b<n;b++) {
		        arr[b] = in.nextInt();
		    }
		    System.out.println(arr);
		}
		for(int b=0;b<n;b++) {
		        if(arr[b] == 0) {
		            b++;
		        }
		        if(arr[b]==arr[++b]) {
		            System.out.println(b);
		        }
		    }
		in.close();
	}
}