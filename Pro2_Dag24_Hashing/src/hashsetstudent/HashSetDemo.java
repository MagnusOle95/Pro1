package hashsetstudent;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSetChaining names = new HashSetChaining(13);
		// HashSetLinearProbing names = new HashSetLinearProbing(13);

		names.add("Harry");
		names.add("Sue");
		names.add("Nina");
		names.add("Susannah");
		names.add("Larry");
		names.add("Eve");
		names.add("Sarah");
		names.add("Adam");
		names.add("Tony");
		names.add("Katherine");
		names.add("Juliet");
		names.add("Romeo");
		names.writeOut();
		System.out.println();

		System.out.println(names.size());
		System.out.println(names.contains("Romeo"));


		//Opgave 2 A
		System.out.println();
		System.out.println("Opgave 2 A");
		System.out.println(names.remove("Harry"));
		names.writeOut();
		System.out.println(names.remove("Larry"));
		names.writeOut();
		names.add("Larry");
		System.out.println();
		names.writeOut();
		System.out.println(names.remove("Katherine"));
		names.writeOut();
		System.out.println("Listens Størrelse: " + names.size());

		//Opgave 2 B
		System.out.println();
		System.out.println("Opgave2 B");
		HashSetChaining names2 = new HashSetChaining(13);
		// HashSetLinearProbing names = new HashSetLinearProbing(13);
		names2.add("Harry");
		names2.add("Sue");
		names2.add("Nina");
		names2.add("Susannah");
		names2.add("Larry");
		names2.add("Eve");
		names2.add("Sarah");
		names2.add("Adam");
		names2.add("Tony");
		names2.add("Katherine");
		names2.writeOut();
		System.out.println();

		System.out.println(names2.size());
		System.out.println(names2.contains("Juliet"));
		System.out.println();

		System.out.println("Opgave2 B Mine test");
		System.out.println(names2.getBuketSize());
		names2.writeOut();
		System.out.println();
		names2.add("Juliet");
		System.out.println(names2.getBuketSize());
		names2.writeOut();


		//Opgave 3
		System.out.println();
		System.out.println("Opgave 3");
		HashSetLinearProbing names3 = new HashSetLinearProbing(13);
		names3.add("Harry");
		names3.add("Sue");
		names3.add("Nina");
		names3.add("Susannah");
		names3.add("Larry");
		names3.add("Eve");
		names3.add("Sarah");
		names3.add("Adam");
		names3.add("Tony");
		//Tester om personen tilføjes
		System.out.println(names3.add("Katherine"));
		names3.writeOut();
		System.out.println();
		//Tjekker om objektet findes i listen.
		System.out.println(names3.contains("Tony"));
		System.out.println(names3.contains("Frank"));
		//Tjekker om den siger false ved at tilføje en til listen der allerede findes.
		System.out.println();
		System.out.println(names3.add("Katherine"));
		//Tjekker slette funktionen i listen.
		System.out.println();
		System.out.println(names3.remove("Adam"));
		names3.writeOut();
		System.out.println();
		System.out.println(names3.add("Adam"));
		names3.writeOut();
		System.out.println();
		System.out.println(names3.remove("Frank"));

	}
}
