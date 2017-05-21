package main.java;
public class TestBeta {
public static void main(String[] args){
	Beta b = new Beta();
	Object obj =b.doStuff('a');
	
	System.out.println(obj.getClass());
}
}
class Alpha {
	Alpha doStuff(char c) {
		return new Alpha();
	}
}
class Beta extends Alpha {
	Beta doStuff(char c) {
		return new Beta();
	}
}