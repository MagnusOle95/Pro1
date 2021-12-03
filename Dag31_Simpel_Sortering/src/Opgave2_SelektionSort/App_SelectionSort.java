package Opgave2_SelektionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class App_SelectionSort {

    public static void main(String[] args) {

        Customer[] kunderA = new Customer[5];
        kunderA[0] = new Customer("Andersen","Kim",25 );
        kunderA[1] = new Customer("Hansen","Jens" ,28 );
        kunderA[2] = new Customer("Jensen","Frank" ,45 );
        kunderA[3] = new Customer("Olesen","Gurli" ,30 );
        kunderA[4] = new Customer("Ølsen","Svenur" ,52 );

        ArrayList<Customer> kunderAL = new ArrayList<>();
        kunderAL.add(new Customer("Andersen","Kim",25 ));
        kunderAL.add(new Customer("Hansen","Jens" ,28 ));
        kunderAL.add(new Customer("Jensen","Frank" ,45 ));
        kunderAL.add(new Customer("Olesen","Gurli" ,30 ));
        kunderAL.add(new Customer("Ølsen","Svenur" ,52 ));


    }

    public static void SwapArraylist(ArrayList<Customer> tabel, int i, int j){
        Customer temp = tabel.get(i);
        tabel.set(i, tabel.get(j));
        tabel.set(j,temp);
    }

    public static void swapArray(Customer[] tabel, int i, int j){
        Customer temp = tabel[i];
        tabel[i] = tabel[j];
        tabel[]
    }




}
