package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		// TODO
		Node n = start;
		while (n != null) {
			if (n.key == key) {
				return n.value;
			}
			n = n.next;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		// TODO

		Node n = start;

		while(n.next != null) {
			if (n.key == key) {
				V temp = n.value;
				n.value = value;
				return temp;
			}
			n = n.next;
		}

		Node newNode = new Node();
		newNode.value = value;
		newNode.key = key;
		n.next = newNode;
		size++;
		return null;

	}

	@Override
	public V remove(K key) {
		// TODO
		Node toBeRemoved = start;
		Node parent = null;
		boolean found = false;
		while(!found && toBeRemoved != null) {
			if (toBeRemoved.next != null) {
				if (toBeRemoved.next.key == key) {
					parent = toBeRemoved;
					found = true;
				}
			}
			toBeRemoved = toBeRemoved.next;
		}

		if (found) {
			parent.next = toBeRemoved.next;
			size--;
			return toBeRemoved.value;
		}
		return null;
	}

	@Override
	public int size() {

		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
