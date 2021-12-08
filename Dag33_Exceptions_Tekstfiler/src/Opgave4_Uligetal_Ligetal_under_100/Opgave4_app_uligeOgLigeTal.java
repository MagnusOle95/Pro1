package Opgave4_Uligetal_Ligetal_under_100;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave4_app_uligeOgLigeTal {

    public static void main(String[] args) {

        try {
            String filename = "C:/Programmering/Filer/Opgave4Tal.txt";
            PrintWriter printWriter = new PrintWriter(filename);

            //Indsæt tal i filen
            for (int i = 1; i <= 100; i++){
                if (i % 2 == 1){
                    printWriter.println(i);
                }
            }
            //Flush og skriv filen
            printWriter.flush();
            printWriter.close();
            System.out.println("Filen er lavet");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
