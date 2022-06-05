package Kædede_struktur;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		// TODO
		Node newnode = new Node();
		newnode.data = e;
		Node temp = first.next;

		if (temp == last){
			newnode.next = last;
			last.prev = newnode;
			newnode.prev = first;
			first.next = newnode;
		}
		else if (newnode.data.compareTo(temp.data) < 0){
			newnode.next = temp;
			temp.prev = newnode;
			first.next = newnode;
			newnode.prev = first;
		}

		else{
			boolean found = false;

			while (!found && temp != last){
				if (temp.data.compareTo(newnode.data) > 0){
					found = true;
				}else{
					temp = temp.next;
				}
			}
			newnode.next = temp;
			newnode.prev = temp.prev;
			temp.prev = newnode;
			newnode.prev.next = newnode;

		}


	}

	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
	// TODO
		boolean slettet = false;
		if (first.next != last) {
				Node temp = first.next;
				boolean found = false;

				while (!found && temp != last){
					if (temp.data.equals(e)){
						found = true;
						temp.prev.next = temp.next;
						temp.next.prev = temp.prev;
						slettet = true;
					}
						temp = temp.next;
				}
			}
		return slettet;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElementsForFra() {
		//TODO
		Node temp = first.next;
		System.out.print("[");
		while (temp != last){
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivElementsBagFra() {
		//TODO
		Node temp = last.prev;
		System.out.print("[");
		while (temp != first){
			System.out.print(temp.data + ",");
			temp = temp.prev;
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		// TODO
		int count = 0;
		Node temp = first.next;
		while (temp != last){
			count++;
			temp = temp.next;
		}
		return count;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
