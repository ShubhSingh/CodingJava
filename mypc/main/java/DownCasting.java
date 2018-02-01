package main.java;

class PetAnimal {
	void makeNoise() {System.out.println("generic noise"); }
}

class Dogs extends PetAnimal {
	void makeNoise() {System.out.println("bark"); }
	void playDead() { System.out.println("roll over"); }
}

class DownCasting {

	public static void main(String [] args) {
		PetAnimal [] a = {new PetAnimal(), new Dogs(), new PetAnimal() };
		for(PetAnimal animal : a) {
			animal.makeNoise();
			if(animal instanceof Dogs) {
				//animal.playDead(); // try to do a Dog behavior?
				Dogs d = (Dogs) animal; // casting the ref. var.
				d.playDead();
			}
		}
	}
	/* Output is:
	generic noise
	bark
	roll over
	generic noise*/
}