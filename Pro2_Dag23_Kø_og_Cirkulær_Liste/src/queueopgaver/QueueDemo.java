package queueopgaver;

public class QueueDemo {
	public static void main(String[] args) {
		//Opgave 1
		//Opretter kø
		QueueI q = new ArrayQueue_Opgave1();
		//Tjekker om køen er tom.
		System.out.println(q.isEmpty() + " " + q.size());
		//Tilføjer objekter til køen.
		q.enqueue("Tom");
		q.enqueue("Diana");
		q.enqueue("Harry");
		q.enqueue("Thomas");
		q.enqueue("Bob");
		q.enqueue("Brian");
		//Tjekker hvad det foreste i køen er
		System.out.println(q.getFront());
		//Tjekker om køen er 6 lang, og den ikke er tom.
		System.out.println(q.isEmpty() + " " + q.size());

		//Sletter alle objekter i køen.
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}

		//Tjekker om køen er tom.
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();


		//Tilføjer ombjekter til køen igen.
		q.enqueue("Anna");
		q.enqueue("Lotte");
		System.out.println(q.isEmpty() + " " + q.size());

		//Sletter alle objekter i listen og udskriver dem.
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}

		//Tjekker om listen er tom igen.
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());

		//tjekker om min grow if neccessary virker.
		System.out.println();
		q.enqueue("Tom");
		q.enqueue("Diana");
		q.enqueue("Harry");
		q.enqueue("Thomas");
		q.enqueue("Bob");
		q.enqueue("Brian");
		q.enqueue("Gurli");
		q.enqueue("Himsa");
		q.enqueue("Lars");
		q.enqueue("Jepper");

		System.out.println(q.isEmpty() + " " + q.size());

		q.enqueue("Magnus");

		System.out.println(q.isEmpty() + " " + q.size());

//---------------------------------------------------------------------------------------------

		//Opgave 2
		//Opretter kø
		QueueI linkedlistQueue = new NodeEnkeltQueue_Opgave2();
		//Tjekker om køen er tom.
		System.out.println(linkedlistQueue.isEmpty() + " " + linkedlistQueue.size());
		//Tilføjer objekter til køen.
		linkedlistQueue.enqueue("Tom");
		linkedlistQueue.enqueue("Diana");
		linkedlistQueue.enqueue("Harry");
		linkedlistQueue.enqueue("Thomas");
		linkedlistQueue.enqueue("Bob");
		linkedlistQueue.enqueue("Brian");

		//Tjekker hvad det foreste i køen er
		System.out.println(linkedlistQueue.getFront());
		//Tjekker om køen er 6 lang, og den ikke er tom.
		System.out.println(linkedlistQueue.isEmpty() + " " + linkedlistQueue.size());

		System.out.println();

		//Sletter alle objekter i køen.
		while (!linkedlistQueue.isEmpty()) {
			System.out.println(linkedlistQueue.dequeue());
		}


		//Tjekker om køen er tom.
		System.out.println();
		System.out.println(linkedlistQueue.isEmpty() + " " + linkedlistQueue.size());
		System.out.println();


		//Tilføjer ombjekter til køen igen.
		linkedlistQueue.enqueue("Anna");
		linkedlistQueue.enqueue("Lotte");
		System.out.println(linkedlistQueue.isEmpty() + " " + linkedlistQueue.size());



		//Sletter alle objekter i listen og udskriver dem.
		while (!linkedlistQueue.isEmpty()) {
			System.out.println(linkedlistQueue.dequeue());
		}


		//Tjekker om listen er tom igen.
		System.out.println();
		System.out.println(linkedlistQueue.isEmpty() + " " + linkedlistQueue.size());
		System.out.println();


		//Opgave 3 - A
		//Opretter dequeue linkedlist double queue.
		DequeI nodeDeQueue = new NodeDoubleDeQueue_Opgave3();
		//Tjekker okm listen er tom.
		System.out.println(nodeDeQueue.isEmpty() + " " + nodeDeQueue.size());
		//Tilføjer objekter til listen.
		nodeDeQueue.addFirst("Frank");
		nodeDeQueue.addFirst("gurli");
		nodeDeQueue.addLast("Himmer");
		nodeDeQueue.addLast("Egon");
		//Forventer listen ser sådan her ud. Gurli,Frank,Himmer,Egon.
		//Tjekker om gurli er først i køen.
		System.out.println(nodeDeQueue.getFirst());
		//Tjekker om Egon er sidst i køen.
		System.out.println(nodeDeQueue.getLast());
		//Sletter den første i køen.
		System.out.println(nodeDeQueue.removeFirst());
		//Sletter den sidste i køen.
		System.out.println(nodeDeQueue.removeLast());
		//Tjekker hvad der er først og sidst i listen.
		System.out.println(nodeDeQueue.isEmpty() + " " + nodeDeQueue.size());
		//sletter de 2 sidste i køen.
		System.out.println(nodeDeQueue.removeLast());
		System.out.println(nodeDeQueue.removeLast());
		System.out.println(nodeDeQueue.isEmpty() + " " + nodeDeQueue.size());
		//opretter og sletter de 2 i fronten af køen.
		nodeDeQueue.addLast("Himmer");
		nodeDeQueue.addLast("Egon");
		System.out.println(nodeDeQueue.isEmpty() + " " + nodeDeQueue.size());
		System.out.println(nodeDeQueue.removeFirst());
		System.out.println(nodeDeQueue.removeFirst());
		System.out.println(nodeDeQueue.isEmpty() + " " + nodeDeQueue.size());


		//Opgave 4
		//Opretter queue cirkulær enkeltrettet liste.
		System.out.println();
		System.out.println("Opgave4");
		NodeCirkulærEnkeltQueue_Opgave4 nodeCirkulærEnkeltQueue = new NodeCirkulærEnkeltQueue_Opgave4();
		//opretter personer og tilføjer dem til listen.
		Person jens = new Person("Jens",25);
		Person frank = new Person("Frank",30);
		Person gurli = new Person("Gurli",18);
		Person hansi = new Person("Morten",30);
		Person egon = new Person("egon",50);
		//Indsætter personer i listen.
		nodeCirkulærEnkeltQueue.addPerson(jens);
		nodeCirkulærEnkeltQueue.addPerson(frank);
		nodeCirkulærEnkeltQueue.addPerson(gurli);
		nodeCirkulærEnkeltQueue.addPerson(hansi);
		nodeCirkulærEnkeltQueue.addPerson(egon);
		//Udksirver om personerne er i listen.
		nodeCirkulærEnkeltQueue.print();
		nodeCirkulærEnkeltQueue.kanibalisering();
		nodeCirkulærEnkeltQueue.print();



	}


}
