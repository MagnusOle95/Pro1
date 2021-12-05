package opgave3_InsertionSort;

import Opgave2_SelektionSort.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class App_SelectionSort {

    public static void main(String[] args) {

        Customer[] kunderA = new Customer[5];
        kunderA[0] = new Opgave2_SelektionSort.Customer("Andersen", "Kim", 25);
        kunderA[1] = new Opgave2_SelektionSort.Customer("Hansen", "Jens", 28);
        kunderA[2] = new Opgave2_SelektionSort.Customer("Jensen", "Frank", 45);
        kunderA[3] = new Opgave2_SelektionSort.Customer("Olesen", "Gurli", 30);
        kunderA[4] = new Opgave2_SelektionSort.Customer("Alsen", "Svenur", 52);

        ArrayList<Customer> kunderAL = new ArrayList<>();
        kunderAL.add(new Opgave2_SelektionSort.Customer("Andersen", "Kim", 25));
        kunderAL.add(new Opgave2_SelektionSort.Customer("Hansen", "Jens", 28));
        kunderAL.add(new Opgave2_SelektionSort.Customer("Jensen", "Frank", 45));
        kunderAL.add(new Opgave2_SelektionSort.Customer("Olesen", "Gurli", 30));
        kunderAL.add(new Opgave2_SelektionSort.Customer("Alsen", "Svenur", 52));

        //Tester array metoden
        System.out.println(Arrays.toString(kunderA));
        insertionSortArray(kunderA);
        System.out.println(Arrays.toString(kunderA));


        //Tester arraylist metoden
        System.out.println(kunderAL);
        insertionSortArrayList(kunderAL);
        System.out.println(kunderAL);

    }


    public static void insertionSortArrayList(ArrayList<Customer> list) {
        for (int i = 1; i < list.size(); i++) {
            Customer next = list.get(i);
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (next.compareTo(list.get(j - 1)) > 0 || next.compareTo(list.get(j - 1)) == 0) {
                    found = true;
                } else {
                    list.set(j, list.get(j - 1));
                    j--;
                }
            }
            list.set(j, next);
        }
    }


    public static void insertionSortArray(Customer[] list) {
        for (int i = 0; i < list.length; i++) {
            Customer next = list[i];
            int j = i;
            boolean found = false;
            while (!found && j > 0){
                if (next.compareTo(list[j - 1]) > 0 || next.compareTo(list[j - 1]) == 0){
                    found = true;
                }else{
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = next;
        }

    }
}
