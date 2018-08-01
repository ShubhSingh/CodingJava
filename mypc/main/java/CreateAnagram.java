package main.java;

public class CreateAnagram {

	public static void main(String[] args) {
		String s1 = "aabcd";
		String s2 = "fgce";
		System.out.println(neededRemovals(s1, s2));
	}

	public static int neededRemovals(String first, String second) {
		int offset = (int) 'a';
		int[] firstArr = new int[26];
		int[] secondArr = new int[26];
		int numberNeeded = 0;
		
		for(char value : first.toCharArray()) {
			int characterValue = (int) value - offset;
			firstArr[characterValue]++;
		}
		
		for(char value : second.toCharArray()) {
			int characterValue = (int) value - offset;
			secondArr[characterValue]++;
		}
		
		for(int i=0;i<26;i++) {
			numberNeeded += Math.abs(firstArr[i] - secondArr[i]);
		}

		return numberNeeded;
	}
}
