package main.java;

import java.util.ArrayList;

public class HashTable<K, V> {

	private static class Node<K, V> {
		public Node<K, V> next;
		public Node<K, V> prev;
		public K key;
		public V value;
		public Node(K k, V v) {
			key = k;
			value = v;
		} 
	}
	
	private ArrayList<Node<K, V>> arr;

	public HashTable(int capacity) {
		/* Create list of linked lists at a particular size. 
		 * Fill list with null values, as it's the only way to make the array the desired size. */
		arr = new ArrayList<Node<K, V>> ();
		arr.ensureCapacity(capacity); // Optional optimization
		for (int i = 0; i < capacity; i++) {
			arr.add(null);
		}
	}

	/* Insert key and value into hash table. */
	public void put(K key, V value) {
		Node<K, V> node = getNodeForKey(key);
		if (node != null) { // Already there
			node.value = value; // just update the value.
			return;
		}
		node = new Node<K, V>(key, value);
		int index = getIndexForKey(key);
		if (arr.get(index) != null) {
			node.next = arr.get(index);
			node.next.prev = node;
		}
		arr.set(index, node);
	}

	/* Remove node for key. */
	public void remove(K key) {
		Node<K, V> node = getNodeForKey(key);
		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			/* Removing head - update. */
			int hashKey = getIndexForKey(key);
			arr.set(hashKey, node. next);
		}
		if (node. next != null) {
			node.next.prev = node.prev;
		}
	} 
	
	/* Get value for key. */
	public V get(K key) {
		Node<K, V> node = getNodeForKey(key);
		return node == null? null: node.value;
	}

	/* Get linked list node associated with a given key. */
	private Node<K, V> getNodeForKey(K key) {
		int index = getIndexForKey(key);
		Node<K, V> current = arr.get(index);
		while (current != null) {
			if (current. key == key) {
					return current;
			}
			current = current.next;
		}
		return null;
	}

	/* Really naive function to map a key to an index. */
	public int getIndexForKey(K key) {
		return Math.abs(key.hashCode() % arr.size());
	}
	
	public static void main(String[] args) {
		
		HashTable<Integer, String> table = new HashTable<>(6);
		
		table.put(1, "Java");
		table.put(2, "is");
		table.put(3, "very");
		table.put(4, "awesome");
		
		for(int i=1;i<5;i++)
		System.out.println(i+"="+table.get(i));
		
		System.out.println("\nRemove key 3");
		table.remove(3);
		
		System.out.println("\nRemaining entries in table:");
		for(int i=1;i<5;i++)
			System.out.println(i+"="+table.get(i));
	}

}
