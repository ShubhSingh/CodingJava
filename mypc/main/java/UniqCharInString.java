package main.java;

import java.util.HashMap;

public class UniqCharInString {

	public static void main(String[] args) {
		String s = "abcdefghkdlmn";
		boolean z = isStringCharUnique(s); 
		System.out.println(z); // Output is: false
	}
	
	// returns true if String has unique characters
	static boolean isStringCharUnique(String s) {
		HashMap<Character, Boolean> m = new HashMap<>();
		char[] charArr = s.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			m.put(charArr[i], true);
		}
		boolean b = true;
		
		// brute force
		for(int i=0;i<charArr.length;i++)
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]==charArr[j]) {
					b=false;
				}
			}
		return b;
	}
}
