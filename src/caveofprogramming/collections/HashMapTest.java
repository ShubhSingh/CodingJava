package caveofprogramming.collections;
import java.util.HashMap;
import java.util.Map;

/* Create HashMap and print key value pair using for each loop*/
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "five");
		map.put(8, "eight");
		map.put(7, "seven");
		map.put(6, "six");
		map.put(2, "two");
		map.put(6, "hello"); // map does not allow duplicate keys
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
}
