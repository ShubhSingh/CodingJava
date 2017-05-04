
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.lang.*;

public class TestCol {

public static void main(String[] args){
Map map2= new Hashtable();
map2.put("k1","John");
map2.put("k2","Bander");
map2.put("k3","Deader");

display(map2.keySet());
display(map2.values());
}

static void display(Collection col) {
 Iterator itr = col.iterator();
 while (itr.hasNext()) {
 String str = (String)itr.next();
 System.out.print( str + " ");
 }
 System.out.println();
}

}