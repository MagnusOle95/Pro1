package Hashing_Map;

public class DictionaryLinked_HashCode_Chaining<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked_HashCode_Chaining() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		// TODO
		V value = null;
		boolean found = false;
		Node temp = start.next;

			while (!found && temp != null) {
				if (temp.key.equals(key)) {
					value = temp.value;
					found = true;
				} else {
					temp = temp.next;
				}
			}
		return value;
		}


	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		// TODO
		boolean found = false;
		Node temp = start;
		V overWritenValue = null;

		if (key != null && value != null) {
			while (!found && temp.next != null) {
				if (temp.next.key.equals(key)) {
					overWritenValue = temp.next.value;
					temp.next.value = value;
					found = true;
				} else {
					temp.next = temp.next.next;
				}
			}
			if (!found) {
				Node newNode = new Node();
				newNode.value = value;
				newNode.key = key;
				temp.next = newNode;
				size++;
			}
		}
		return overWritenValue;
	}

	@Override
	public V remove(K key) {
		// TODO


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
