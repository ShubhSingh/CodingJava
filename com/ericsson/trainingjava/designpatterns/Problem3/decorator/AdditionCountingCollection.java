package Problem3.decorator;

import java.util.Collection;
import java.util.Iterator;

public class AdditionCountingCollection<E> implements Collection<E> {
	
	
	Collection original;
	int count;

	public AdditionCountingCollection(Collection original) {
		super();
		this.original = original;
	}

	public int size() {
		return original.size();
	}

	public boolean isEmpty() {
		return original.isEmpty();
	}

	public boolean contains(Object o) {
		return original.contains(o);
	}

	public Iterator iterator() {
		return original.iterator();
	}

	public Object[] toArray() {
		return original.toArray();
	}

	public Object[] toArray(Object[] a) {
		return original.toArray(a);
	}

	public boolean add(Object e) {
		count++;
		return original.add(e);
	}

	public boolean remove(Object o) {
		return original.remove(o);
	}

	public boolean containsAll(Collection c) {
		return original.containsAll(c);
	}

	public boolean addAll(Collection c) {
		count += c.size();
		return original.addAll(c);
	}

	public boolean removeAll(Collection c) {
		return original.removeAll(c);
	}

	public boolean retainAll(Collection c) {
		return original.retainAll(c);
	}

	public void clear() {
		original.clear();
	}

	public boolean equals(Object o) {
		return original.equals(o);
	}

	public int hashCode() {
		return original.hashCode();
	}

	public int getCount() {
		return count;
	}
	

}
