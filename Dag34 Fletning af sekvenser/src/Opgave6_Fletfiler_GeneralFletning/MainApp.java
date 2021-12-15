package Opgave6_Fletfiler_GeneralFletning;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        fletAlleEnsTal("C:/Programmering/Filer/Dag34/Opgave6_tal1.txt","C:/Programmering/Filer/Dag34/Opgave6_tal2.txt" ,"C:/Programmering/Filer/Dag34/Opgave6_samletfil.txt");
    }

    /**
     * Laver en sorteret fil i fileNameNy der indeholder alle
     * heltal fra fileName1 og fileName2 (MAX_VALUE skal ikke i
     * resultatet)
     * Krav: filename1 og filename2 er navne på to sorterede filer.
     */
    public static void fletAlleEnsTal(String fileName1,String filename2, String fileNameNy){
        try {
            File file1 = new File(fileName1);
            Scanner scan1 = new Scanner(file1);
            File file2 = new File(filename2);
            Scanner scan2 = new Scanner(file2);
            File newFile = new File(fileNameNy);
            PrintWriter printWriter = new PrintWriter(newFile);

            int tal1 = scan1.nextInt();
            int tal2 = scan2.nextInt();

            while (tal1 < Integer.MAX_VALUE && tal2 < Integer.MAX_VALUE){

                if (tal1 < tal2){
                    //Tal1 er midndst
                    tal1 = scan1.nextInt();
                }
                else if (tal1 > tal2){
                    //Tal 2 er mindst
                    tal2 = scan2.nextInt();
                }
                else{
                    printWriter.println(tal1);
                    tal1 = scan1.nextInt();
                    tal2 = scan2.nextInt();
                }
            }


            //Flusher tal ned i fil og stopper scannerne
            scan1.close();
            scan2.close();
            printWriter.flush();
            printWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
