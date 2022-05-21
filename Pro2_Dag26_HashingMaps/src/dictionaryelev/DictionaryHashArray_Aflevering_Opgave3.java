package dictionaryelev;

import java.util.ArrayList;

public class DictionaryHashArray_Aflevering_Opgave3 <K, V> implements Dictionary<K, V> {

    //Lavet sammen med Jens J og Morten H !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    private ArrayList<V>[] ValueTabel;
    private ArrayList<K>[] keysTabel;
    private static int N = 10;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryHashArray_Aflevering_Opgave3() {
        ValueTabel = new ArrayList[N];
        keysTabel = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            ValueTabel[i] = new ArrayList<V>();
            keysTabel[i] = new ArrayList<K>();
        }
    }

    @Override
    public V get(K key) {
        V value = null;
        int i = key.hashCode() % N;
        ArrayList<K> kA = keysTabel[i];

        if (kA.contains(key)) {
            boolean found = false;
            int index = 0;

            while (!found && index < kA.size()) {
                if (kA.get(index) == key) {
                    found = true;
                } else {
                    index++;
                }
            }
            ArrayList<V> vA = ValueTabel[i];
            value = vA.get(index);
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        int index = 0;
        while (empty && index < keysTabel.length){
            empty = keysTabel[index].isEmpty();
            index++;
        }
        return empty;
    }

    @Override
    public V put(K key, V value) {
        V data = null;
        if (key != null && value != null) {
            int i = key.hashCode() % N;
            ArrayList<K> kA = keysTabel[i];
            ArrayList<V> vA = ValueTabel[i];

            if (kA.contains(key)) {
                boolean found = false;
                int index = 0;

                while (!found && index < kA.size()) {
                    if (kA.get(index) == key) {
                        found = true;
                    } else {
                        index++;
                    }
                }
                data = vA.get(index);
                vA.set(index, value);
            } else {
                kA.add(key);
                vA.add(value);
            }
        }
        return data;
    }

    @Override
    public V remove(K key) {
        V data = null;
        int i = key.hashCode() % N;
        ArrayList<K> kA = keysTabel[i];
        ArrayList<V> vA = ValueTabel[i];

        if (kA.contains(key)) {
            boolean found = false;
            int index = 0;

            while (!found && index < kA.size()) {
                if (kA.get(index) == key) {
                    found = true;
                } else {
                    index++;
                }
            }
            data = vA.get(index);
            kA.remove(index);
            vA.remove(index);
        }
        return data;
    }

    @Override
    public int size() {
        int size = 0;
        for (ArrayList<K> k : keysTabel){
            size += k.size();
        }
        return size;
    }
}

