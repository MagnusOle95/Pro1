package Opgave1_BubbleSort;

import java.util.Arrays;

public class App_BubbleSort {

    public static void main(String[] args) {

        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        System.out.println(Arrays.toString(s));
        sortNames(s);
        System.out.println(Arrays.toString(s));
    }

    public static void swap (String[] tabel, int i, int j){
        String temp = tabel[i];
        tabel[i] = tabel[j];
        tabel[j] = temp;
    }

    public static void sortNames(String[] tabel){
        for (int i = tabel.length - 1; i >= 0; i--){
            for (int j = 0; j <= i - 1; j++){
                if (tabel[j].compareTo(tabel[j + 1]) > 0){
                    swap(tabel,j ,j + 1);
                }
            }
        }
    }

    


}
