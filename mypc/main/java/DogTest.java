package main.java;

class Animal { }

class Dog extends Animal { }

class DogTest {
	public static void main(String [] args) {
		Animal animal = new Animal();
		Dog d = (Dog) animal; // compiles but fails later
	}
}