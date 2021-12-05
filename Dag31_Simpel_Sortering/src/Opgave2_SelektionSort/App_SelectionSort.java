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
        kunderA[4] = new Customer("Alsen","Svenur" ,52 );

        ArrayList<Customer> kunderAL = new ArrayList<>();
        kunderAL.add(new Customer("Andersen","Kim",25 ));
        kunderAL.add(new Customer("Hansen","Jens" ,28 ));
        kunderAL.add(new Customer("Jensen","Frank" ,45 ));
        kunderAL.add(new Customer("Olesen","Gurli" ,30 ));
        kunderAL.add(new Customer("Alsen","Svenur" ,52 ));

        //Tester array metoden
        System.out.println(Arrays.toString(kunderA));
        selectionSortArray(kunderA);
        System.out.println(Arrays.toString(kunderA));

        //Tester arraylist metoden
        System.out.println(kunderAL);
        selectionSortArrayList(kunderAL);
        System.out.println(kunderAL);
    }

    public static void SwapArraylist(ArrayList<Customer> tabel, int i, int j){
        Customer temp = tabel.get(i);
        tabel.set(i, tabel.get(j));
        tabel.set(j,temp);
    }

    public static void swapArray(Customer[] tabel, int i, int j){
        Customer temp = tabel[i];
        tabel[i] = tabel[j];
        tabel[j] = temp;
    }


    public static void selectionSortArrayList(ArrayList<Customer> list){
        for (int i = 0; i < list.size(); i++){
            int minPos = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).compareTo(list.get(minPos)) < 0){
                    minPos = j;
                }
            }
            SwapArraylist(list,i ,minPos);
        }
    }

    public static void selectionSortArray(Customer[] list){
        for (int i = 0; i < list.length; i++){
            int minPos = i;
            for (int j = i + 1; j < list.length; j++){
                if (list[j].compareTo(list[minPos]) < 0){
                    minPos = j;
                }
            }
            swapArray(list,i ,minPos);
        }
    }





}
