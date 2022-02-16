package lambda.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		//a Finder den første person i listen med alderen 44
		System.out.println("a:" + findFirst(persons, p -> p.getAge() == 44));

		//b finder den første person i listen der starter med s
		System.out.println("b: " + findFirst(persons, p -> p.getName().toLowerCase().charAt(0) =='s'));

		//c finder første person i listen der har mere end end et i.
		System.out.println("c: " + findFirst(persons, p -> p.getName().toLowerCase().indexOf('i') < p.getName().toLowerCase().lastIndexOf('i')));

		//d finder den første person i listen der har samme længde navn som alder.
		System.out.println("d: " + findFirst(persons,p -> p.getName().length() == p.getAge()));

		//e Laver en metode der finder alle i en bestemt liste.
		List<Person> list1 = findAll(persons, p -> p.getAge() < 30);
		System.out.println("e: " + list1);

		//f Finder alle de personer der har et 'i' i deres navn.
		List<Person> list2 = findAll(persons,p -> p.getName().toLowerCase().indexOf('i') >-1);
		System.out.println("f: " + list2);

		//g finder alle personer der starter med S
		List<Person> list3 = findAll(persons,p -> p.getName().toLowerCase().charAt(0) == 's');
		System.out.println("g: " + list3);

		//H finder alle personer der er har længden 5.
		List<Person> list4 = findAll(persons,p -> p.getName().length() == 5);
		System.out.println("h: " + list4);

		//i Find alle personer der har et navn der med længde mindst 6 og alder under 40
		List<Person> list5 = findAll(persons,p -> p.getName().length() >= 6 && p.getAge() < 40);
		System.out.println("i: " + list5);


	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}


	public static List<Person> findAll(List<Person> list, Predicate<Person> filter){
		List<Person> newList = new ArrayList<>();
		for (Person p : list){
			if (filter.test(p)){
				newList.add(p);
			}
		}
		return newList;
	}


}
