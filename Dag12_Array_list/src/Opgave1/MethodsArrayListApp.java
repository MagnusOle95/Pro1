package Opgave1;

import java.util.ArrayList;

public class MethodsArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(35);
		list.add(14);
		list.add(7);
		MethodsArrayList methods = new MethodsArrayList();
		System.out.println(list);
		System.out.println("Summen af tallene i listen med for "
				+ methods.sumListe(list));
		System.out.println("Summen af tallene i listen med forEach "
				+ methods.sumListe2(list));

		System.out.println("Indeks for det første lige tal: "
				+ methods.hasEvenAtIndex(list));

		//Opgave 2//
		System.out.println();
		System.out.println("Det mindste tal i arrayet: " + methods.minTal(list));
		System.out.println("Gennemsnittet af arrayet: " + methods.average(list));
		list.add(0);
		list.add(0);
		list.add(0);
		System.out.println("Antal 0 i arrayet: " + methods.countZeores(list));
		System.out.println(list);

		//Opgave 2.4 swapWithZero//
		//methods.swapEvenWithZero(list);
		//System.out.println(list);
		//System.out.println(); //Mellemrum//

		System.out.println(methods.aEvenList(list));

	}

}
