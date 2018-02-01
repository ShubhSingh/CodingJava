package compilationerrors;
public class Frodo extends Hobbit{
	public static void main(String[] args) {
		int myGold = 7;
		// Cannot make a static reference to the non-static method countGold(int, int) from the type Hobbit
		System.out.println(countGold(myGold,6)); 
	}
}
class Hobbit{
	int countGold(int x,int y) {return x+y;}
}