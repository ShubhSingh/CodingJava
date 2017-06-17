package main.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

/* Create a List and Vector add some elements to both using add() method. 
 * Add all the elements of Vector to ArrayList by using addAll() method.
 * Also display all the elements of ArrayList and Vector after each operation using a static 
 * display(Collection) method which takes any Collection type as input iterates over it and displays
 * all the elements inside it. */ 
public class AddCol {

public static void main(String[] args){
List map2= new ArrayList();
map2.add("John");
map2.add("Bander");
map2.add("Deader");

display(map2);

List map3= new Vector();
map3.add("1");
map3.add("2");

map2.addAll(map3);
display(map2);

map3.addAll(map2);
display(map3);
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