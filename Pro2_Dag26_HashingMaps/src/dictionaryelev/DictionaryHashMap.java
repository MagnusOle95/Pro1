package dictionaryelev;

import java.util.HashMap;
import java.util.Map;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private Map<K, V>[] tabel;
	private static int N = 10;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryHashMap() {
		tabel = new HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new HashMap<K, V>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		Map<K, V> m = tabel[i];
		return m.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	@Override
	public V put(K key, V value) {
		// TODO
		V data = null;

		if (key != null && value != null){
			int i = key.hashCode() % N;
			Map<K, V> m = tabel[i];

			if (m.containsKey(key)){
				data = m.get(key);
				m.put(key,value);
			} else{
				m.put(key,value);
			}
		}
		return data;
	}

	@Override
	public V remove(K key) {
		// TODO
		V data = null;
		int i = key.hashCode() % N;
		Map<K, V> m = tabel[i];

		if (m.containsKey(key)){
			data = m.get(key);
			m.remove(key);
		}
		return data;
	}

	@Override
	public int size() {
		// TODO
		int size = 0;
		for (Map<K,V> m : tabel){
			size += m.size();
		}
		return size;
	}

}
