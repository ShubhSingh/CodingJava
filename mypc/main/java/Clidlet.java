package main.java;
class Clidder {
	private final void flipper() { System.out.print("Clidder"); }
}
public class Clidlet extends Clidder {
	public final void flipper() { System.out.print("Clidlet"); }
	public static void main(String[] args) {
		new Clidlet().flipper(); // Output is: Clidlet
	}
}