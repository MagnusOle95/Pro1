package Opgave6_flyt_søgteTal_TilVenstre;

import java.util.ArrayList;

public class App_FlytSøgeTal_TilVenstre {

    public static void main(String[] args) {

        ArrayList<Integer> tal = new ArrayList<>();
        tal.add(6);
        tal.add(4);
        tal.add(8);
        tal.add(13);
        tal.add(2);

        System.out.println("Test af array: " + tal);

        System.out.println("Køre metode og finder hvor 13 er: " + find(tal,13 ));

        System.out.println("Test af array efter metode: " + tal);

    }

/**
 * returner positionen på n efter det evt. er flyttet én position til venstre. Hvis n ikke findes
 * returneres -1.
 **/
    public static int find(ArrayList<Integer> list, int n){
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < list.size()){
            int k = list.get(i);
            if (k == n){
                list.remove(i);
                list.add(i - 1,k);
                indeks = i;
            }else{
                i++;
            }
        }
        return indeks;
    }



}
