package setoperationsopgave_Opgave2;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		// TODO
		//Finder fælles mængde.
		Set<T> unionSet = new HashSet<>();
		unionSet.addAll(s1);
		unionSet.addAll(s2);
		return unionSet;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		// TODO
		//Finder forskellen fra liste 1 og liste 2.
		Set<T> differensSet = new HashSet<>();
		for (T tal : s1){
			if (!s2.contains(tal)){
				differensSet.add(tal);
			}
		}
		return differensSet;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		// TODO
		//Finder hvad de 2 lister har til sammen.
		Set<T> intesectionSet = new HashSet<>();
		for (T tal : s1){
			if (s2.contains(tal)){
				intesectionSet.add(tal);
			}
		}
		return intesectionSet;

	}

}
