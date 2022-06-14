package collection_framework.Opgave1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Opgave1_HashSet {

    public static void main(String[] args) {

        //Opgave 1.1
        Set<Integer> tal = new HashSet<>();

        //Opgave 1.2
        tal.add(34);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);

        //Opgave 1.3
        System.out.println(tal);

        //Opgave 1.4
        tal.add(23);

        //Opgave1.5
        System.out.println(tal);

        //Opgave 1.6
        tal.remove(67);

        //Opgave 1.7
        System.out.println(tal);

        //Opgave 1.8
        System.out.println(tal.contains(23));

        //Opgave 1.9
        System.out.println(tal.size());
    }
}
