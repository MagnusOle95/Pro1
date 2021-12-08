package Opgave3;

import com.sun.tools.javac.Main;

public class App_Opgave3_strengsøgning {

    public static void main(String[] args) {

        System.out.println(find("Jubiiii",4));

    }

    public static boolean find (String tekst, int antal){
        boolean antalFundet = false;
        int i = 0;
        while (!antalFundet && i < tekst.length() - (antal - 1)){
            if (match(tekst,i,antal)){
                antalFundet = true;
            }else{
                i++;
            }
        }
        return antalFundet;
    }

    public static boolean match(String tekst, int i,int antal){
        boolean foundDiff = false;
        int j = 1;
       while (!foundDiff && j < antal){
           if (tekst.charAt(i) != tekst.charAt(i + j)){
                   foundDiff = true;
               }else{
               j++;
           }
       }
        return !foundDiff;
    }


}
