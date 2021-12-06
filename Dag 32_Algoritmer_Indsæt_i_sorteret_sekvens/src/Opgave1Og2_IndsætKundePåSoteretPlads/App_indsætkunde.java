package Opgave1Og2_IndsætKundePåSoteretPlads;

import java.util.ArrayList;
import java.util.Arrays;

public class App_indsætkunde {

    public static void main(String[] args) {

        ArrayList<Customer> kunderAL = new ArrayList<>();
        kunderAL.add(new Customer("Andersen", "Kim", 25));
        kunderAL.add(new Customer("Hansen", "Jens", 28));
        kunderAL.add(new Customer("Jensen", "Frank", 45));
        kunderAL.add(new Customer("Olesen", "Gurli", 30));
        kunderAL.add(new Customer("Ølsen", "Svenur", 52));

        Customer[] kunderA = new Customer[10];
        kunderA[0] = new Customer("Andersen","Kim",25 );
        kunderA[1] = new Customer("Hansen","Jens" ,28 );
        kunderA[2] = new Customer("Jensen","Frank" ,45 );
        kunderA[3] = new Customer("Olesen","Gurli" ,30 );
        kunderA[4] = new Customer("Ølsen","Svenur" ,52 );

        //Tester opgave 1 med insertsort i arraylist//
        System.out.println(kunderAL);
        Customer nykunde = new Customer("Jensen","Frank" ,55 );
        indsætKunde(kunderAL,nykunde);
        System.out.println(kunderAL);

        //Tester opgave 2 med insertsort i et array//
        System.out.println();
        System.out.println(Arrays.toString(kunderA));
        indsætKunde(kunderA,nykunde);
        System.out.println(Arrays.toString(kunderA));




    }

    //Opgave 1
    /**
     * Indsætter kunde i kunder. Listen kunder er sorteret
     * Krav: kunder er sorteret
     *
     */
    public static void indsætKunde(ArrayList<Customer> kunder,Customer kunde){
        boolean found = false;
        int i = 0;
        while (!found && i < kunder.size()){
            if (kunder.get(i).compareTo(kunde) > 0){
                found = true;
            }else{
                i++;
            }
        }
        kunder.add(i,kunde);
    }

    //Opgave 2
    /**
     * Indsætter kunde i kunder. Arrayet kunder er sorteret
     * Krav: kunder er sorteret
     *
     */
    public static void indsætKunde(Customer[] kunder,Customer kunde){
        int j = kunder.length - 1;
        while (j >= 0 && kunder[j] == null){
            j--;
        }
        j++;
        boolean found = false;
        while (!found && j > 0){
            if (kunde.compareTo(kunder[j - 1]) > 0){
                found = true;
            }else{
                kunder[j] = kunder[j - 1];
                j--;
            }
        }
        kunder[j] = kunde;
    }








}
