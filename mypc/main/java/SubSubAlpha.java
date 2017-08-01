package main.java;

class AlphaNew {
	static String s = " ";
	protected AlphaNew() { s += "alpha "; }
}

class SubAlpha extends AlphaNew {
	private SubAlpha() { s += "sub "; }
}

public class SubSubAlpha extends AlphaNew {
	private SubSubAlpha() { s += "subsub "; }
	public static void main(String[] args) {
		new SubSubAlpha();
	System.out.println(s);
	}
}