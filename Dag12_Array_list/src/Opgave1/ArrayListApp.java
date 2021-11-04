package Opgave1;

import java.util.ArrayList;

public class ArrayListApp {

    //Opgave 1.1//
    public static void main(String[] args) {

        ArrayList<String> list;
        list = new ArrayList<>();

        //Opgave 1.2 Tilføger personer til arraylisten//
        list.add("Hans");
        list.add("Viggo");
        list.add("jens");
        list.add("Børge");
        list.add("Bent");

        //Opgave 1.3//
        System.out.println(list.size());

        //Opgave 1.4//
        list.add(2, "Jane");

        //Opgave 1.5//
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(); //Mellemrum//

        //Opgave 1.6//
        list.remove(1);

        //Opgave 1.7//
        list.add(0, "Pia");

        //Opgave 1.8//
        list.add("Ib");

        //Opgave 1.9//
        System.out.println(list.size());

        System.out.println(); //Mellemrum//

        //Opgave 1.10//
        list.set(2, "Hansi");

        //Opgave 1.11//
        System.out.println(list.size());

        System.out.println(); //Mellemrum//

        //Opgave 1.12//
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(); //Mellemrum//

        //Opgave 1.13//
        for (int i = 0; i < list.size(); i++){
            String navn = list.get(i);
            System.out.println(navn.length());
        }

        System.out.println(); //Mellemrum//

        //Opgave 1.14//
        for (String navn : list){
            System.out.println(navn.length());
        }
    }
}
