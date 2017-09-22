package main.java;

/*Given an integer N. The task is to count the number of integers from 1 to N 
 * contains 0’s as a digit.
 * http://www.geeksforgeeks.org/count-numbers-0-digit/
 * */

public class NumberWithZeroAsDigit {

	public static int noOfZeros(int number){
        int zerosInNumber = 0;
        while(number!=0){
            if(number%10 == 0){
                zerosInNumber += 1;
            }
            number/=10;
        }
        return zerosInNumber;
    }
    
    public static int totalZeroCount(int number){
        int zeroCount = 0;
        for(int i=1;i<number;i++){
            zeroCount += noOfZeros(i);
        }
        return zeroCount;
    }
    
	public static void main (String[] args) {
		System.out.println(totalZeroCount(105));
	}
	
}