package Opgave3_Flet_ArrayOgArrayliste_KunderDårligebetalere;

import Opgave1_FletAfToArraylister_TotalFlet.Customer;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App_Main {

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


        ArrayList<Customer> kunder1 = new ArrayList<>();
        Customer[] kunder2 = new Customer[5];

        kunder1.add(k1);
        kunder1.add(k2);
        kunder1.add(k3);
        kunder1.add(k4);
        kunder1.add(k5);
        kunder1.add(k6);
        kunder1.add(k7);
        kunder1.add(k8);
        Collections.sort(kunder1);
        System.out.println(kunder1);

        kunder2[0] = k3;
        kunder2[1] = k1;
        kunder2[2] = k5;
        kunder2[3] = k7;

        System.out.println(Arrays.toString(kunder2));

        System.out.println(goodCustomers(kunder1,kunder2));

    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * customers fra l1 der ikke er i l2
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
      public static ArrayList goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
          ArrayList<Customer> godekunder = new ArrayList<>();
          int i1 = 0;
          int i2 = 0;
          int j = 0;

          while (i1 < l1.size() && i2 < l2.length) {

              if (l1.get(i1).compareTo(l2[i2]) < 0) {
                  godekunder.add(l1.get(i1));
                  i1++;
              } else if (l1.get(i1).compareTo(l2[i2]) > 0) {
                  i2++;
              } else {
                  i1++;
                  i2++;
              }
          }
          return godekunder;
      }
}
