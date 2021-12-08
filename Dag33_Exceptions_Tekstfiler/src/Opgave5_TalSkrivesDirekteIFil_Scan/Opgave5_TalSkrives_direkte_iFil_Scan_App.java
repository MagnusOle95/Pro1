package Opgave5_TalSkrivesDirekteIFil_Scan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave5_TalSkrives_direkte_iFil_Scan_App {

    public static void main(String[] args) {
        try {
            String fileName = "C:/Programmering/Filer/Opgave5Tal.txt";
            PrintWriter printWriter = new PrintWriter(fileName);

            //Fra tastatur til fil//
            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv de tal du vil have i filen. Hvis der skriver -1 betyder det du vil afslutte");
            int tal = 0;
            boolean stop = false;

            while (!stop){
                tal = scan.nextInt();

                if ( tal == -1){
                    stop = true;
                }else if (tal > 0){
                    printWriter.println(tal);
                }
            }

            //Flush og closeScanner
            printWriter.flush();
            printWriter.close();
            scan.close();
            System.out.println("Filen er lavet");

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



}
