package main.java;
class Alpha2 {
	static String s = "beta";
	protected Alpha2() { s += " alpha";
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println(Alpha2.s);
		Alpha2 a = new Alpha2();
	}
}
