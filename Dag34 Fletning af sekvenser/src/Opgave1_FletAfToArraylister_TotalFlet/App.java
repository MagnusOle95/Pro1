package Opgave1_FletAfToArraylister_TotalFlet;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        //Opretter kunder.
        Customer k1 = new Customer("Hansen","bent" ,23);
        Customer k2 = new Customer("Larsen","Magnus",26 );
        Customer k3 = new Customer("Astrup","Arne",50);
        Customer k4 = new Customer("Olsen","Jens" ,30 );
        Customer k5 = new Customer("Jensen","Jakob" ,37 );
        Customer k6 = new Customer("Chin","Wing" ,28 );
        Customer k7 = new Customer("Ølstrup","Jan" ,47 );
        Customer k8 = new Customer("Humlebæk","Betty",87);
        Customer k9 = new Customer("Tatika","Frida" ,46);
        Customer k10 = new Customer("Gursen","Ib" ,50 );
        Customer k11 = new Customer("Andersen","Kim" ,25);


        ArrayList<Customer> kunder1 = new ArrayList<>();
        ArrayList<Customer> kunder2 = new ArrayList<>();

        kunder1.add(k1);
        kunder1.add(k2);
        kunder1.add(k3);
        kunder1.add(k4);
        kunder1.add(k5);
        kunder1.add(k6);
        kunder1.add(k7);
        kunder1.add(k8);
        kunder2.add(k9);
        kunder2.add(k10);
        kunder2.add(k11);

        Collections.sort(kunder1);
        Collections.sort(kunder2);

        System.out.println(kunder1);
        System.out.println(kunder2);

        System.out.println(fletAlleKunder(kunder1,kunder2));




    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * kunder fra både l1 og l2
     * Krav: l1 og l2 er sorterede
     */
    public static ArrayList<Customer> fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2){
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        //Fletter så længde der er noget i begge lister//
        while (i1 < l1.size() && i2 < l2.size()){
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0){
                //S1's første tal er mindst
                result.add(l1.get(i1));
                i1++;
            }
            else{ //S2's første tal er mindst
                result.add(l2.get(i2));
                i2++;
            }
        }

        //Tøm den liste der ikke er tom.
        while (i1 < l1.size()){
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()){
            result.add(l2.get(i2));
            i2++;
        }

        return result;
    }

}
