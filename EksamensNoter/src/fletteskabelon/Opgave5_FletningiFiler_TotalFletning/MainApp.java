package fletteskabelon.Opgave5_FletningiFiler_TotalFletning;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        fletAlleHeltal("C:/Programmering/Filer/Dag34/Opgave5_tal1.txt","C:/Programmering/Filer/Dag34/Opgave5_tal2.txt" ,"C:/Programmering/Filer/Dag34/Opgave5_samletfil.txt");
    }

    /**
     * Laver en sorteret fil i fileNameNy der indeholder alle
     * heltal fra fileName1 og fileName2 (MAX_VALUE skal ikke i
     * resultatet)
     * Krav: filename1 og filename2 er navne på to sorterede filer.
     */
    public static void fletAlleHeltal(String fileName1,String filename2, String fileNameNy){
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
                    printWriter.println(tal1);
                    tal1 = scan1.nextInt();
                }else{
                    //Tal 2 er mindst
                    printWriter.println(tal2);
                    tal2 = scan2.nextInt();
                }
            }

            //Tømmer den den liste der ikke er tom
            while (tal1 < Integer.MAX_VALUE){
                printWriter.println(tal1);
                tal1 = scan1.nextInt();
            }

            while (tal2 < Integer.MAX_VALUE) {
                printWriter.println(tal2);
                tal2 = scan2.nextInt();
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
