package Opgave3_LæsOpgave2Fil_Indsæt_i_Array_og_udprint;

import com.sun.tools.javac.Main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opgave3_løsFil_UdprintArray_App {

    public static void main(String[] args) {

        ArrayList<Integer> talFraFil = new ArrayList<>();
        ArrayList<Integer> omvendttal = new ArrayList<>();


        try {
            File filein = new File("C:/Programmering/Filer/Opgave2Tal.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()){
                int tal = Integer.parseInt(scan.nextLine());
                talFraFil.add(tal);
            }
            scan.close();

            for (int i = talFraFil.size() - 1; i >= 0 ; i--){
                omvendttal.add(talFraFil.get(i));
            }
            System.out.println(omvendttal);








        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}



