package queue_Opgave1;

public class QueueDemo {
	public static void main(String[] args) {
		QueueI<String> q = new CircularArrayQueue();
		q.enqueue("Tom");
		q.enqueue("Diana");
		q.enqueue("Harry");
		q.enqueue("Thomas");
		q.enqueue("Bob");
		q.enqueue("Brian");
		System.out.println(q.getFront());
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();

		//Tester også med integer.
		QueueI<Integer> qi = new CircularArrayQueue();
		qi.enqueue(5);
		qi.enqueue(30);
		qi.enqueue(47);
		qi.enqueue(55);
		qi.enqueue(97);
		qi.enqueue(102);
		System.out.println(qi.getFront());
		System.out.println(qi.isEmpty() + " " + qi.size());
		while (!qi.isEmpty()) {
			System.out.println(qi.dequeue());
		}
		System.out.println();
		System.out.println(qi.isEmpty() + " " + qi.size());
		System.out.println();







	}
}
