package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(
                List.of(45, 27, -12, 15, -8, -4)
        );
        System.out.println(list);

        System.out.println("Indsætter 20 på plads 3");
        list.set(3, 20);
        System.out.println(list);

        System.out.println("Sætter, 17 på plads 2 mellem 27 og -12");
        list.add(2, 17);
        System.out.println(list);

        System.out.println("Sletter indhold på indeksplads 1");
        list.remove(1);
        System.out.println(list);

        System.out.println("Tilføger 34 forest i arrayet");
        list.add(0, 34);
        System.out.println(list);

        System.out.println("Tilføger 29 bagerst i arrayet");
        list.add(29);
        System.out.println(list);


    }

    /**
     * Return the sum of all numbers in the list.
     * Return 0 if the list is empty.
     */
    public static int sum(ArrayList<Integer> list) {
        return -1;
    }

    /**
     * Return the minimum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int minimum(ArrayList<Integer> list) {
        return -1;
    }

    /**
     * Return the maximum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int maximum(ArrayList<Integer> list) {
        return -1;
    }

    /**
     * Return the average of the numbers in the list.
     * Pre: The list is not empty.
     */
    public static double average(ArrayList<Integer> list) {
        return -1;
    }

    /** Return the number of negative numbers in the list. */
    public static int negative(ArrayList<Integer> list) {
        return -1;
    }

    /** Return a new list containing the positive numbers in the list. */
    public static ArrayList<Integer> positive(ArrayList<Integer> list) {
        return null;
    }
}
