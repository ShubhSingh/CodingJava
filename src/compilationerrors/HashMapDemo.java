package compilationerrors;
import java.util.*;

public class HashMapDemo {
   public static void main(String args[]) {
   // create hash map
   HashMap<Integer,String> newmap = new HashMap<Integer,String>();
      
   // populate hash map
   newmap.put(1, "tutorials");
   newmap.put(2, "point");
   newmap.put(3, "is best");
   newmap.put(2, "java"); // HashMap doesnt allow duplicate keys hence previous Entry is overriden with new Entry
   
   // create set view for the map
   Set eSet=newmap.entrySet();

   // get keyset value from map
   Set keyset = newmap.keySet();
   Set valueSet = newmap.values();   
   // check key set values
   System.out.println("Key set values: " + keyset);
      
   // check  set values
   System.out.println("Entry Set values: " + eSet);
   System.out.println("Value Set: " + valueSet);
   }    
}