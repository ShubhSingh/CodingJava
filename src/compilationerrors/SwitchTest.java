package compilationerrors;

public class SwitchTest {
	public static void main(String[] args) {
		final char b = 'a';
		final char c = args[0].charAt(0);
		switch(b) {			// switch('e')
			default: System.out.println("Default");
			break;
			case b: System.out.println("Char b");
			break;
			case c: System.out.println("Char c");
			break;
		}
	}
}
