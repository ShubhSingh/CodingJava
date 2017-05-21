package main.java;
import java.util.HashMap;
import java.util.Map;

public class HashMapInterviewQuestion {

public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(6, "Six");
	map.put(9, "Nine");
	map.put(8, "Eight");
	map.put(5, "Five");
	map.put(7, "Seven");

	map.put(9, "Ten"); // What happens if you put same key in map again

	System.out.println(map.get(9)); // Then previous Entry object gets replaced by new key and value objects

	for(Map.Entry<Integer, String> entry: map.entrySet()) { //for each loop is used to get all the keys and values in this map from Entry object
		int key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + ": " +value);
	}
}
}