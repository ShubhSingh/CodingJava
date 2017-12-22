package main.java;
enum AnimalType {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	AnimalType(String s) {sound=s;}
}
class TestEnum {
	static AnimalType a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound+" "+a.FISH.sound);
	}
}