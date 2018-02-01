package main.java;

class Animals { }

class BullDogs extends Animals { }

class BullDogTest {
	public static void main(String [] args) {
		Animals animals = new Animals();
		BullDogs d = (BullDogs) animals; // compiles but fails later
		/*Exception in thread "main" java.lang.ClassCastException: main.java.Animals cannot be cast to main.java.BullDogs
		at main.java.BullDogTest.main(BullDogTest.java:10)*/
	}
}