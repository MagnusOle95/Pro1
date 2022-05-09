package queueopgaver;

import java.rmi.NoSuchObjectException;
import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue_Opgave1 implements QueueI {

	private Object[] queue;
	private int last;

	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue_Opgave1() {
		// TODO
		queue = new Object[10];
		last = -1;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO
		boolean emptyQueue = false;
		if (last == -1){
			emptyQueue = true;
		}
		return emptyQueue;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		// TODO
		growIfNeccassary();
		last++;
		queue[last] = newElement;
	}

	private void growIfNeccassary(){
		if (last + 1 == queue.length){
			Object[] newQueue = new Object[queue.length * 2];
			for (int i = 0; i < queue.length; i++){
				newQueue[i] = queue[i];
			}
			queue = newQueue;
		}
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		// TODO
		Object objects = queue[0];
		for (int i = 0;i < queue.length - 1; i++){
			queue[i] = queue[i + 1];
		}
		last--;
		return objects;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		// TODO
		if (queue.length == 0){
			throw new NoSuchElementException();
		}
		return queue[0];
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		// TODO
		return last + 1;
	}
}
