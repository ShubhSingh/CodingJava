package caveofprogramming.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* How to use HashSet, TreeSet and LinkedHashSet, 
 * how to use the Set interface methods 
 * how to find the intersection of two sets
 */
public class SetTest {

    public static void main(String[] args) {

        // HashSet unordered Enable/Disable code and test
        // Set<String> set1 = new HashSet<String>();

        // LinkedHashSet insertion order Enable/Disable code and test
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order Enable/Disable code and test
        Set<String> set1 = new TreeSet<String>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        if (set1.isEmpty()) {
            System.out.println("Set is empty after adding (no!)");
        }

        // Adding duplicate items does nothing.
        set1.add("mouse");
        System.out.println(set1);

        // Iteration
        for (String element : set1) {
            System.out.println(element);
        }

        // Does set contains a given item?
        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }

        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }

        /// set2 contains some common elements with set1, and some new
        Set<String> set2 = new TreeSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");
        
        // Intersection of set1 and set2
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        
        // Difference between set1 and set2
        Set<String> difference = new HashSet<String>(set2);
        difference.removeAll(set1);
        System.out.println(difference);
    }
}