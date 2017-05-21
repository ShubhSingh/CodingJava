package caveofprogramming.collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* Employee class's objects need to be used as key in LinkedHashMap and LinkedHashSet
 * Hence Employee class need to override equals() and hashCode() method
*/
class Employee {
    private int id;
    private String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

 	/* Initialize few Employee objects put these in LinkedHashMap as key and
 	 * add these in LinkedHashSet as key. Iterate over the map using for-each loop
 	 * and print key, value pairs and finally print map and set*/ 
	public class KeyInMapTest {

	    public static void main(String[] args) {
	        
	        Employee p1 = new Employee(0, "Bob");
	        Employee p2 = new Employee(1, "Sue");
	        Employee p3 = new Employee(2, "Mike");
	        Employee p4 = new Employee(1, "Sue");
	        
	        Map<Employee, Integer> map = new LinkedHashMap<Employee, Integer>();
	        
	        map.put(p1, 1);
	        map.put(p2, 2);
	        map.put(p3, 3);
	        map.put(p4, 1);
	        
	        for(Employee key: map.keySet()) {
	            System.out.println(key + ": " + map.get(key));
	        }
	        System.out.println(map);
	        
	        Set<Employee> set = new LinkedHashSet<Employee>();
	        
	        set.add(p1);
	        set.add(p2);
	        set.add(p3);
	        set.add(p4);
	        
	        System.out.println(set);
	    }
	}