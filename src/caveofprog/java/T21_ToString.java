package caveofprog.java;
class Toad {
	
	private int id;
	private String name;
	
	public Toad(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		// String concatenation 
		return String.format("%4d: %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}
}

public class T21_ToString {
	public static void main(String[] args) {
		Toad frog1 = new Toad(7, "Freddie");
		Toad frog2 = new Toad(5, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
		
	}
}
