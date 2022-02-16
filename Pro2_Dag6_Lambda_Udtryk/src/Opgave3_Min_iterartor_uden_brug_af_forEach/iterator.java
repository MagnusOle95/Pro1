package Opgave3_Min_iterartor_uden_brug_af_forEach;

import java.util.*;

public class iterator {

    public static void main(String[] args) {


        //A
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(20);
        list.add(50);
        list.add(100);
        list.add(7);
        list.add(20);
        list.add(25);
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int tal = itr.next();
            System.out.print(tal + ", ");
        }

        //Mellemrum
        System.out.println();

        //B
        Map<Integer, Integer> maplist = new HashMap<>();
        maplist.put(2, 4);
        maplist.put(3, 9);
        maplist.put(4, 16);
        maplist.put(5, 25);
        maplist.put(6, 36);

        Iterator<Integer> itr2 = maplist.keySet().iterator();
        while (itr2.hasNext()) {
            int key = itr2.next();
            System.out.print("(" + key + "," + maplist.get(key) + "), ");
        }


    }




}
