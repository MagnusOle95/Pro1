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
        quicksortFlagHighToLow(belgisk_flag,0 ,belgisk_flag.length - 1);
    }

    private static void quicksortFlagHighToLow(char[] flag, int low, int high){
        if (low < high){
            int s = sortPartitionHighToLow(flag,low ,high);
            quicksortFlagHighToLow(flag,low ,s - 1);
            quicksortFlagHighToLow(flag,s +1,high);

        }
    }


    private static int sortPartitionHighToLow(char[] flag, int low, int high){
        int e = flag[low];
        int i = low + 1;
        int j = high;

        while (i <= j){
            if (flag[i] >= e){
                i++;
            }
            else if (flag[j] < e){
                j--;
            }
            else{
                swap(flag,i,j);
                i++;
                j--;
            }
        }
        swap(flag,low ,j);

        return j;
    }



    private static void swap(char[] flag, int i, int j) {
        char temp = flag[i];
        flag[i] = flag[j];
        flag[j] = temp;
    }




}
