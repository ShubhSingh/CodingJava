package main.java;
public class Redwood extends Tree {
	public static void main(String[] args) {
		new Redwood().go();
	}
	void go() {
		go2(new Tree(), new Redwood());
		/*go2((Redwood) new Tree(), new Redwood());*/
	}
	void go2(Tree t1, Redwood r1) {
		Redwood r2 = (Redwood)t1; // ClassCastException at this line I don't undersdtand why ?
		Tree t2 = (Tree)r1;
	}
}
class Tree {}
/*
 * Output is:
 * Exception in thread "main" java.lang.ClassCastException: main.java.Tree cannot be cast to main.java.Redwood
 * at main.java.Redwood.go2(Redwood.java:11)
 * at main.java.Redwood.go(Redwood.java:7)
 * at main.java.Redwood.main(Redwood.java:4)
 * */