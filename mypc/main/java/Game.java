package main.java;

import java.util.List;
import java.util.ArrayList;

abstract class SportsMan {
	public abstract void hitBall();
}

class Cricketer extends SportsMan {
	public void hitBall() {
		System.out.println("Hit Ball With Bat");
	}
}

class Footballer extends SportsMan {
	public void hitBall() {
		System.out.println("Hit Ball With Leg");
	}
}

public class Game {
	public static void main(String[] args) {
		List<SportsMan> li = new ArrayList<>();
		
		li.add(new Cricketer());
		li.add(new Footballer());
		// can add HockeyPlayer also
		
		for (SportsMan player : li) {
			player.hitBall();
		}
	}
}