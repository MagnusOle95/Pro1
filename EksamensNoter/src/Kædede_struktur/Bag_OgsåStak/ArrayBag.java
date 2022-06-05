package Kædede_struktur.Bag_OgsåStak;public class ArrayBag<T> implements Bag<T> {    private T[] elementer;    private int currentSize;    private int arraySize;    public ArrayBag(){        this.arraySize = 10;        this.elementer = (T[]) new Object[arraySize];        this.currentSize = 0;    }    @Override    public int getCurrentSize() {        return this.currentSize;    }    @Override    public boolean isFull() {        return currentSize == elementer.length;    }    @Override    public boolean isEmpty() {        return currentSize == 0;    }    @Override    public boolean add(T newEntry) {        boolean succes = false;        if (!isFull()) {            elementer[currentSize] = newEntry;            succes = true;            currentSize++;        }        return succes;    }    @Override    public T remove() {        T entry = null;        if (currentSize != 0){        entry = elementer[currentSize - 1];        currentSize--;    }        return entry;    }    @Override    public boolean remove(T anEntry) {        boolean found = false;        int indeks = 0;        while (!found && indeks < currentSize){            T k = elementer[indeks];            if (k == anEntry){                found = true;            }else{                indeks++;            }        }        if (found){            elementer[indeks] = null;            for (int i = indeks; i < elementer.length - 1; i++){                elementer[i] = elementer[i + 1];            }            currentSize--;        }        return found;    }    @Override    public void clear() {        int indeks = 0;        while (indeks < currentSize){            elementer[indeks] = null;            indeks++;        }        currentSize = 0;    }    @Override    public int getFrequencyOf(T anEntry) {        int indeks = 0;        int count = 0;        while (indeks < currentSize){            if (anEntry.equals(elementer[indeks])){                count++;            }            indeks++;        }        return count;    }    @Override    public boolean contains(T anEntry) {        boolean found = false;        int indeks = 0;        while (!found && indeks < currentSize){            if (anEntry.equals(elementer[indeks])){                found = true;            }else{                indeks++;            }        }        return found;    }    @Override    public T[] toArray() {        T[] newArray = (T[]) new Object[currentSize];        int indeks = 0;        while (indeks < currentSize){            newArray[indeks] = elementer[indeks];            indeks++;            }        return newArray;        }}