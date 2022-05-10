package Opgave3_Person_Navn_String;

import java.util.ArrayList;
import java.util.Collections;

public class GeneriskPersonDemo {

    public static void main(String[] args) {

        //Opretter navn til person.
        Navn Bl = new Navn("Bent","Larsen");

        //Opretter person.
        Person person = new Person(Bl);
        Person person2 = new Person("Frank");
        System.out.println(person.getNavn());
        System.out.println(person2.getNavn());

        //Laver array og indsætter personer.
        ArrayList<Person> personer = new ArrayList<>();
        //Opretter flere personer.
        Person person3 = new Person("Gurli");
        Person person4 = new Person("Hansi");
        Navn hh = new Navn("Hans","Hansen");
        Person person5 = new Person(hh);

        //Tilføjer personer til arrayet.
        personer.add(person);
        personer.add(person2);
        personer.add(person3);
        personer.add(person4);
        personer.add(person5);

        System.out.println(personer);

        Collections.sort(personer);



    }

}
