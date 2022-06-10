package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //eksempel på en checked ved, at bruge try-catch.
        /*
        public static void main(String[] args) {
            try {
                File filein = new File("C:/MAD/Ud/tal.txt");
                //	File filein = new File("tal.txt");
                Scanner scan = new Scanner(filein);
                while (scan.hasNext()) {
                    System.out.println(scan.nextLine());
                }
                scan.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
         */

        ////////////////////////////////////////////////////////////////////////////////////////////////7
        //Eksempel på checked, ved at kaste fileNotFoundException, i metodehovedet.
        /*
        public static void main(String[] args) throws FileNotFoundException {
            File filein = new File("C:/MAD/Ud/tal.txt");
            //	File filein = new File("tal.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        }

         */


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Eksempel på uncheked, ved at kaste en nosuchelementException i en if sætning.
        /*
        public E dequeue() {
            if (currentSize == 0) {
                throw new NoSuchElementException("Køen er tom");
            }
            E removed = elements[head];
            head = (head + 1) % elements.length;
            currentSize--;
            return removed;
        }

         */




    }
}
