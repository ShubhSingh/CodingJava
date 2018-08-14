package compilationerrors;
import java.util.*;
public class MyPanCake implements PanCake {
	public static void main(String[] args) {
		List<String> x = new ArrayList<>(); // Diamond operator in java 7
		x.add("3"); x.add("7"); x.add("5");
		List<String> y = new PanCake().doStuff(x);
		y.add("1");
		System.out.println(x);
	}
	List<String> doStuff(List<String> z) {
		z.add("9");
		return z;
	} 
}
interface PanCake {
	List<String> doStuff(List<String> s);
}