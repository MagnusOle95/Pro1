package Opgave1_HashSet_BilKlasse;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        //Opretter biler
        Bil bil1 = new Bil("Ap81327","Seat" ,"Mii" ,"Rød");
        Bil bil2 = new Bil("AB29732","Mercedes" ,"A223" ,"Guld");
        Bil bil3 = new Bil("AAAAAAA","Ukendt" ,"Findes ikke" ,"Fyntyre");
        Bil bil4 = new Bil("Test nummer","Test Mearke" ,"Test model" ,"Test farve");
        Bil bil5 = new Bil("Test nummer","Test Mearke" ,"Test model" ,"Test farve");

        //Opretter hashsettet
        Set<Bil> biler = new HashSet<>();

        //Tilføjer biler til hashsættet.
        biler.add(bil1);
        biler.add(bil2);
        biler.add(bil3);
        biler.add(bil4);
        biler.add(bil5);

        //Udskriver sættet.
        System.out.println(biler);


    }
}
