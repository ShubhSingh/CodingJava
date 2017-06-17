package collections.tutorials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Customer implements Comparable<Customer> {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        final Customer other = (Customer) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Customer Customer) {
        int len1 = name.length();
        int len2 = Customer.name.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(Customer.name);
        }
    }
}

public class ComparableTest {

    public static void main(String[] args) {
        List<Customer> list = new ArrayList<Customer>();
        SortedSet<Customer> set = new TreeSet<Customer>();
        
        addElements(list);
        addElements(set);
        
        Collections.sort(list);
        
        showElements(list);
        System.out.println();
        showElements(set);
    }
    
    private static void addElements(Collection<Customer> col) {
        col.add(new Customer("Joe"));
        col.add(new Customer("Sue"));
        col.add(new Customer("Juliet"));
        col.add(new Customer("Clare"));
        col.add(new Customer("Mike"));
    }
    
    private static void showElements(Collection<Customer> col) {
        for(Customer element: col) {
            System.out.println(element);
        }
    }
}