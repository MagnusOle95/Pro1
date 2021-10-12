package model;

import java.util.ArrayList;

public class MethodsArrayList {
    
    /**
     *
     * @param list
     * @return sums the mumbers in the list using a for loop
     */
    public int sumListe(ArrayList<Integer> list) {
        int resultat = 0;
        for (int i = 0; i < list.size(); i++) {
        	int tal = list.get(i);
            resultat = resultat + list.get(i);
        }
        return resultat;
    }
    
    /**
    *
    * @param list
    * @return sums the mumbers in the list using a forEach loop
    */
    public int sumListe2(ArrayList<Integer> list) {
        int resultat = 0;
        for (int tal : list) {
            resultat = resultat + tal;
        }
        return resultat;
    }
    
    /**
     *
     * @param list
     * @return index at the first even number
     */
    public int hasEvenAtIndex(ArrayList<Integer> list) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            if (list.get(i) % 2 == 0) {
                index = i;
            }
            i++;
        }
        return index;
    }

    //Opgave 2.1 Retunere det mindste tal i listen//
    public int minTal (ArrayList<Integer> list){
        int min = list.get(0);
        for (Integer tal : list){
            if (tal < min){
                min = tal;
            }
        }
        return min;
    }

    //Opgave 2.2 Retunere gennemsnittet af tallet i arraylisten//
    public double average(ArrayList<Integer> list){
        double sum = 0;
        for (Integer tal : list){
            sum = sum + tal;
        }
        sum = sum / list.size();
        return sum;
    }

    //Opgave 2.3 Retunere antallet af gange 0 er i arrayet//
    public int countZeores(ArrayList<Integer> list){
        int sum = 0;
        for (Integer tal : list){
            if (tal == 0){
                sum++;
            }
        }
        return sum;
    }

    //Opgave 2.4 udskifter alle lige tal med 0//
    public void swapEvenWithZero(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.set(i, 0);
            }
        }
    }

    //Opgave 2.5 retunere en ny liste, der indeholder alle de lige tal fra list//
    //Husk at denne her metode virker ikke hvis Metoden swapwithZero er aktiv i main//
    public ArrayList<Integer> aEvenList(ArrayList<Integer> list){
        ArrayList<Integer> nyList = new ArrayList<>();
        for (Integer tal : list){
            if (tal % 2 == 0 && tal != 0){
                nyList.add(tal);
            }
        }
        return nyList;
    }
}
