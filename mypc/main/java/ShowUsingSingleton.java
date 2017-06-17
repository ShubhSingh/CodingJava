package main.java;
import java.util.*;

public class ShowUsingSingleton {
	
	private static final ShowUsingSingleton INSTANCE = new ShowUsingSingleton();
	
	private Set<String> availableSeats;
	
	public static ShowUsingSingleton getInstance() {
		return INSTANCE;
	}
	
	private ShowUsingSingleton() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
	
	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}
	
	private static void ticketAgentBooks(String seat) {
		ShowUsingSingleton show = ShowUsingSingleton.getInstance();
		
		System.out.println(show.bookSeat(seat));
	}
}