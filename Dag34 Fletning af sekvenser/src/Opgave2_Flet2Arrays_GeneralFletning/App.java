package Opgave2_Flet2Arrays_GeneralFletning;

import javax.xml.transform.Result;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] list1 = {2, 4, 6, 8, 10, 12, 14};
        int[] list2 = {1, 2, 4, 5, 6, 9, 12, 17};

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(fællesTal(list1,list2 )));


    }
    /**
     * Returnerer et sorteret array der indeholder alle
     * elementer l1 og l2 har til fælles
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static int[] fællesTal(int[] l1, int[] l2){
        int[] result;

        if (l1.length > l2.length){
            result = new int[l2.length];
        }else{
            result = new int[l1.length];
        }

        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < l1.length && i2 < l2.length){

            if (l1[i1] < l2[i2]){
                i1++;

            } else if (l1[i1] > l2[i2]){
                i2++;
            }
            else{
                result[j] = l1[i1];
                i1++;
                i2++;
                j++;
            }
        }
        return result;
    }

}


