package Opgav5_BelgiskeFlag_quickstort;

import java.util.ArrayList;

public class Opgave5_BelgiskeFlag_quicksort {

    public static void main(String[] args) {
        char[] flag = new char[]{ 'G','R','S','G','G','R','S','R','G','G','R','S','G'};
        System.out.println(flag);
        belgiskFlag(flag);
        System.out.println(flag);
    }



    public static void belgiskFlag(char[] belgisk_flag){
        int s = 0;
        int r = belgisk_flag.length;
        int g = belgisk_flag.length - 1;
        while (s <= g){
            if (belgisk_flag[s] == 'S'){
                s++;
            }else if (belgisk_flag[g] == 'G'){
                g--;
            }else if (belgisk_flag[g] == 'R'){
                r--;
                swap(belgisk_flag,g ,r );
                g--;
            }else{
                swap(belgisk_flag,s ,g );
                s++;
            }
        }
    }


    private static void swap(char[] flag, int i, int j) {
        char temp = flag[i];
        flag[i] = flag[j];
        flag[j] = temp;
    }




}
