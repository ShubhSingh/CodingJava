import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {}

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
		
		System.out.println(new Temp());
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
