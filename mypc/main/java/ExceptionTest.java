package main.java;
public class ExceptionTest {

	public static void main(String[] args) {
		try {
		throwIt();
		System.out.println("A");
		}
		catch(Exception e) {
		System.out.println("B");
		}
		finally {
		System.out.println("C");
		}
		System.out.println("D");
	}
	public static void throwIt() {
		throw new RuntimeException();
	}
}