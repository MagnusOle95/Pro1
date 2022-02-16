package lambda.ex2student;

import com.sun.source.tree.IfTree;
import lambda.ex1student.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		//Opgave 2 a)
		runners.forEach(p -> System.out.println(p));

		System.out.println();

		//Opgave 2 b)
		runners.forEach(p -> {if (p.getLapTime() < 30) System.out.println(p);});

		// Opgave 2 c)
		System.out.println(runners);
		runners.sort((r1,r2) -> r1.getLapTime() - r2.getLapTime());
		System.out.println(runners);







	}

	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}


}