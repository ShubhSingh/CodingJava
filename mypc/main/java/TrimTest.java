package main.java;
public class TrimTest {
	public static void main(String[] args) {
		if("welcome".trim()=="welcome".trim())
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	} // Output is: Equal
}