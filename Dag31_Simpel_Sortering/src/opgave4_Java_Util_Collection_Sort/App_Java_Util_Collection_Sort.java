package opgave4_Java_Util_Collection_Sort;

import Opgave2_SelektionSort.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App_Java_Util_Collection_Sort {

    public static void main(String[] args) {

        Customer[] kunderA = new Customer[5];
        kunderA[0] = new Customer("Andersen", "Kim", 25);
        kunderA[1] = new Customer("Hansen", "Jens", 28);
        kunderA[2] = new Customer("Jensen", "Frank", 45);
        kunderA[3] = new Customer("Olesen", "Gurli", 30);
        kunderA[4] = new Customer("Alsen", "Svenur", 52);

        ArrayList<Customer> kunderAL = new ArrayList<>();
        kunderAL.add(new Customer("Andersen", "Kim", 25));
        kunderAL.add(new Customer("Hansen", "Jens", 28));
        kunderAL.add(new Customer("Jensen", "Frank", 45));
        kunderAL.add(new Customer("Olesen", "Gurli", 30));
        kunderAL.add(new Customer("Alsen", "Svenur", 52));

        //Tester array metoden
        //Virker ikke med et normalt array

        //Tester metoden i en arraylist
        System.out.println(kunderAL);
        Collections.sort(kunderAL);
        System.out.println(kunderAL);


    }

}
