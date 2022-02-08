package Opgave3;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave3_Lav_Gennemsnits_af_array {

    public static void main(String[] args) {
        int[] list = {5, 10, 5, 6, 4, 9, 8};

        System.out.println(Arrays.toString(prefixAverage(list)));



    }

    public static double[] prefixAverage(int[] inputTal){
     double[] prefixAverageList = new double[inputTal.length];

        double sum = 0;
        double avg = 0;

     for (int i = 0; i < inputTal.length; i++){
         sum += inputTal[i];
         avg = sum / (i + 1);
         prefixAverageList[i] = avg;
     }
     return prefixAverageList;
    }







}
