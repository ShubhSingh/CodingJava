package main.java;

class Animals { }

class BullDogs extends Animals { }

class BullDogTest {
	public static void main(String [] args) {
		Animals animals = new Animals();
		BullDogs d = (BullDogs) animals; // compiles but fails later
	}
}