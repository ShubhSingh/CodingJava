package main.java;

class Frog {
	static int frogCount = 0;

	public Frog() {
		frogCount += 1;
	}
}

class TestFrog {
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("frogCount: " + Frog.frogCount); // output is: frogCount: 3

		Frog f = new Frog();
		int frogs = f.frogCount;
		System.out.println("frogs: " + frogs); // output is: frogs: 4
	}
}