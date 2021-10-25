package model;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        //Opgave 1 og 2 //
        ArrayList<String> names = new ArrayList<>();
        names.add("Pax");
        names.add("Fido");
        names.add("Molly");
        names.add("Pluto");
        names.add("Juno");
        System.out.println(names);

        //Opgave 3//
        names.set(2, "King");
        System.out.println(names);

        //Opgave 4//
        names.remove(1);
        System.out.println(names);

        //Opgave 5//
        names.add(3, "Trine");
        System.out.println(names);

        //Opgave 6//
        names.add(0, "Bella");
        System.out.println(names);

        //Opgave 7//
        System.out.println(names.size());

        //Opgave 8//
        for (String name : names){
            if (name.length() == 5){
                System.out.print(name + ", ");
            }
        }

        System.out.println(); //Mellemrum//

        //Opgave 9//
        for (int i = names.size() - 1; i >= 0; i--)
        System.out.print(names.get(i) + ", ");

        //Mellemrum//
        System.out.println();

        //Opgave 10//
        for (int i = 0; i < names.size() - 1; i++){
            if (i % 2 == 0){
                System.out.print(names.get(i) + ", ");
            }
        }


    }
}
