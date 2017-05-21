package caveofprog.java.t25.accessmodifiers;
import caveofprog.java.t25.world.Plant;

public class Grass extends Plant {
	public Grass() {
		// Even though Grass is a subclass of Plant, I can't access height because it's not in the same package.
		// System.out.println(this.height);
	}
}
