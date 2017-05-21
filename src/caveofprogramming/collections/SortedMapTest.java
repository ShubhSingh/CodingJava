package caveofprogramming.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Create a HashMap, LinkedHashMap, TreeMap and pass them to testMap method that
 * add key, value pairs to map and prints key value pairs.
 */
public class SortedMapTest {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
		testMap(hashMap);
		System.out.println("--------");
		testMap(linkedHashMap);
		System.out.println("--------");
		testMap(treeMap);
		
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(6, "cow");
		map.put(3, "bat");
		map.put(2, "mole");
		map.put(5, "lion");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key+": "+value);
		}
	}
}
