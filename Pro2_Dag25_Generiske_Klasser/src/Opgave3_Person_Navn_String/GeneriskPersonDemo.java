package Opgave3_Person_Navn_String;

import java.util.ArrayList;
import java.util.Collections;

public class GeneriskPersonDemo {

    public static void main(String[] args) {

        //opretter personer og liste personer med string navne.
        Person<String> person1 = new Person<>("Gurli");
        Person<String> person2 = new Person<>("Hansi");
        Person<String> person3 = new Person<>("Frank");
        Person<String> person4 = new Person<>("Bøllesen");
        ArrayList<Person<String>> personerString = new ArrayList<>();
        personerString.add(person1);
        personerString.add(person2);
        personerString.add(person3);
        personerString.add(person4);

        //Opretter personer og liste personer med navne, klasse.
        Person<Navn> person5 = new Person<>(new Navn("Gurli","Jensen"));
        Person<Navn> person6 = new Person<>(new Navn("Hansi","Hinterseer"));
        Person<Navn> person7 = new Person<>(new Navn("Frank","Jensen" ));
        Person<Navn> person8 = new Person<>(new Navn("Bøllesen","Ølsen"));
        Person<Navn> person9 = new Person<>(new Navn("Bøllesen","Karlsen"));
        ArrayList<Person<Navn>> personerNavne = new ArrayList<>();
        personerNavne.add(person5);
        personerNavne.add(person6);
        personerNavne.add(person7);
        personerNavne.add(person8);
        personerNavne.add(person9);

        //Tjekker om de bliver sorteret rigtigt begge lister.
        System.out.println();
        System.out.println("før og efter sortering, af personliste string");
        System.out.println(personerString);
        Collections.sort(personerString);
        System.out.println(personerString);

        System.out.println();
        System.out.println("Før og efter sortering, af personliste Navne");
        System.out.println(personerNavne);
        Collections.sort(personerNavne);
        System.out.println(personerNavne);




    }

}
