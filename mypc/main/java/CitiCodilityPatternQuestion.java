package main.java;

public class CitiCodilityPatternQuestion {

	public static int findMaxElement(int[] Arr) {
		int max = Arr[0];
		for (int i = 1; i < Arr.length; i++) {
			if (Arr[i] > max)
				max = Arr[i];
		}
		return max;
	}

	public static int lengthOfMaxElement(int[] Arr) {
		int element = findMaxElement(Arr);
		return String.valueOf(element).length();
	}

	public static void main(String[] args) {
		int[] Arr = { 3, 10, 123, 74, 12435, 18, 65, 96, 88, 1342, 12 };

		int maxElementLength = lengthOfMaxElement(Arr);
		int k = 4;

		for (int n = 0; n < Arr.length / k; n++) {
			for (int i = 0; i < k; i++) {
				System.out.print("+");
				for (int j = 0; j < maxElementLength; j++) {
					System.out.print("-");
				}
			}
			System.out.println("+");
			for (int i = 0; i < k; i++) {
				System.out.print("|");
				for (int j = 0; j < maxElementLength - String.valueOf(Arr[i + n * k]).length(); j++) {
					System.out.print(" ");
				}
				System.out.print(Arr[i + n * k]);
			}
			System.out.println("|");
		}
		
		for (int i = 0; i < k; i++) {
			System.out.print("+");
			for (int j = 0; j < maxElementLength; j++) {
				System.out.print("-");
			}
		}
		System.out.println("+");

		for (int i = 0; i < Arr.length % k; i++) {
			System.out.print("|");
			for (int j = 0; j < maxElementLength - String.valueOf(Arr[(Arr.length / k) * k + i]).length(); j++) {
				System.out.print(" ");
			}
			System.out.print(Arr[(Arr.length / k) * k + i]);
		}
		System.out.println("|");
		
		for (int i = 0; i < Arr.length % k; i++) {
			System.out.print("+");
			for (int j = 0; j < maxElementLength; j++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
	}
	/*  Output is:
		+-----+-----+-----+-----+
		|    3|   10|  123|   74|
		+-----+-----+-----+-----+
		|12435|   18|   65|   96|
		+-----+-----+-----+-----+
		|   88| 1342|   12|
		+-----+-----+-----+
		*/
}
